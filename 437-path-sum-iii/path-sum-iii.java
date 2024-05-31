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
    int count = 0;
    List<TreeNode> list = new ArrayList<>();
    void helper(TreeNode root, int target, Long curr){
        // 3 is here:
        if(root == null){
            return;
        }
        //3'S TEMP = 5
        Long temp = curr;
        curr = curr + root.val;
        //3'S CURR = 8
        if(curr == target){
            count++;
        }
        helper(root.left, target, curr); //WE ARE HERE FROM 5 BACK FROM 3 -> 
        helper(root.right, target, curr);
        //3's CURR = 5
        curr = temp;

    }
    void dfs(TreeNode root){
        if(root == null){
            return;
        }
        list.add(root);
        dfs(root.left);
        dfs(root.right);
    }
    public int pathSum(TreeNode root, int targetSum) {
        dfs(root);
        for(int i = 0; i < list.size(); i++){
            helper(list.get(i), targetSum, 0l);
        }
        return count;
    }
}