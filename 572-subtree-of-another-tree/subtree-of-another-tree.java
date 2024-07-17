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
    List<TreeNode> list = new ArrayList<>();
    boolean valid = true;
    void helper(TreeNode root){
        if(root == null){
            return;
        }
        list.add(root);
        helper(root.left);
        helper(root.right);
    }
    void dfs(TreeNode root, TreeNode sub){
        if(root == null && sub == null){
            return;
        }
        if(root == null || sub == null){
            valid = false;
            return;
        }
        if(root.val != sub.val){
            valid = false;
            return;
        }
        dfs(root.left, sub.left);
        dfs(root.right, sub.right);
        
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        helper(root);
        for(TreeNode curr : list){
            valid = true;
            dfs(curr, subRoot);
            if(valid){
                return true;
            }
        }
        return false;
        
    }
}