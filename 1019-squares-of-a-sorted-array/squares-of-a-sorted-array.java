class Solution {
    public int[] sortedSquares(int[] nums) {
        int pointer = nums.length -1;
        int[] result = new int[nums.length];
        int i = 0;
        int j = nums.length - 1;
        while(i <= j){
            if(Math.abs(nums[i]) >= Math.abs(nums[j])){
                result[pointer] = (int) Math.pow(nums[i], 2);
                i++;
                pointer--;
            }
            else{
                result[pointer] = (int) Math.pow(nums[j], 2);
                j--;
                pointer--;
            }
        }
        return result;
        
    }
}