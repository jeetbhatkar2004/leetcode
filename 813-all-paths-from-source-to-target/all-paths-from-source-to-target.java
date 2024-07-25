class Solution {
    Map<Integer, int[]> map = new HashMap<>();
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    void helper(int start){
        curr.add(start);
        if(start == map.size()-1){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0; i < map.get(start).length; i++){
            helper(map.get(start)[i]);
            curr.remove(curr.size() - 1);

        }
        
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        for(int i = 0; i < graph.length; i++){
            map.put(i, graph[i]);
        }
        helper(0);
        return result;

    }
}