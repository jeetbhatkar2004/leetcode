class Solution {
    int helper(int[][] grid, int i , int j){
        int res = 0;
        if(i+1 >= grid.length){
            res++;
        }
        else if (grid[i+1][j] == 0){
            res++;
        }
        if(i-1 < 0){
            res++;
        }
        else if (grid[i-1][j] == 0){
            res++;
        }        
        if(j+1 >= grid[0].length){
            res++;
        }
        else if (grid[i][j+1] == 0){
            res++;
        }        
        if(j-1 < 0){
            res++;
        }
        else if (grid[i][j-1] == 0){
            res++;
        }
        return res;

    }
    public int islandPerimeter(int[][] grid) {
        int res = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    res = res + helper(grid, i, j);
                }
            }
        }
        return res;
        
    }
}