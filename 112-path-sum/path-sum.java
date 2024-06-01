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
    private boolean haspath = false;
    public void helper(TreeNode curr, int target, int count) {
        if (curr == null) {
            return;
        }
        count += curr.val;
        if(curr.left == null && curr.right == null){
            if(count == target){
                haspath = true;
            }
        }
        helper(curr.left, target, count);
        helper(curr.right, target, count);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        helper(root, targetSum, 0);
        return haspath;
    }
}