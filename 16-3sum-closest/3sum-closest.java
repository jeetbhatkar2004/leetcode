class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0;
        boolean larger = false;
        boolean smaller = false;
        int result = Integer.MAX_VALUE;
        while(i < nums.length){
            int j = i+1;
            int k = nums.length -1;
            while(j < k){
                int curr = nums[j] + nums[k] + nums[i];
                if(curr == target){
                    return target;
                }
                if (Math.abs(curr - target) < Math.abs(result - target)) {
                    result = curr;
                }
                if (curr > target) {
                    k--;
                } else {
                    j++;
                }
            }
            i++;
        }
        return result;
    }
}