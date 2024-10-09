class Solution {
    List<List<Integer>> result = new ArrayList<>();
    void helper(int[] nums, int start){
        if (start == nums.length){
            result.add(toArray(nums));
            return;
        }
        for(int i = start; i < nums.length; i++){
            swap(nums,i, start);
            helper(nums, start + 1);
            swap(nums, i, start);
        }
    }
    List<Integer> toArray(int[] nums){
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            res.add(nums[i]);
        }
        return res;
    }
    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        helper(nums, 0);
        return result;
        
    }


}