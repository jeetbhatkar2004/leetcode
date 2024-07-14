class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean[] dp = new boolean[n];
        dp[0] = true;  // Start position is always reachable
        
        for (int i = 0; i < n; i++) {
            if (dp[i]) {  // If position i is reachable
                int maxJump = Math.min(i + nums[i], n - 1);  // Ensure we don't go out of bounds
                for (int j = i + 1; j <= maxJump; j++) {
                    dp[j] = true;  // Mark all reachable positions from i as reachable
                }
            }
        }
        
        return dp[n - 1];  // Return whether the last position is reachable
    }
}
