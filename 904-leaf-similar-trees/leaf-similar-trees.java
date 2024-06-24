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

    List<Integer> helper(TreeNode root, List<Integer> result){
        if(root == null){
            return result;
        }
        if(root.left == null && root.right == null){
            result.add(root.val);
            return result;
        }
        helper(root.left, result);
        helper(root.right, result);
        return result;
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> array1 = helper(root1, new ArrayList<>());
        List<Integer> array2 = helper(root2,  new ArrayList<>());
        return array1.equals(array2);
        
    }
}