class Solution {
    public int longestConsecutive(int[] nums) {
        int i = 0;
        Set<Integer> set = new HashSet<>();
        while(i < nums.length){
            set.add(nums[i]);
            i++;
        }
        i = 0;
        int result = 0;
        while(i < nums.length){
            int temp = nums[i];
            int curr = 0;
            if(!set.contains(temp - 1)){
                while(set.contains(temp)){
                    curr++;
                    result = Math.max(result, curr);
                    temp++;
                }
            }
            i++;
        }
        return result;

    }
}