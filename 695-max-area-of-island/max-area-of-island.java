class Solution {
    int count = 0;
    void helper(int[][] grid, int i, int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != 1){
            return;
        }
        grid[i][j] = 2;
        count++;
        helper(grid, i + 1, j);
        helper(grid, i - 1, j);
        helper(grid, i, j + 1);
        helper(grid, i, j - 1);
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
                    count = 0;
                    helper(grid, i, j);
                    max = Math.max(count, max);
                }
                j++;
            }
            i++;
        }
        return max;
        
    }
}