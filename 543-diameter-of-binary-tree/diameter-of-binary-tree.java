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
    private int max;
    private int height(TreeNode root){
        if(root == null){
            return 0;
        }
        return 1+(Math.max(height(root.left), height(root.right)));


    }
    private int helper(TreeNode root){
        if(root == null){
            return max;
        }
        int curr = height(root.left) + height(root.right);
        max = Math.max(max,curr);
        helper(root.left);
        helper(root.right);
        return max;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return helper(root);
    }

}