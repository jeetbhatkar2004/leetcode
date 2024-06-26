class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        int res = 0;
        while(i < j){
            int curr = nums[i] + nums[j];
            if(curr == k){
                res++;
                i++;
                j--;
            }   
            else if(curr > k){
                j--;
            }
            else{
                i++;
            }
        }
        return res;
    }
}