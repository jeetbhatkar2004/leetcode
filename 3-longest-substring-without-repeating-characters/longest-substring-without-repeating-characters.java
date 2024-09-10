class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int max = 0;
        while(j < s.length()){
            while(i < s.length() && set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;

        
    }
}