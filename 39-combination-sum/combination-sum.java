class Solution {
    public void helper(int[] nums, int target, List<List<Integer>> result, int i,List<Integer> curr, int total ) {
        if(total == target){
            result.add(new ArrayList<Integer>(curr));
            return;
        }
        if(total > target || i >= nums.length){
            return;
        }
        curr.add(nums[i]);
        helper(nums, target, result, i, curr, total + nums[i]);
        curr.remove(curr.size() -1);
        helper(nums, target, result, i+1, curr, total);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(candidates, target, result, 0,curr, 0);
        return result;
        
    }
}