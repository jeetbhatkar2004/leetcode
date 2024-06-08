class Solution {
    public void helper(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        helper(grid, i-1, j);
        helper(grid, i, j-1);
        helper(grid, i, j+1);
        helper(grid, i+1, j);



    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int i = 0;
        int j = 0;
        int result = 0;
        while(i < n){
            j=0;
            while(j < m){
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