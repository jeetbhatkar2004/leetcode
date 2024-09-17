class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int result = 0;
        while(i < s.length() ){
            if(map.containsKey(s.charAt(i))){
                int temp = map.get(s.charAt(i));
                temp++;
                map.put(s.charAt(i), temp);
            }
            else{
                map.put(s.charAt(i), 1);
            }
            while(map.size() > 2){
                int size = map.get(s.charAt(j));
                size--;
                if(size <= 0){
                    map.remove(s.charAt(j));
                }
                else{
                    map.put(s.charAt(j), size);
                }
                j++;
            }
            result = Math.max(result, i - j + 1);
            i++;
        }
        return result;
    }
}