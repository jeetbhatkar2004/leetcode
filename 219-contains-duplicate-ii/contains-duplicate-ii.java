class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        while( i < nums.length ){
            if(map.containsKey(nums[i])){
                if(Math.abs(map.get(nums[i]) - i) <= k){
                    return true;
                }
            }
            map.put(nums[i], i);
            i++;
        }
        return false;
        
    }
}