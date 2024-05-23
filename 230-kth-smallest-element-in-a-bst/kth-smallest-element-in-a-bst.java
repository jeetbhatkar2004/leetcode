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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        
        while (current != null || !stack.isEmpty()) {
            // Go to the leftmost node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            
            // Current node must be the leftmost
            current = stack.pop();
            k--;
            
            // If we have reached the k-th smallest, return its value
            if (k == 0) {
                return current.val;
            }
            
            // Move to the right subtree
            current = current.right;
        }
        
        // If k is out of bounds, return -1 or throw an exception
        throw new IllegalArgumentException("k is out of the bounds of the tree");
    }
}
