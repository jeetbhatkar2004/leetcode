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
    int max = 0;
    void helper(TreeNode root, int level){
        if(root == null){
            return;
        }
        level++;
        max = Math.max(max, level);
        helper(root.left, level);
        helper(root.right, level);
    }
    public int maxDepth(TreeNode root) {
        helper(root, 0);
        return max;
    }
}