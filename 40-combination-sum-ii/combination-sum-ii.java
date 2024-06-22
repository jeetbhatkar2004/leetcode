class Solution {
    
    List<List<Integer>> result = new ArrayList<>();

    void helper(int[] candidates, int target, int index, List<Integer> curr, int sum){
        if(sum == target){
            result.add(new ArrayList<>(curr));
            return;
        }
        Set<Integer> hashset = new HashSet<>();
        for(int i = index; i < candidates.length; i++){
            if(hashset.contains(candidates[i])){
                continue;
            }
            if(sum > target){
                continue;
            }
            curr.add(candidates[i]);
            hashset.add(candidates[i]);
            helper(candidates, target, i + 1, curr, sum + candidates[i]);
            curr.remove(curr.size() -1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            List<Integer> curr = new ArrayList<>();
            helper(candidates, target, 0, curr, 0);
            return result;
    }
}