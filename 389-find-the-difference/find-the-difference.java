class Solution {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> set  = new HashMap<>();
        int i = 0;
        while(i < s.length()){
            if(set.containsKey(s.charAt(i))){
                int temp = set.get(s.charAt(i));
                temp++;
                set.put(s.charAt(i), temp);
            }
            else{
                set.put(s.charAt(i), 1);
            }
            i++;
        }
        i=0;
        while(i<t.length()){
            if(set.containsKey(t.charAt(i))){
                int temp = set.get(t.charAt(i));
                temp--;
                if(temp == 0){
                    set.remove(t.charAt(i));
                }
                else{
                set.put(t.charAt(i), temp);}
            }
            else{
                return t.charAt(i);
            }
            i++;
        }
        if(set.size() != 0){
            for(Map.Entry<Character, Integer> curr : set.entrySet()){
                return curr.getKey();
            }
        }
        return 'a';

        
        
    }
}