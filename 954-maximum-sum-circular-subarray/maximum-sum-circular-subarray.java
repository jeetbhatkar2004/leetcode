class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int temp = Integer.MIN_VALUE;
        int i = 0;
        int total = 0;
        int case2 = 0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        int curra = 0;
        int currb = 0;
        while(i < nums.length){
            curra = curra + nums[i];
            currb = currb + nums[i];
            max = Math.max(curra, max);
            min = Math.min(currb, min);
            total = total + nums[i];
            temp = Math.max(temp, nums[i]);
            if(curra < 0){
                curra = 0;
            }
            if(currb > 0){
                currb = 0;
            }
            i++;
        }
        if(temp <= 0){
            return temp;
        }
        case2 = total - min;
        if(case2 > max){
            return case2;
        }
        return max;

    }
}