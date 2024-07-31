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
    public int max;
    void helper(TreeNode root, int curr){
        if (root == null){
            return;
        }
        max = Math.max(max, curr);
        helper(root.left, curr + 1);
        helper(root.right, curr + 1);
    }
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        helper(root, 1);
        return max;
        
}}