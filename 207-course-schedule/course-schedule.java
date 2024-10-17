class Solution {
    Map<Integer, List<Integer>> map = new HashMap<>();
    Set<Integer> visited = new HashSet<>();
    Set<Integer> path = new HashSet<>();

    boolean canfin = true;
    void helper(int i){
        if(!map.containsKey(i)){
            return;
        }   
        if(path.contains(i)){
            canfin = false;
            return;
        }
        if(visited.contains(i)){
            return;
        }
        path.add(i);
        List<Integer> list = map.get(i);
        for(int j = 0; j < list.size(); j++){
            helper(list.get(j));
        }
        path.remove(i);
        visited.add(i);
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i = 0; i < prerequisites.length; i++){
            if(map.containsKey(prerequisites[i][0])){
                map.get(prerequisites[i][0]).add(prerequisites[i][1]);
            }
            else{
                map.put(prerequisites[i][0], new ArrayList<>());
                map.get(prerequisites[i][0]).add(prerequisites[i][1]);
            }
        }
        for(Map.Entry<Integer, List<Integer>> curr : map.entrySet()){
            helper(curr.getKey());
            if(!canfin){
                return false;
            }
        }
        return true;

    }
}