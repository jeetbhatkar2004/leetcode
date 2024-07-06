import java.util.*;

class Solution {
    Set<Integer> even = new HashSet<>();
    Set<Integer> odd = new HashSet<>();
    Set<Integer> visited = new HashSet<>();
    
    public boolean isBipartite(int[][] graph) {
        for (int start = 0; start < graph.length; start++) {
            if (!visited.contains(start)) {
                if (bfsCheck(graph, start) == false) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean bfsCheck(int[][] graph, int start) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(start);
        even.add(start);
        int count = 0;

        while (!qu.isEmpty()) {
            int size = qu.size();
            while (size > 0) {
                int curr = qu.poll();
                if (count % 2 == 0) {
                    even.add(curr);
                } else {
                    odd.add(curr);
                }
                for (int j : graph[curr]) {
                    if (count % 2 == 0 && even.contains(j)) {
                        return false;
                    }
                    if (count % 2 != 0 && odd.contains(j)) {
                        return false;
                    }
                    if (!visited.contains(j)) {
                        qu.add(j);
                        visited.add(j);
                    }
                }
                size--;
            }
            count++;
        }
        return true;
    }
}
