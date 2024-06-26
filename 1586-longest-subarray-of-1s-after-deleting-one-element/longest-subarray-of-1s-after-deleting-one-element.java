class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0;
        int zerocount = 0;
        int curr = 0;
        int max = 0;
        int temp = 0;
        boolean check = true;
        while(i < nums.length){
            if(nums[i] == 0 && zerocount == 0){
                zerocount++;
                temp = i;
                check = false;
            }
            else if(nums[i] == 0 && zerocount != 0){
                i = temp;
                curr = 0;
                check = false;
                zerocount = 0;
            }
            else if(nums[i] != 0){
                curr++;
            }
            i++;
            max = Math.max(max, curr);
        }
        if(check){
            return max - 1;
        }
        return max;
    }
}