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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int reverse = 0;
        Queue<TreeNode> qu = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        qu.add(root);
        while(qu.isEmpty() == false){
            List<Integer> currentlevel = new ArrayList<>();
            int size = qu.size();
            for(int i = 0; i<size; i++){
                TreeNode curr = qu.poll();
                    if(curr.right != null){
                        qu.add(curr.right);
                    }
                    if(curr.left != null){
                        qu.add(curr.left);
                    }
                currentlevel.add(curr.val);
            }
            if(reverse % 2 == 0){
                Collections.reverse(currentlevel);
            }
            reverse++;
            result.add(currentlevel);
            
        }
        return result;

    }
}