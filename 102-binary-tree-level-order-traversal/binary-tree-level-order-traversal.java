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
        int count = 0;
        if(root == null){
            return result;
        }
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(qu.isEmpty() == false){         
            List<Integer> curr = new ArrayList<>();
            int size = qu.size();
            while(size > 0){
                TreeNode temp = qu.poll();
                if(temp.left != null){
                    qu.add(temp.left);
                }
                if(temp.right != null){
                    qu.add(temp.right);
                }

                curr.add(temp.val);
                size--;
            }
            result.add(curr);
        }
        return result;
    }
}