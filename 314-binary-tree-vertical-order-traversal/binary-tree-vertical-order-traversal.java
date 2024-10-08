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
    class Pair{
        TreeNode node;
        int col;
        Pair(TreeNode node, int col){
            this.node = node;
            this.col = col;
        }
    }
    List<List<Integer>> result = new ArrayList<>();
    Map<Integer, List<Integer>> map = new HashMap<>();
    Queue<Pair> qu = new LinkedList<>();
    public List<List<Integer>> verticalOrder(TreeNode root) {
        if(root == null){
            return result;
        }
        qu.add(new Pair(root, 0));
        while(!qu.isEmpty()){
            Pair curr = qu.poll();
            int currval = curr.node.val;
            int currcol = curr.col;
            if(map.containsKey(currcol)){
                map.get(currcol).add(currval);
            }
            else{
                map.put(currcol, new ArrayList<>());
                map.get(currcol).add(currval);
            }
            if(curr.node.left != null){
                qu.add(new Pair(curr.node.left, currcol - 1));
            }
            if(curr.node.right != null){
                qu.add(new Pair(curr.node.right, currcol + 1));
            }
        }
        List<Integer> sortedKeys = new ArrayList<>(map.keySet());
        Collections.sort(sortedKeys);
        for(int i = 0; i < sortedKeys.size(); i++){
            result.add(map.get(sortedKeys.get(i)));
        }
        return result;


    }
}