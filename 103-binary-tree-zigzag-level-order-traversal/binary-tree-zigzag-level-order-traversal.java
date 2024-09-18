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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null){
            return result;
        }
        int level = 0; //for even, left -> right, else right -> left
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int size = qu.size();
            List<Integer> currLevel = new ArrayList<>();
            while(size > 0){
                TreeNode curr = qu.poll();
                if(curr.left != null){
                    qu.add(curr.left);
                }
                if(curr.right != null){
                    qu.add(curr.right);
                }
                size--;
                currLevel.add(curr.val);
            }
            if(level % 2 == 0){
                result.add(currLevel);
            }
            else{
                Collections.reverse(currLevel);
                result.add(currLevel);
            }
            level++;
        }
        return result;
    }
}