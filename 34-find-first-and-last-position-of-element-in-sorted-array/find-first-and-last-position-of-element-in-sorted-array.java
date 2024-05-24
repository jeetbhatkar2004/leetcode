class Solution {
    public int first(int[] nums, int target){
        int start = 0;
        int result = Integer.MAX_VALUE;
        int end = nums.length -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                result = Math.min(result, mid);
            }
            if(nums[mid] >= target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        if(result == Integer.MAX_VALUE){
            return -1;
        }
        return result;
    }
    public int last(int[]nums, int target){
        int start = 0;
        int result = Integer.MIN_VALUE;
        int end = nums.length -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                result = Math.max(result, mid);
            }
            if(nums[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        if(result == Integer.MIN_VALUE){
            return -1;
        }
        return result;

    }
    public int[] searchRange(int[] nums, int target) {
        int f = first(nums, target);
        int l = last(nums, target);
        return new int[] {f,l};
        
    }
}