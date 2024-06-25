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
    int max = 0;
    void helper(TreeNode root, int depth){
        if(root == null){
            return;
        }
        if(depth == max){
            result = result + root.val;
            return;
        }
        helper(root.left, depth + 1);
        helper(root.right, depth + 1);
    }
    void maxDepth(TreeNode root, int depth){
        if(root == null){
            return;
        }
        max = Math.max(max, depth);
        maxDepth(root.left, depth + 1);
        maxDepth(root.right, depth + 1);

    }
    public int deepestLeavesSum(TreeNode root) {
        maxDepth(root, 0);
        helper(root, 0);
        return result;
    }
}