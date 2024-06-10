class Solution {
    void helper(char[][] grid, int i , int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 'O'){
            return;
        }
        grid[i][j] = '2';
        helper(grid, i + 1, j);
        helper(grid, i - 1, j);
        helper(grid, i, j+1);
        helper(grid, i, j-1);

    }
    public void solve(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length; 
        int i = 0;
        int j = 0;
        while(i < m){
            if(grid[i][n-1] == 'O'){
                helper(grid, i, n-1);
            }
            if(grid[i][0] == 'O'){
                helper(grid, i, 0);
            }
            i++;
        }
        while(j < n){
            if(grid[m-1][j] == 'O'){
                helper(grid, m-1, j);
            }
            if(grid[0][j] == 'O'){
                helper(grid, 0, j);
            }
            j++;
        }
        i = 0;
        j = 0;
        while(i < m){
            j = 0;
            while(j < n){
                if(grid[i][j] != '2'){
                    grid[i][j] = 'X';
                }
                else{
                    grid[i][j] = 'O';
                }
                j++;
            }
            i++;
        }
    }
}