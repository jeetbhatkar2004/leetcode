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
    void helper(TreeNode root, int[] arr){
        if(root == null){
            return;
        }
        int[] arr1 = new int[2];
        int[] arr2 = new int[2];
        helper(root.left, arr1);
        helper(root.right, arr2);
        arr[0] = arr1[0] + arr2[0] + root.val;
        arr[1] = arr1[1] + arr2[1] + 1;
        int temp = arr[0]/arr[1];
        if(temp == root.val){
            count++;
        }
    }
    public int averageOfSubtree(TreeNode root) {
        helper(root, new int[] {0,0});
        return count;
        
    }
}