class Solution {
    int curr = 0;
    void helper(int[][] grid, int i, int j){
        if(i >= grid.length || j >= grid[0].length || i < 0 || j < 0 || grid[i][j] != 1){
            return;
        }
        grid[i][j] = 2;
        curr++;
        helper(grid, i + 1, j);
        helper(grid, i - 1, j);
        helper(grid, i, j + 1);
        helper(grid, i, j - 1);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int result = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    curr = 0;
                    helper(grid, i, j);
                    result = Math.max(result, curr);
                }
            }
        }
        return result;
    }
}