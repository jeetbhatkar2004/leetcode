class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            if(nums[i] != i+1){
                if(nums[nums[i]-1] == nums[i]){
                    return nums[i];
                }
                int temp = nums[i];
                nums[i] = nums[temp-1];
                nums[temp-1] = temp;
            }
            else{
                i++;
            }
        }
        return -1;
    }
}
