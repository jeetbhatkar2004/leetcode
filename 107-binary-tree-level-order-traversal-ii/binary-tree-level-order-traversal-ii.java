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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        Stack<List<Integer>> stack = new Stack<>();
        if(root == null) return result;
        qu.add(root);
        while(!qu.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = qu.size();
            while(size > 0){
                TreeNode curr = qu.poll();
                level.add(curr.val);
                if(curr.left != null){
                    qu.add(curr.left);
                }
                if(curr.right != null){
                    qu.add(curr.right);
                }
                size--;
            }
            stack.push(new ArrayList<>(level));
        }
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }
}