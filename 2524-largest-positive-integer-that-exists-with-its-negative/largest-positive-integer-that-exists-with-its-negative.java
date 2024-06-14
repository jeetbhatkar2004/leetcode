class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> hash = new HashSet<>();
        int i = 0;
        while(i < nums.length){
            hash.add(nums[i]);
            i++;
        }
        i = 0;
        int max = 0;
        while(i < nums.length){
            if(hash.contains(nums[i] * -1)){
                max = Math.max(max, Math.abs(nums[i]));
            }
            i++;
        }
        if(max== 0){
            return -1;
        }
        return max;
        
    }
}