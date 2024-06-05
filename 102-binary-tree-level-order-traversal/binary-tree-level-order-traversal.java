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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if(root == null){
            return result;
        }
        qu.add(root);
        while(qu.isEmpty() == false){
            int size = qu.size();
            List<Integer> temp = new ArrayList<>();
            while(size > 0){
                TreeNode curr = qu.poll();
                if(curr.left != null){
                    qu.add(curr.left);
                }
                if(curr.right != null){
                    qu.add(curr.right);
                }

                temp.add(curr.val);
                size--;
            }
            result.add(temp);
        }
        return result;
}}