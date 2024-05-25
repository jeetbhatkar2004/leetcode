class Solution {
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void helper(int[] nums, int start, List<List<Integer>> result){
        if(start == nums.length-1){
            result.add(arrayToList(nums));
            return;
        }
        for(int i = start; i < nums.length;i++){
            swap(nums, start, i);
            helper(nums, start+1, result);
            swap(nums, start, i);
        }
    }
    public List<Integer> arrayToList(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return list;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 1){
            return result;
        }
        helper(nums, 0, result);
        return result;
        
    }
}