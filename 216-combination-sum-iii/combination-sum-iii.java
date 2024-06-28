class Solution {
    List<List<Integer>> result = new ArrayList<>();
    void helper(int k, int n, int count, int start, List<Integer> curr){
        if(count == n && curr.size() == k){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i = start; i < 10; i++){
            curr.add(i);
            helper(k, n, count + i, i + 1, curr);
            curr.remove(curr.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        helper(k, n, 0, 1, new ArrayList<>());
        return result;
    }
}