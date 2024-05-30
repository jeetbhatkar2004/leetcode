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
    int min = Integer.MAX_VALUE;
    int prev = Integer.MAX_VALUE;
    void helper(TreeNode node){
        if(node == null){
            return;
        }
        helper(node.left);
        min = Math.min(min, Math.abs(node.val - prev));
        prev = node.val;
        helper(node.right);

    }
    public int minDiffInBST(TreeNode root) {
        helper(root);
        return min;
        
    }
}