class Solution {
    List<List<Integer>> result = new ArrayList<>();
    void helper(int[] candidates, int target, int sum, int start, List<Integer> curr){
        if(sum == target){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start; i < candidates.length; i++){
            if(i > start && candidates[i] == candidates[i-1]){
                continue;
            }
            if(sum + candidates[i] > target){
                continue;
            }
            curr.add(candidates[i]);
            helper(candidates, target, sum + candidates[i], i + 1, curr);
            curr.remove(curr.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates, target, 0, 0, new ArrayList<>());
        return result;
    }
}