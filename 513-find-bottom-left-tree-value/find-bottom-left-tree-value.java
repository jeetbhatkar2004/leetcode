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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        TreeNode curr = null;
        while(!qu.isEmpty()){
            int size = qu.size();
            while(size > 0){
                curr = qu.poll();
                if(curr.right != null){
                    qu.add(curr.right);
                }
                if(curr.left != null){
                    qu.add(curr.left);
                }
                size--;
            }
        }
        return curr.val;
    }
}