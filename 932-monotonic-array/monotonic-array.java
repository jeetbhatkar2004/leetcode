class Solution {
    public boolean isMonotonic(int[] nums) {
        if(nums.length <= 2){
            return true;
        }
        int i = 0;
        while(i < nums.length - 2 && nums[i] == nums[i+1]){
            i++;
        }
        if (i + 1 == nums.length){
            return true;
        }
        if (nums[i] > nums[i+1]){
            int j = i+1;
            while(j < nums.length){
                if (nums[j] > nums[i]){
                    return false;
                }
                j++;
                i++;
            }
        }
        else{
            int j = i+1;
            while(j < nums.length){
                if (nums[j] < nums[i]){
                    return false;
                }
                j++;
                i++;
            }
        }
        return true;
    }
}