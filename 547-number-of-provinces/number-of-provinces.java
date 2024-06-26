class Solution {
    Map<Integer, List<Integer>> map = new HashMap<>();
    Set<Integer> set = new HashSet<>();
    void makeMap(int[][] nums){
        for(int i = 0; i < nums.length; i++){
            map.put(i, new ArrayList<>());
        }
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[0].length; j++){
                if(nums[i][j] == 1 && i!=j){
                        map.get(i).add(j);
                }
            }
        }
    }
    void helper(int i){
        if(set.contains(i)){
            return;
        }
        set.add(i);
        List<Integer> temp = map.get(i);
        for(int curr = 0; curr < temp.size(); curr++){
            helper(temp.get(curr));
        }
    }
    public int findCircleNum(int[][] nums) {
        int result = 0;
        makeMap(nums);
        for(Map.Entry<Integer,List<Integer>> entry : map.entrySet()){
            int size = set.size();
            helper(entry.getKey());
            if(size != set.size()){
                result++;
            }
        }
        return result;

        
    }
}