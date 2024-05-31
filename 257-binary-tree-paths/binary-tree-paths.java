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
    List<String> result = new ArrayList<>();
    void helper(TreeNode root, StringBuilder curr){
        if(root == null){
            return;
        }
        int len = curr.length();
        curr.append(root.val + "");
        if(root.left == null && root.right == null){
            result.add(curr.toString());
        }
        else{
        curr.append("->");
        helper(root.left, curr);
        helper(root.right, curr);
        }
        curr.setLength(len);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder curr = new StringBuilder();
        helper(root, curr);
        return result;
        
    }
}