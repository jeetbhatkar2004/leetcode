import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    StringBuilder preorder = new StringBuilder();
    int count = 0;

    void helper(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        if (root == null) {
            return;
        }
        qu.add(root);
        while (!qu.isEmpty()) {
            int size = qu.size();
            TreeNode curr = qu.poll();
            if (curr == null) {
                preorder.append("null,");
                count++;
            } else {
                count = 0;
                preorder.append(curr.val + ",");
                qu.add(curr.left);
                qu.add(curr.right);
            }
        }
        preorder.setLength(preorder.length() - 1);
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        preorder.setLength(0); // Clear previous contents
        helper(root);
        return preorder.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) {
            return null;
        }
        String[] nodes = data.split(",");
        if (nodes[0].equals("null")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (!queue.isEmpty() && i < nodes.length) {
            TreeNode current = queue.poll();
            if (!nodes[i].equals("null")) {
                current.left = new TreeNode(Integer.parseInt(nodes[i]));
                queue.add(current.left);
            }
            i++;
            if (i < nodes.length && !nodes[i].equals("null")) {
                current.right = new TreeNode(Integer.parseInt(nodes[i]));
                queue.add(current.right);
            }
            i++;
        }
        return root;
    }

   
}
