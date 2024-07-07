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
    void helper(TreeNode rootleft, TreeNode rootright, int even){
        if(rootleft == null || rootright == null){
            return;
        }
        if(even % 2 == 1){
            int temp = rootleft.val;
            rootleft.val = rootright.val;
            rootright.val = temp;
        }
        helper(rootleft.left, rootright.right, even + 1);
        helper(rootleft.right, rootright.left, even + 1);
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        helper(root.left, root.right, 1);
        return root;
    }
}