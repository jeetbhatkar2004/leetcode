class Solution {
    Set<Integer> current = new HashSet<>();
    Set<Integer> visited = new HashSet<>();
    boolean cycle = false;
    Map<Integer, List<Integer>> map = new HashMap<>();
    void helper(int start){
        if(!map.containsKey(start) || visited.contains(start)){
            return;
        }
        if(current.contains(start)){
            cycle = true;
            return;
        }
        current.add(start);
        List<Integer> pre = map.get(start);
        for(int j = 0; j < pre.size(); j++){
            helper(pre.get(j));
        }
        current.remove(start);
        visited.add(start);
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int i = 0;
        while(i  < prerequisites.length){
            if(map.containsKey(prerequisites[i][0])){
                map.get(prerequisites[i][0]).add(prerequisites[i][1]);
            }
            else{
                map.put(prerequisites[i][0], new ArrayList<>());
                map.get(prerequisites[i][0]).add(prerequisites[i][1]);
            }
            i++;
        }
        for(Map.Entry<Integer, List<Integer>> curr : map.entrySet()){
            if(!visited.contains(curr.getKey())){
                helper(curr.getKey());
            }
            if(cycle){
                return false;
            }
        }
        return true;
    }
}