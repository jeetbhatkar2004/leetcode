class Solution {
    Map<Integer, List<Integer>> map = new HashMap<>();
    boolean valid = false;
    Set<Integer> cycle = new HashSet<>();
    Set<Integer> vis = new HashSet<>();

    void helper(int start){
        if(!map.containsKey(start)){
            return;
        }
        if(cycle.contains(start)){
            valid = true;
            return;
        }
        if(vis.contains(start)){
            return;
        }
        cycle.add(start);
        for(int i = 0; i < map.get(start).size(); i++){
            helper(map.get(start).get(i));
        }
        vis.add(start);
        cycle.remove(start);
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i = 0; i < prerequisites.length; i++){
            if(map.containsKey(prerequisites[i][0])){
                map.get(prerequisites[i][0]).add(prerequisites[i][1]);
            }
            else{
                List<Integer> list = new ArrayList<>();
                list.add(prerequisites[i][1]);
                map.put(prerequisites[i][0], list);
            }
        }
        for(Map.Entry<Integer, List<Integer>> curr : map.entrySet()){
            helper(curr.getKey());
            if(valid){
                return false;
            }
        }
        return true;

    }
}