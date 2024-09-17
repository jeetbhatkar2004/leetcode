/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    void helper(TreeNode root, int target, int runningsum){
        if(root == null){
            return;
        }
        runningsum = runningsum + root.val;
        curr.add(root.val);
        if(target == runningsum && root.left == null && root.right == null){
            result.add(new ArrayList<>(curr));
        }
        helper(root.left, target, runningsum);
        helper(root.right, target, runningsum);
        curr.remove(curr.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        helper(root, targetSum, 0);
        return result;
    }
}