class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int left = 0;
        int right = 0;
        int zero = 0;
        while(right < nums.length){
            if(nums[right] == 0){
                zero++;
            }
            while(zero > 1 && left < nums.length){
                if(nums[left] == 0){
                    zero--;
                }
                left++;
            }
            max = Math.max(max, right - left);
            right++;
        }
        return max;
    }
}