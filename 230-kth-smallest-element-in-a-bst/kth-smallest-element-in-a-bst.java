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
import java.util.Stack;

class Solution {
    int val;
    int count = 0;
    void helper(TreeNode root, int k){
        if(root == null){
            return;
        }
        helper(root.left, k);
        count++;
        if(count == k){
            val = root.val;
        }
        helper(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return val;

    }
}
