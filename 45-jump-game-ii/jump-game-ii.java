class Solution {
    public int jump(int[] nums) {
        int result = 0;
        int i = 0;
        if(nums.length == 1){
            return 0;
        }
        while(i < nums.length){
            if(nums[i] + i >= nums.length - 1){
                return result + 1;
            }
            int temp = i;
            int j = i+1;
            int max = 0;
            while(j <= temp + nums[temp] && j < nums.length){
                if(j + nums[j] > max){
                    max = nums[j] + j;
                    i = j;
                }
                j++;
            }
            result++;

        }
        return result;
        
    }
}