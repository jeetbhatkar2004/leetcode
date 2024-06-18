class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        helper(result, nums, 0);
        return result;
        
    }
    private void helper(List<List<Integer>> result, int[] nums, int start){
        if (start == nums.length){
            result.add(toList(nums));

        }
            for(int i = start; i < nums.length; i++){
                swap(i, start, nums);
                helper(result, nums, start+1);
                swap(i, start, nums);
            }
        
    }
    private void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private List<Integer> toList(int[] nums){
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            temp.add(nums[i]);
        }
        return temp;
    }
}