class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int curr = 0;
        int min = Integer.MAX_VALUE;
        while (j < nums.length){
            curr = curr + nums[j];
            if(curr < target){
                j++;
                continue;
            }
            else{
                while(i <= j && curr >= target){
                    min = Math.min(min, j-i+1);
                    curr = curr - nums[i];
                    i++;
                }
                j++;

            }
        }
        if (min == Integer.MAX_VALUE){
            return 0;
        }
        else{
            return min;
        }
    }
}