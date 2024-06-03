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
    int count;
    List<TreeNode> list = new ArrayList<>();
    public void helper(TreeNode root, int target, Long curr){
        if(root == null){
            return;
        }
        curr = curr + root.val;
        if(curr == target){
            count++;
        }
        helper(root.left, target, curr);
        helper(root.right, target, curr);
    }
   public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        list.add(root);
        dfs(root.left);
        dfs(root.right);

}
    public int pathSum(TreeNode root, int targetSum) {
        dfs(root);
        for(int i = 0; i<list.size() ; i++){
            helper(list.get(i), targetSum, 0l);
        }
        return count;
    }
}