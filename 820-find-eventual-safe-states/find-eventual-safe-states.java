class Solution {
    Map<Integer, int[]> map = new HashMap<>();
    
    public boolean dfs(int node, int[] visited) {
        if (visited[node] != 0) {
            return visited[node] == 2;
        }
        
        visited[node] = 1; // Mark node as visiting
        
        for (int neighbor : map.get(node)) {
            if (visited[neighbor] == 1 || !dfs(neighbor, visited)) {
                return false;
            }
        }
        
        visited[node] = 2; // Mark node as safe
        return true;
    }
    
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] visited = new int[n];
        List<Integer> result = new ArrayList<>();
        
        for (int j = 0; j < n; j++) {
            map.put(j, graph[j]);
        }
        
        for (int i = 0; i < n; i++) {
            if (dfs(i, visited)) {
                result.add(i);
            }
        }
        
        return result;
    }
}
