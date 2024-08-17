class Solution {
    public int removeDuplicates(int[] nums) {
        int nonduplicate = 1;
        int i = 1;
        while( i < nums.length ){
            if(nums[i] != nums[i-1]){
                nums[nonduplicate] = nums[i];
                nonduplicate++;
            }
            i++;
        }
        return nonduplicate;
        
    }
}