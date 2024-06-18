class Solution {
    boolean valid = false;
    void helper(char[][] board, String word, int curr, int i , int j){
        if(i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(curr)){
            return;
        }
        char temp = board[i][j];
        board[i][j] = '*';
        curr++;
        if(curr == word.length()){
            valid = true;
            return;
        }
        helper(board, word, curr, i + 1, j);
        helper(board, word, curr, i - 1, j);
        helper(board, word, curr, i, j + 1);
        helper(board, word, curr, i, j - 1);
        board[i][j] = temp;

    }
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length ; j++){
                if(board[i][j] == word.charAt(0)){
                    helper(board, word, 0, i, j);
                }
            }
        }
        return valid;

    }
}