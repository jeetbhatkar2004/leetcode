class Solution {
    boolean helper(Map<Character, Integer> map_s, Map<Character, Integer> map_t){
        for(Map.Entry<Character, Integer> curr : map_t.entrySet()){
            if(!map_s.containsKey(curr.getKey()) || curr.getValue() > map_s.get(curr.getKey())){
                return false;
            }
        }
        return true;
    }
    public String minWindow(String s, String t) {
        if(t.length() > s.length()){
            return "";
        }
        StringBuilder curr = new StringBuilder();
        String result = "";
        int min = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        Map<Character, Integer> map_t = new HashMap<>();
        Map<Character, Integer> map_s = new HashMap<>();
        for(int k = 0; k < t.length(); k++){
            if(map_t.containsKey(t.charAt(k))){
                int temp = map_t.get(t.charAt(k));
                temp++;
                map_t.put(t.charAt(k), temp);
            }
            else{
                map_t.put(t.charAt(k), 1);
            }
        }
        while(j < s.length()){
            curr.append(s.charAt(j));
            if(map_t.containsKey(s.charAt(j))){
                if(map_s.containsKey(s.charAt(j))){
                    int temp = map_s.get(s.charAt(j));
                    temp++;
                    map_s.put(s.charAt(j), temp);
                }
                else{
                    map_s.put(s.charAt(j), 1);
                }
            }
            while(helper(map_s, map_t)){
                if(min > j - i + 1){
                    min = j - i + 1;
                    result = curr.toString();
                }
                if(map_s.containsKey(s.charAt(i))){
                    int temp = map_s.get(s.charAt(i));
                    temp--;
                    if(temp == 0){
                        map_s.remove(s.charAt(i));
                    }
                    else{
                        map_s.put(s.charAt(i), temp);
                    }
                }
                curr.deleteCharAt(0);
                i++;
            }
            j++;
        }
        return result;
    }
}