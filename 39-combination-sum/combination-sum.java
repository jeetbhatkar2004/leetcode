class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    void helper(int[] candidates, int target, int start){
        if(target == 0){
            result.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0){
            return;
        }
        for(int i = start; i < candidates.length; i++){
            curr.add(candidates[i]);
            helper(candidates, target - candidates[i], i);
            curr.remove(curr.size() - 1);
        }

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates, target, 0);
        return result;
    }
}