class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26]; 
        int maxCount = 0; 
        int maxLength = 0; 
        int left = 0; 

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            count[currentChar - 'A']++; 
            maxCount = Math.max(maxCount, count[currentChar - 'A']); 

            int windowLength = right - left + 1;
            int replacements = windowLength - maxCount;

            while (replacements > k) {
                count[s.charAt(left) - 'A']--; 
                left++; 
                windowLength = right - left + 1;
                replacements = windowLength - maxCount;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}