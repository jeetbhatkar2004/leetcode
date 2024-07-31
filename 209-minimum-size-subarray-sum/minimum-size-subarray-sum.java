class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int j = 0;
        int i = 0;
        int curr = 0;
        while(j < nums.length){
            curr = curr + nums[j];
            while(curr >= target){
                min = Math.min(min, j-i+1);
                curr = curr - nums[i];
                i++;
            }
            j++;
        }
        if(min == Integer.MAX_VALUE){
            return 0;
        }
        else{
            return min;
        }
    }
}