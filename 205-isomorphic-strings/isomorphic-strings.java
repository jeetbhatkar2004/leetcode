class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(t.length() != s.length()){
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        int i = 0;
        while(i < s.length()){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), t.charAt(i));
            }
            if(!map2.containsKey(t.charAt(i))){
                map2.put(t.charAt(i), s.charAt(i));
            }
            if(map.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
            if(map2.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }
            i++;
        }
        return true;
    }
}