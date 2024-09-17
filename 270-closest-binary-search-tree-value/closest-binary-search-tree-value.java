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
    class Pair{
        int node;
        double diff;
        Pair(int node, double diff){
            this.node = node;
            this.diff = diff;
        }
    }
    Pair result = new Pair(Integer.MAX_VALUE,Integer.MAX_VALUE);
    void helper(TreeNode root, double target){
        if(root == null){
            return;
        }
        if(result.diff > Math.abs(target - root.val) || (result.diff == Math.abs(target - root.val)) && result.node > root.val){
            result.node = root.val;
            result.diff = Math.abs(target - (double)root.val);
        }
        if(root.val > target){
            helper(root.left, target);
        }
        else{
            helper(root.right, target);
        }
    }
    public int closestValue(TreeNode root, double target) {
        helper(root, target);
        return result.node;
    }
}