class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> map = new HashSet<>();
        int i = 0;
        int j = 0;
        int max = 0;
        int curr = 0;
        while(j < s.length()){
            while(i < s.length() && map.contains(s.charAt(j))){
                curr --;;
                map.remove(s.charAt(i));
                i++;

            }
            curr++;
            map.add(s.charAt(j));
            j++;
            max = Math.max(max, curr);
        }
        return max;
        
    }
}