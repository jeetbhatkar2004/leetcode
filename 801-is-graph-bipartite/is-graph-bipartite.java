class Solution {
    Set<Integer> visited = new HashSet<>();

    boolean helper(int[][] graph, int j){
        Queue<Integer> qu = new LinkedList<>();
        Set<Integer> even = new HashSet<>();
        Set<Integer> odd = new HashSet<>();
        boolean evenbool = true;
        qu.add(j);
        while(!qu.isEmpty()){
            int size = qu.size();
            while(size > 0){
                int curr = qu.poll();
                if(evenbool){
                    even.add(curr);
                }
                else{
                    odd.add(curr);
                }
                visited.add(curr);
                for(int i = 0; i < graph[curr].length; i++){
                    if(evenbool && even.contains(graph[curr][i])){
                        return false;
                    }
                    if(!evenbool && odd.contains(graph[curr][i])){
                        return false;
                    }
                    if(!visited.contains(graph[curr][i])){
                        qu.add(graph[curr][i]);
                    }
                }
                size--;
            }
            evenbool = !evenbool;
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        for(int i = 0; i < graph.length; i++){
            if(!visited.contains(i)){
                boolean temp = helper(graph, i);
                if(!temp){
                    return false;
                }
            }
        }
        return true;
    }
}