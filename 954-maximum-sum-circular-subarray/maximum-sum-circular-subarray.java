class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int i = 0;
        int curr = 0;
        int CASE1max = 0;
        int CASE2max = 0;
        int temp = Integer.MIN_VALUE;
        while( i < nums.length ){
            temp = Math.max(temp, nums[i]);
            curr = curr + nums[i];
            CASE1max = Math.max(curr, CASE1max);
            if(curr < 0){
                curr = 0;
            }
            i++;
        }
        if(temp <= 0){
            return temp;
        }
        i = 0;
        curr = 0;
        int total  = 0;
        int min = Integer.MAX_VALUE;
        while(i < nums.length){
            total = total + nums[i];
            curr = curr + nums[i];
            min = Math.min(curr, min);
            if(curr >0){
                curr = 0;
            }
            i++;
        } 
        CASE2max = total - min;
        if(CASE2max > CASE1max){
            return CASE2max;
        }
        return CASE1max;


    }
}