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
    List<Integer> result = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    int max = 0;
    void helper(TreeNode root){
        if(root == null){
            return;
        }
        if(map.containsKey(root.val)){
            int temp = map.get(root.val);
            temp++;
            map.put(root.val, temp);
            max = Math.max(temp, max);
        }
        else{
            map.put(root.val, 1);
            max = Math.max(max, 1);
        }
        helper(root.left);
        helper(root.right);

    }
    public int[] findMode(TreeNode root) {
        helper(root);
        for(Map.Entry<Integer, Integer> curr : map.entrySet()){
            if(curr.getValue() == max){
                result.add(curr.getKey());
            }
        }
        int[] res = new int[result.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = result.get(i);
        }
        return res;
        
    }
}