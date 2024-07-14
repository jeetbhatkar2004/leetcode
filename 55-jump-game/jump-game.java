class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int maxReach = 0;
        
        for (int i = 0; i < n; i++) {
            if (i > maxReach) {
                return false;  // If current index is beyond the farthest reachable point, return false
            }
            
            // Update the maximum reachable index
            for (int j = i; j <= maxReach && j < n; j++) {
                maxReach = Math.max(maxReach, j + nums[j]);
                
                // If we can reach or exceed the last index, return true
                if (maxReach >= n - 1) {
                    return true;
                }
            }
        }
        
        return maxReach >= n - 1;
    }
}
