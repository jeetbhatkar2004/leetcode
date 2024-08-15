class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int onescount = 0;
        int max = 0;
        while(j < nums.length){
            if(nums[j] == 1){
                onescount++;
            }
            int window = j - i + 1;
            int replacements = window - onescount; // number of 0's flipped
            if(replacements > k){
                while(nums[i] != 0){
                    if(nums[i] == 1){
                        onescount--;
                    }
                    i++;
                }
                i++;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;

    }
}