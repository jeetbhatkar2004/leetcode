class Solution {
    Set<Integer> hashset = new HashSet<>();
    Map<Integer, List<Integer>> map = new HashMap<>();
    Set<Integer> visited = new HashSet<>();
    boolean valid = true;
    void helper(int i){
        if(!map.containsKey(i)){
            return;
        }
        if(hashset.contains(i)){
            valid = false;
            return;
        }
        if(visited.contains(i)){
            return;
        }
        hashset.add(i);
        List<Integer> temp = map.get(i);
        for(int j = 0; j < temp.size(); j++){
            helper(temp.get(j));
        }
        hashset.remove(i);
        visited.add(i);
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int i = 0;
        while(i < prerequisites.length){
            if(map.containsKey(prerequisites[i][0])){
                map.get(prerequisites[i][0]).add(prerequisites[i][1]);
            }
            else{
                List<Integer> temp = new ArrayList<>();
                temp.add(prerequisites[i][1]);
                map.put(prerequisites[i][0], temp);
            }
            i++;
        }
        for(Map.Entry<Integer, List<Integer>> curr : map.entrySet()){
            helper(curr.getKey());
        }
        return valid;


    }
}