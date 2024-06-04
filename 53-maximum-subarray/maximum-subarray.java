class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        int i = 0;
        while(i < nums.length){
            curr = curr + nums[i];
            max = Math.max(max, curr);
            if(curr < 0){
                curr = 0;
            }
            i++;
        }

        return max;
    }
}