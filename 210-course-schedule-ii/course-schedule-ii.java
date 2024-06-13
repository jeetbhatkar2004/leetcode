class Solution {
    Map<Integer, List<Integer>> map = new HashMap<>();

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int i = 0;
        int[] indegree = new int[numCourses];
        while(i < prerequisites.length){
            int course = prerequisites[i][0];
            int prereq = prerequisites[i][1];
            
            if (!map.containsKey(prereq)) {
                map.put(prereq, new ArrayList<>());
            }
            map.get(prereq).add(course);
            indegree[course] += 1;
            i++;
        }
        Queue<Integer> qu = new LinkedList<>();
        i = 0;
        while(i < numCourses){
            if(indegree[i] == 0){
                qu.add(i);
            }
            i++;
        }
        int index = 0;
        int[] order = new int[numCourses];
        while(!qu.isEmpty()){
            int temp = qu.poll();
            order[index] = temp;
            index++;
            List<Integer> list = map.get(temp);
            if(list == null){
                continue;
            }
            for(int j : list){
                indegree[j] -= 1;
                if(indegree[j] == 0){
                    qu.add(j);
                }
            }
        }
        if(numCourses == index){
            return order;
        }
        return new int[0];


    }
}