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
    int index = 0;
    public TreeNode helper(int[] preorder, Map<Integer, Integer> hash, int start, int end){
        if(start > end){
            return null;
        }
        TreeNode curr = new TreeNode(preorder[index]);
        index++;
        curr.left = helper(preorder, hash, start, hash.get(curr.val) - 1);
        curr.right = helper(preorder, hash, hash.get(curr.val) + 1, end);
        return curr;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int i = 0;
        Map<Integer, Integer> hash = new HashMap<>();
        if(inorder.length < 1){
            return null;
        }
        while(i < inorder.length){
            hash.put(inorder[i], i);
            i++;
        }
        return helper(preorder, hash, 0, preorder.length -1);
    
    }
}