class Solution {
    void helper(int[] candidates, List<Integer> curr, List<List<Integer>> result, int count, int target, int start){
        if(count == target){
            result.add(new ArrayList(curr));
            return;
        }
        if(count > target){
            return;
        }
        for(int i = start; i < candidates.length; i++){
            curr.add(candidates[i]);
            helper(candidates, curr, result, count + candidates[i], target, i);
            curr.remove(curr.size() - 1);
        }

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        helper(candidates, curr, result, 0, target, 0);
        return result;
        
    }
}