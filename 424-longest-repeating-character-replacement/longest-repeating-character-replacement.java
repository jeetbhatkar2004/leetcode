class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26]; // Array to count occurrences of each character
        int maxCount = 0; // Maximum count of a single character in the current window
        int maxLength = 0; // Maximum length of the substring found
        int left = 0; // Left pointer of the sliding window

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            count[currentChar - 'A']++; // Increment the count of the current character
            maxCount = Math.max(maxCount, count[currentChar - 'A']); // Update the maxCount

            // Calculate the number of characters to be replaced
            int windowLength = right - left + 1;
            int replacements = windowLength - maxCount;

            // If replacements are more than k, shrink the window from the left
            if (replacements > k) {
                count[s.charAt(left) - 'A']--; // Decrement the count of the leftmost character
                left++; // Move the left pointer to the right
            }

            // Update the maximum length found
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}