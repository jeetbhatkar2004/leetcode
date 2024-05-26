class Solution {
    public void helper(int[] nums, int target,int start, List<List<Integer>> result, List<Integer> curr ){
        if(target == 0){
            result.add(new ArrayList<>(curr)); 
            return;
        }
        for(int i = start; i < nums.length; i++){
            if(nums[i] <= target){
                curr.add(nums[i]);
                helper(nums, target - nums[i], i, result, curr);
                curr.remove(curr.size() -1);
            }

        }
    }
    public int sum(List<Integer> curr){
        int i = 0;
        int sum = 0;
        while(i < curr.size()){
            sum = sum + curr.get(i);
            i++;
        }
        return sum;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(candidates, target, 0, result, curr);
        return result;
        
    }
}