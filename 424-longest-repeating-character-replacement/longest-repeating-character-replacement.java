class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int i = 0;
        int max = 0;
        int j = 0;
        int result = 0;
        while(i < s.length()){
            arr[s.charAt(i) - 'A']++;
            max = Math.max(max, arr[s.charAt(i) - 'A']);
            int window = i - j + 1;
            int replacements = window - max;
            while(replacements > k){
                arr[s.charAt(j)-'A']--;
                j++;
                window = i - j + 1;
                replacements = window - max;
            }
            result = Math.max(result, i-j+1);
            i++;
        }
        return result;
    }
}