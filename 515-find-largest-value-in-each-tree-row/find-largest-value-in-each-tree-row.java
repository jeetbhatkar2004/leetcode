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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if(root == null){
            return result;
        }
        qu.add(root);
        while(!qu.isEmpty()){
            int max = Integer.MIN_VALUE;
            int size = qu.size();
            while(size > 0){
                TreeNode curr = qu.poll();
                max = Math.max(curr.val, max);
                if(curr.left != null){
                    qu.add(curr.left);
                }
                if(curr.right != null){
                    qu.add(curr.right);
                }
                size--;
            }
            result.add(max);
        }
        return result;
    }
}