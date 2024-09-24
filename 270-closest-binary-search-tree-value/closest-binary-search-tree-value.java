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
    int result = Integer.MAX_VALUE;
    void helper(TreeNode root, double target){
        if(root == null){
            return;
        }
        helper(root.left, target);
        if(Math.abs(result - target) > Math.abs(root.val - target)){
            result = root.val;
        }
        helper(root.right, target);
    }
    public int closestValue(TreeNode root, double target) {
        helper(root, target);
        return result;
    }
}