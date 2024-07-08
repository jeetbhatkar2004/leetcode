import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    List<List<Integer>> result = new ArrayList<>();

    void helper(int[] candidates, int target, int index, List<Integer> curr, int sum) {
        if (sum == target) {
            result.add(new ArrayList<>(curr));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            // Skip duplicates
            if (i > index && candidates[i] == candidates[i - 1]) continue;
            curr.add(candidates[i]);
            helper(candidates, target, i + 1, curr, sum + candidates[i]);
            curr.remove(curr.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> curr = new ArrayList<>();
        helper(candidates, target, 0, curr, 0);
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> combinations = sol.combinationSum2(candidates, target);
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
