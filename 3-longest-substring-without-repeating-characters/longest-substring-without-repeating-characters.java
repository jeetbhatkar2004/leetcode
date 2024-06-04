class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hash = new HashSet<>();
        int i = 0;
        int j = 0; //Iterator
        int max = 0;
        int curr = 0;
        while(j < s.length()){
            if(hash.contains(s.charAt(j))){
                while(i < s.length() && hash.contains(s.charAt(j))){
                    hash.remove(s.charAt(i));
                    i++;
                    curr--;
                }
            }
            hash.add(s.charAt(j));
            curr++;
            j++;
            max = Math.max(curr, max);
        }
        return max;
        
    }
}