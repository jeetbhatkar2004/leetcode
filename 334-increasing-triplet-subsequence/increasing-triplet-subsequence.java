class Solution {
    public boolean increasingTriplet(int[] nums) {
        int i = 0;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        while(i < nums.length){
            if(nums[i] <= min1){
                min1 = nums[i];
            }
            else if(nums[i] <= min2){
                min2 = nums[i];
            }
            else{
                return true;
            }
            i++;
        }
        return false;
    }
}