class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int curr = 0;
        while(j < nums.length){
            curr = curr + nums[j];
            while(curr >= target){
                result = Math.min(result, j - i + 1);
                curr = curr - nums[i];
                i++;
            }
            j++;
        }
        if(result == Integer.MAX_VALUE){
            return 0;
        }
        return result;
    }
}