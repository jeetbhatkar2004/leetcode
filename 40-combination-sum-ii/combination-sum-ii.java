class Solution {
    List<List<Integer>> result = new ArrayList<>();
    void helper(int[] candidates, int target, int sum, int start, List<Integer> curr){
        if(sum == target){
            result.add(new ArrayList<>(curr));
            return;
        }
        Set<Integer> set = new HashSet<>();
        for(int i = start; i < candidates.length; i++){
            if(set.contains(candidates[i])){
                continue;
            }
            if(sum + candidates[i] > target){
                continue;
            }
            set.add(candidates[i]);
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