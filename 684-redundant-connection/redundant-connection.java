import java.util.*;

class Solution {
    private Map<Integer, List<Integer>> graph = new HashMap<>();

    private boolean dfs(int node, int parent, Set<Integer> visited) {
        visited.add(node);
        if (graph.containsKey(node)) {
            for (int neighbor : graph.get(node)) {
                if (neighbor == parent) {
                    continue; 
                }
                if (visited.contains(neighbor)) {
                    return true;
                }
                dfs(neighbor, node, visited);
            }
        }
        return false;
    }

    public int[] findRedundantConnection(int[][] edges) {
        int[] result = new int[2];
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(u).add(v);
            graph.get(v).add(u);

            Set<Integer> visited = new HashSet<>();
            if (dfs(u, -1, visited)) {
                result = edge;
                break;
            }
        }
        return result;
    }
}