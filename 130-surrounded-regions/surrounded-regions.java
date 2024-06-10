class Solution {
    void dfs(char[][] board, int i , int j){
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != 'O'){
            return;
        }
        board[i][j] = '2';
        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);

    }
    public void solve(char[][] board) {
        int i = 0;
        while(i < board.length ){
            if(board[i][0] == 'O'){
                dfs(board, i, 0);
            }
            if(board[i][board[0].length - 1] == 'O'){
                dfs(board, i , board[0].length - 1);
            }
            i++;
        }
        int j = 0;
        while(j < board[0].length ){
            if(board[0][j] == 'O'){
                dfs(board, 0, j);
            }
            if(board[board.length - 1][j] == 'O'){
                dfs(board, board.length - 1 , j);
            }
            j++;
        }
        i = 0;
        j = 0;
        while(i < board.length){
            j = 0;
            while(j < board[0].length){
                if(board[i][j] != '2'){
                    board[i][j] = 'X';
                }
                else{
                    board[i][j] = 'O';
                }
                j++;
            }
            i++;
        }        
    }
}