/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    void addRightPointer(List<Node> list){
        for(int i = 0; i < list.size() - 1; i++){
            list.get(i).next = list.get(i + 1);
        }
    }
    public Node connect(Node root) {
        if(root == null){
            return null;
        }
        Queue<Node> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            List<Node> temp = new ArrayList<>();
            int size = qu.size();
            while(size > 0){
                Node curr = qu.poll();
                temp.add(curr);
                if(curr.left != null){
                    qu.add(curr.left);
                    qu.add(curr.right);
                }
                size--;
            }
            addRightPointer(temp);
        }
        return root;
    }
}