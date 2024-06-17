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
    int count = 0;
    void helper(TreeNode root, int target){
        if(root == null){
            return;
        }
        count = count + root.val;
        curr.add(root.val);
        if(root.left == null && root.right == null){
            if(count == target){
                System.out.println(count);
                result.add(new ArrayList<>(curr));
            }
        }
        helper(root.left, target);
        helper(root.right, target);
        curr.remove(curr.size() -1);
        count = count - root.val;
        
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        helper(root, targetSum);
        return result;
    }
}