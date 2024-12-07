class Solution {
    List<List<Integer>> result = new ArrayList<>();
    void helper(int[] nums, int start){
        if(start == nums.length){
            result.add(new ArrayList<>(toList(nums)));
        }
        for(int i = start; i < nums.length; i++){
            swap(nums, i , start);
            helper(nums, start + 1);
            swap(nums, start, i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        helper(nums, 0);
        return result;   
    }
    List<Integer> toList(int[] nums){
        List<Integer> res = new ArrayList();
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
}