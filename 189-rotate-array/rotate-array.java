class Solution {
    private void helper(int[] nums, int start, int end){
        if(start >= end){
            return;
        }
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        helper(nums, start+1, end-1);
    }
    public void rotate(int[] nums, int k) { 
        k = k % nums.length;
        System.out.println(k);
        helper(nums, 0, nums.length - 1);
        helper(nums, 0, k-1);
        helper(nums, k, nums.length - 1);
}}