class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }        
        List<List<String>> result = new ArrayList<>();
        helper(result, n, 0, board);
        return result;
    }
    void helper(List<List<String>> result, int n, int row, char[][] board){
        if(row == n){
            result.add(createBoard(board));
        }
        for(int col = 0; col < n; col++){
            if(isValid(board, row, col, n)){
                board[row][col] = 'Q';
                helper(result, n, row + 1, board);
                board[row][col] = '.';
            }
        }
    }
    List<String> createBoard(char[][] board){
        List<String> result = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            StringBuilder curr = new StringBuilder();
            for(int j = 0; j < board.length; j++){
                curr.append(board[i][j]);
            }
            result.add(curr.toString());
        }
        return result;
    }
    private boolean isValid(char[][] board, int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
    

}