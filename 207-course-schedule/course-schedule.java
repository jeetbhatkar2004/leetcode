class Solution {
    Set<Integer> set = new HashSet<>();
    Set<Integer> cycle = new HashSet<>();
    boolean valid = false;
    void helper(int curr, Map<Integer, List<Integer>> map){
        if(!map.containsKey(curr)){
            return;
        }
        if(set.contains(curr)){
            return;
        }
        if(cycle.contains(curr)){
            valid = true;
            return;
        }
        cycle.add(curr);
        List<Integer> temp = map.get(curr);
        for(int i = 0; i < temp.size(); i++){
            helper(temp.get(i), map);
        }
        cycle.remove(curr);
        set.add(curr);
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < prerequisites.length; i++){
            if(map.containsKey(prerequisites[i][0])){
                map.get(prerequisites[i][0]).add(prerequisites[i][1]);
            }
            else{
                List<Integer> curr = new ArrayList<>();
                curr.add(prerequisites[i][1]);
                map.put(prerequisites[i][0], curr);
            }
        }
        for(Map.Entry<Integer, List<Integer>> curr : map.entrySet()){
            helper(curr.getKey(), map);
            if(valid){
                return false;
            }
        }   
        return true;
    }
}