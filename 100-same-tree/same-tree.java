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
    private boolean hmm = true;
    private void helper(TreeNode p, TreeNode q){
        if(p == null && q== null){
            return;
        }
        if(q == null || p == null){
            hmm = false;
            return;
        }
        if(q.val != p.val){
            hmm = false;
            return;
        }
        helper(p.left, q.left);
        helper(p.right, q.right);
        
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        helper(p,q);
        return hmm;
    }
}