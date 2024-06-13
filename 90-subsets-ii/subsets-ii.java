class Solution {
    void helper(List<Integer> curr, List<List<Integer>> result, int start, int[] nums){
        result.add(new ArrayList(curr));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]){
                continue;
            }
            curr.add(nums[i]);
            helper(curr, result, i+1, nums);
            curr.remove(curr.size() - 1);
        }

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        helper(curr, result, 0, nums);
        return result;
        
    }
}