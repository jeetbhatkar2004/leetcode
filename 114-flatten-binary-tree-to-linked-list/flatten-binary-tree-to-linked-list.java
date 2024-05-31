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
    void helper(List<TreeNode> arr, TreeNode root){
        if(root == null){
            return;
        }
        arr.add(root);
        helper(arr, root.left);
        helper(arr, root.right);
    }
    public void flatten(TreeNode root) {
        TreeNode head = root;
        List<TreeNode> arr = new ArrayList<>();
        helper(arr, root);
        int i = 1;
        while(i < arr.size()){
            head.right = arr.get(i);
            head.left = null;
            head = head.right;
            i++;
        }

    }
}