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
    public List<Integer> rightSideView(TreeNode root) {
        TreeNode curr = null;
        Queue<TreeNode> qu = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        qu.add(root);
        while(!qu.isEmpty()){
            int size = qu.size();
            while(size > 0){
                curr = qu.poll();
                if(curr.left != null){
                    qu.add(curr.left);
                }
                if(curr.right != null){
                    qu.add(curr.right);
                }
                size--;
            }
            result.add(curr.val);
        }
        return result;

        
    }
}