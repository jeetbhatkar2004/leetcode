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
    Map<Integer, Integer> map = new HashMap<>();
    int helper(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        int res = left + right + root.val;
        if(map.containsKey(res)){
            int temp = map.get(res);
            temp++;
            map.put(res, temp);
        }
        else{
            map.put(res, 1);
        }
        return left + right +root.val;
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        helper(root);
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for(Map.Entry<Integer, Integer> curr : map.entrySet()){
            max = Math.max(max, curr.getValue());
        }
        for(Map.Entry<Integer, Integer> curr : map.entrySet()){
            if(curr.getValue() == max){
                list.add(curr.getKey());
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}