class Solution {
    boolean helper(Map<Character, Integer> map_t, Map<Character, Integer> map_s){
        for(Map.Entry<Character, Integer> curr : map_t.entrySet()){
            if(!map_s.containsKey(curr.getKey()) || curr.getValue() > map_s.get(curr.getKey())){
                return false;
            }
        }
        return true;
    }       
    public String minWindow(String s, String t) {
        Map<Character, Integer> map_t = new HashMap<>();
        Map<Character, Integer> map_s = new HashMap<>();
        for(int i = 0; i < t.length(); i++){
            if(map_t.containsKey(t.charAt(i))){
                int temp = map_t.get(t.charAt(i));
                map_t.put(t.charAt(i), temp + 1);
            }
            else{
                map_t.put(t.charAt(i), 1);
            }
        }
        int i = 0;
        int j = 0;
        StringBuilder running = new StringBuilder();
        String result = "";
        int min = Integer.MAX_VALUE;
        while(j < s.length()){
            char curr = s.charAt(j);
            running.append(curr);
            if(map_s.containsKey(curr)){
                int temp = map_s.get(curr);
                map_s.put(curr, temp + 1);
            }
            else{
                map_s.put(curr, 1);
            }
            while(helper(map_t, map_s)){
                if(min > running.length()){
                    result = new String(running.toString());
                    min = running.length();
                }
                char toremove = s.charAt(i);
                int freq = map_s.get(toremove);
                freq--;
                if(freq == 0){
                    map_s.remove(toremove);
                }
                else{
                    map_s.put(toremove, freq);
                }
                running.deleteCharAt(0);
                i++;
            }
            j++;
        }
        return result;

    }
}