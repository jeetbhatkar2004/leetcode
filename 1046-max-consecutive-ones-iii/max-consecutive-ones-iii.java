class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int zeros = 0;
        int max = 0;
        while(j < nums.length){
            if(nums[j] == 0){
                zeros++;
            }
            while(zeros > k){
                if(nums[i] == 0){
                    zeros--;
                }
                i++;
            }
            max = Math.max(max, j - i + 1);
            j++;
        }
        return max;
    }
}