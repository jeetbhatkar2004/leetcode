class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length-1; i++){
            int j = i + 1;
            int k = nums.length -1;
            while(j < k){
                int curr = nums[i] + nums[j] + nums[k];
                if(Math.abs(curr-target) < Math.abs(result - target)){
                    result = curr;
                }
                if(target > curr){
                    j = j + 1;
                }
                else if(target < curr){
                    k = k - 1;
                }
                else{
                    return target;
                }
            }
        }
        return result;
    }
}