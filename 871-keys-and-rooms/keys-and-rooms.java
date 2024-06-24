class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> set = new HashSet<>();
        Queue<Integer> qu = new LinkedList<>();
        int i = 0;
        while(i < rooms.get(0).size()){
            qu.add(rooms.get(0).get(i));
            i++;
        }
        i = 0;
        set.add(0);
        while(!qu.isEmpty()){
            int curr = qu.poll();
            set.add(curr);
            if(set.size() == rooms.size()){
                return true;
            }
            for(int j = 0; j < rooms.get(curr).size(); j++){
                if(!set.contains(rooms.get(curr).get(j))){
                    qu.add(rooms.get(curr).get(j));
                }
            }
        }
        return false;

        
    }
}