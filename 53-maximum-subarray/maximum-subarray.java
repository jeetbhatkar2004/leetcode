class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int max = nums[0]; // Initialize max to the first element of the array
        int curr = 0;
        
        for (int j = 0; j < nums.length; j++) {
            curr = curr + nums[j];
            max = Math.max(curr, max);
            curr = Math.max(curr, 0); // Reset curr to 0 if it becomes negative
        }
        
        return max;
    }
}
