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
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    
    void helper(TreeNode root, int target, int count){
        if(root == null){
            return;
        }
        count = count + root.val;
        curr.add(root.val);
        if(count == target && root.left == null && root.right == null){
            result.add(new ArrayList<>(curr));
        }
        helper(root.left, target, count);
        helper(root.right, target, count);
        curr.remove(curr.size() - 1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        helper(root, targetSum, 0);
        return result;
        
    }
}