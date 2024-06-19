class Solution {
    void helper(int[] nums, List<List<Integer>> result, List<Integer> curr, int start){
        result.add(new ArrayList<>(curr));
        for(int i = start ; i < nums.length; i++){
            curr.add(nums[i]);
            helper(nums, result, curr, i + 1);
            curr.remove(curr.size() - 1);
        }

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(nums, result, curr, 0);
        return result;
    }
}