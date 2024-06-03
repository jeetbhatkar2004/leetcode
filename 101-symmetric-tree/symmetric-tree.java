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
    boolean val = true;
    public void helper(TreeNode a, TreeNode b){
        if(a == null && b == null){
            return;
        }
        if(a == null || b == null){
            val = false;
            return;
        }
        if(a.val != b.val){
            val = false;
            return;
        }
        helper(a.left, b.right);
        helper(a.right, b.left);

    }
    public boolean isSymmetric(TreeNode root) {
        helper(root.left, root.right);
        return val;
    }   
}