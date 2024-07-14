class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int i = 0;
        while(i < nums.length){
            set.add(nums[i]);
            i++;
        }
        for(int j = 0; j <= nums.length; j++){
            if(!set.contains(j)){
                return j;
            }

        }
        return -1;
    }
}