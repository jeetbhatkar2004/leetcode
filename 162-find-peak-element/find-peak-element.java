class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1 || nums[0] > nums[1]){
            return 0;
        }
        if(nums[nums.length - 1] > nums[nums.length - 2]){
            return nums.length - 1;
        }
        int start = 0;
        int end = nums.length - 1;
        while( start < end ){
            int mid = start + (end - start)/2;
            if(nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]){
                return mid;
            }
            if(nums[mid] <= nums[mid - 1]){
                end = mid;
            }
            else{
                start = mid;
            }
        }
        return -1;
        
    }
}