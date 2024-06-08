class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int curr = 0;
        int min = Integer.MAX_VALUE;
        while(j < nums.length){
            curr = curr + nums[j];
            if(curr >= target){
                int temp = j-i+1;
                min = Math.min(min, temp);
                while(curr >= target && i <= j){
                    temp = j-i+1;
                    min = Math.min(min, temp);
                    curr = curr - nums[i];
                    i++;
                }
            }
            j++;
        }
        if(min == Integer.MAX_VALUE){
            return 0;
        }
        return min;
    }
}