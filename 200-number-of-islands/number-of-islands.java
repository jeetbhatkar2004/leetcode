class Solution {
    void helper(char[][] grid, int i , int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1'){
            return;
        }
        grid[i][j] = '2';
        helper(grid, i+1, j);
        helper(grid, i-1, j);
        helper(grid, i, j-1);
        helper(grid, i, j+1);

    }
    public int numIslands(char[][] grid) {
        int i= 0;
        int j = 0;
        int result = 0;
        while(i < grid.length){
            j = 0;
            while(j < grid[0].length){
                if(grid[i][j] == '1'){
                    result++;
                    helper(grid, i, j);
                }
                j++;
            }
            i++;
        }
        return result;
    }
}