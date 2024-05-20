class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        int i = 0;
        int res = 0;
        while(i < nums.length){
            if(map.containsKey(nums[i]) && map.get(nums[i]) == false){
                res = res - nums[i];
                map.put(nums[i], true);
            }
            if(map.containsKey(nums[i]) && map.get(nums[i]) == true){
                i++;
                continue;
            }
            if(map.containsKey(nums[i]) == false){
                res = res + nums[i];
                map.put(nums[i], false);
            }
            i++;
        }
        return res;
        
    }
}