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

public class Solution {
    private boolean valid = true;
    private TreeNode prev = null;
    public boolean isValidBST(TreeNode root) {
        helper(root);
        return valid;
    }
    
    public void helper(TreeNode root) {
        if(root == null){
            return;
        }        
        helper(root.left);
        if(prev != null && root.val <= prev.val){
            valid = false;
        }
        prev = root;
        helper(root.right);
    }
}