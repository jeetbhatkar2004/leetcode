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
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if(root == null){
            return result;
        }
        TreeNode curr = root;
        qu.add(root);
        while(qu.isEmpty() == false){
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