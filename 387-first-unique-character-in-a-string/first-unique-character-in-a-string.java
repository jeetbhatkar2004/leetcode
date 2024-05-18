class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        while(i < s.length()){
            if (map.containsKey(s.charAt(i))){
                int temp = map.get(s.charAt(i));
                temp++;
                map.put(s.charAt(i), temp);
            }
            else{
                map.put(s.charAt(i), 1);
            }
            i++;
        }
        i = 0;
        while(i < s.length()){
            if (map.get(s.charAt(i)) == 1){
                return i;
            }
            i++;
        }
        return -1;

    }
}