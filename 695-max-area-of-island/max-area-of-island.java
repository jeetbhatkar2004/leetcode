class Solution {
    int helper(int[][] grid, int i, int j, int count){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1){
            return 0;
        }
        grid[i][j] = 2;
        return 1 + helper(grid, i + 1, j, count) + helper(grid, i - 1, j, count) + helper(grid, i, j + 1, count) + helper(grid, i, j - 1, count);
    }
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        int m = grid.length;
        int n = grid[0].length;
        int i = 0;
        int j = 0;
        while(i < m){
            j = 0;
            while(j < n){
                if(grid[i][j] == 1){
                    int count = helper(grid, i, j, 0);
                    max = Math.max(count, max);
                }
                j++;
            }
            i++;
        }
        return max;
        
    }
}