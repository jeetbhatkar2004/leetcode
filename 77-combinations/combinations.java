class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    void helper(int n, int k, int start){
        if(curr.size() == k){
            List<Integer> temp = new ArrayList<>(curr);
            result.add(temp);
            System.out.println(temp);
            return; 
        }
        for(int i = start; i <= n; i++){
            curr.add(i);
            helper(n, k, i + 1);
            curr.remove(curr.size() - 1);
        }

    }
    public List<List<Integer>> combine(int n, int k) {
        helper(n, k, 1);
        return result;
    }

}