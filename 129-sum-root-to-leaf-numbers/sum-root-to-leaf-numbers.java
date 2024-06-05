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
    int result = 0;
    public void helper(TreeNode curr, int val){
        if(curr == null){
            return;
        }
        val = 10*val + curr.val;
        if(curr.left == null && curr.right == null){
            result += val;
        }
        helper(curr.left, val);
        helper(curr.right, val);
    }
    public int sumNumbers(TreeNode root) {
        helper(root, 0);     
        return result;
    }
}