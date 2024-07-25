class Solution {

    Map<Integer, List<Integer>> map = new HashMap<>();
    Set<Integer> visited = new HashSet<>();
    Set<Integer> curr = new HashSet<>();
    void helper(int start){
        if(visited.contains(start) || curr.contains(start)){
            return;
        }

        curr.add(start);
        for(int i = 0; i < map.get(start).size(); i++){
            helper(map.get(start).get(i));
        }
        curr.remove(start);
        visited.add(start);
    }
    public int findCircleNum(int[][] isConnected) {
        for(int i = 0; i < isConnected.length; i++){
            map.put(i, new ArrayList<>());
        }
        for(int i = 0; i < isConnected.length; i++){
            for(int j = 0; j < isConnected[0].length; j++){
                if(isConnected[i][j] == 1){
                    map.get(i).add(j);
                }
            }
        }
        int res = 0;
        for(Map.Entry<Integer, List<Integer>> curr : map.entrySet()){
            int size = visited.size();
            if(!visited.contains(curr.getKey())){
                helper(curr.getKey());
                if(visited.size()!= size){
                    res++;
                }
            }
        }
        return res;


    }
}