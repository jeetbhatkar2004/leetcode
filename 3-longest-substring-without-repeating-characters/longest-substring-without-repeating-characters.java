class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int curr = 0;
        int max = 0;
        while(i < s.length()){
            while(set.contains(s.charAt(i))){
                curr--;
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            curr++;
            i++;
            max = Math.max(max, curr);
        }
        return max;
        
    }
}