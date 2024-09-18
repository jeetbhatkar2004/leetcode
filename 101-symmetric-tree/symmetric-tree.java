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
    boolean valid = true;
    void helper(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return;
        }
        if(left == null || right == null){
            valid = false;
            return;
        }
        if(left.val != right.val){
            valid = false;
            return;
        }
        helper(left.left, right.right);
        helper(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        helper(root.left, root.right);
        return valid;
    }   
}