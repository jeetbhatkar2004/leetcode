class Solution {
    void helper(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 'O'){
            return;
        }
        grid[i][j] = '2';
        helper(grid, i+1, j);
        helper(grid, i-1, j);
        helper(grid, i, j+1);
        helper(grid, i, j-1);

    }
    public void solve(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int i = 0;
        int j = 0;
        while(i< n){
            if(grid[i][0] == 'O'){
                helper(grid, i, 0);
            }
            if(grid[i][m-1] == 'O'){
                helper(grid, i, m-1);
            }
            i++;
        }
        while(j < m){
            if(grid[0][j] == 'O'){
                helper(grid, 0, j);
            }
            if(grid[n-1][j] == 'O'){
                helper(grid, n-1, j);
            }
            j++;
        }
        i = 0;
        j = 0;
        while(i < n){
            j = 0;
            while(j < m){
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