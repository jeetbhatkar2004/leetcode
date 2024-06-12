class Solution {
    Map<Integer, List<Integer>> hashmap = new HashMap<>();
    Set<Integer> set = new HashSet<>();
    Set<Integer> visited = new HashSet<>();
    boolean valid = true;
    void helper(int i){
        if(!hashmap.containsKey(i)){
            return;
        }
        if(set.contains(i)){
            valid = false;
            return;
        }
        if(visited.contains(i)){
            return;
        }
        set.add(i);
        for(int j = 0; j < hashmap.get(i).size(); j++){

            helper(hashmap.get(i).get(j));
        }
        set.remove(i);
        visited.add(i);
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int i = 0;
        while(i < prerequisites.length){
            List<Integer> prereq = new ArrayList<>();
            if(hashmap.containsKey(prerequisites[i][0])){
                hashmap.get(prerequisites[i][0]).add(prerequisites[i][1]);
            }
            else{
                prereq.add(prerequisites[i][1]);
                hashmap.put(prerequisites[i][0], prereq);
            }
            i++;
        }
        for(Map.Entry<Integer, List<Integer>> curr : hashmap.entrySet()){
            set.clear();
            helper(curr.getKey());
        }
        return valid;
    }
}