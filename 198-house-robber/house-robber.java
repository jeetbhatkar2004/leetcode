class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length + 2];
        int i = 0;
        dp[0] = 0;
        dp[1] = 0;
        while(i < nums.length){
            dp[i+2] = Math.max(nums[i] + dp[i], dp[i+1]);
            i++;
        }
        return dp[nums.length + 1];
        
    }
}