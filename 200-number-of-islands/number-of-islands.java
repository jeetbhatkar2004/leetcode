class Solution {
    void helper(char[][] grid, int i , int j){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1'){
            return;
        }
        grid[i][j] = '2';
        helper(grid, i + 1, j);
        helper(grid, i - 1, j);
        helper(grid, i, j + 1);
        helper(grid, i, j - 1);

    }
    public int numIslands(char[][] grid) {
        int i = 0;
        int j = 0;
        int result = 0;
        int m = grid.length;
        int n = grid[0].length;
        while(i < m){
            j = 0;
            while(j < n){
                if(grid[i][j] == '1'){
                    helper(grid, i , j);
                    result++;
                }
                j++;
            }
            i++;
        }
        return result;

    }
}