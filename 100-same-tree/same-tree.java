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
    private boolean helper(TreeNode p, TreeNode q){
        if(p == null && q== null){
            return true;
        }
        if(p != null && q!= null && p.val == q.val){
            return helper(p.left, q.left) && helper(p.right, q.right);
        }
        hmm = false;
        return false;
        
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        helper(p,q);
        return hmm;

    }
}