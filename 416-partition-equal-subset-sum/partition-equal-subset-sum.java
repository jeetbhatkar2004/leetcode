class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        if(sum % 2 != 0){
            return false;
        }
        int target = sum/2;
        boolean[][] dp = new boolean[nums.length + 1][target + 1];
        for(int i = 1; i <= nums.length; i++){
            for(int j = 0; j <= target; j++){
                if(j == 0){
                    dp[i][j] = true;
                    continue;
                }
                if(j < nums[i-1]){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[nums.length][target];
        
    }
}