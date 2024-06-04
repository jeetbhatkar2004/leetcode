class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        int i = 0;
        while (i < nums.length){
            int curr = target - nums[i];
            if(hash.containsKey(curr)){
                return new int[] {i, hash.get(curr)};
            }
            hash.put(nums[i], i);
            i++;
        }
        return new int[] {-1,-1};
                
    }
}