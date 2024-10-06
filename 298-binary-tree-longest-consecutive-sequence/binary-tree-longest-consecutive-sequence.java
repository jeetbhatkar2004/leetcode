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
    int max = 0;
    void helper(TreeNode root, TreeNode prev, int level){
        if(root == null){
            return;
        }
        if(prev != root && prev.val + 1 == root.val){
            max = Math.max(max, level);
            level++;
        }
        else{
            level = 1;
        }
        helper(root.left, root, level);
        helper(root.right, root, level);
    }
    public int longestConsecutive(TreeNode root) {
        helper(root, root, 1);
        return max+1;
    }   
}