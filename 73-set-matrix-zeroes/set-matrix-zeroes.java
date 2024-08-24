class Solution {
    void helper(int[][] nums, int xcoord, int ycoord){
        for(int i = 0; i < nums[0].length; i++){
            if(nums[xcoord][i] == 0){
                continue;
            }
            nums[xcoord][i] = 758445;
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i][ycoord] == 0){
                continue;
            }
            nums[i][ycoord] = 758445;
        }
    }
    public void setZeroes(int[][] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[0].length; j++){
                if(nums[i][j] == 0){
                    helper(nums, i, j);
                }
            }
        }

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[0].length; j++){
                if(nums[i][j] == 758445){
                    nums[i][j] = 0;
                }
            }
        }
        
    }
}