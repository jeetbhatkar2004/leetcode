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
    private int helper(TreeNode curr) {
        if (curr == null){
            return 0;
        }
        int left = helper(curr.left);
        int right = helper(curr.right);
        max = Math.max(max, left+right);
        return 1+Math.max(left, right);
    }



    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return max;
    }

}