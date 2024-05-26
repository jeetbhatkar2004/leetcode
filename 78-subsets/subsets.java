class Solution {
    public void helper(int[] nums,List<List<Integer>> result, int start,List<Integer> curr ){
        result.add(new ArrayList<>(curr)); 
        for(int i = start ; i < nums.length; i++){
            curr.add(nums[i]);
            helper(nums, result, i+1, curr);
            curr.remove(curr.size() -1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int i = 0;
        List<Integer> curr = new ArrayList<>();
        helper(nums, result, i, curr);
        return result;    
    }
}