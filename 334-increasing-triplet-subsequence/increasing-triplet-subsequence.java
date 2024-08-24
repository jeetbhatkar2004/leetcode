class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i = 0;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        while(i < nums.length){
            if(min1 > nums[i]){
                min1 = nums[i];
            }
            else if (min2 > nums[i] && nums[i] != min1){
                min2 = nums[i];
            }
            if(nums[i] > min1 && nums[i] > min2){
                return true;
            }
            i++;
        }
        return false;

    }
}