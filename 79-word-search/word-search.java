class Solution {
    boolean result = false;
    void helper(char[][] board, String word, int i, int j, int start){
        if(start >= word.length()){
            result = true;
            return;
        }
        if(i >= board.length || j >= board[0].length || i < 0 || j < 0 || board[i][j] != word.charAt(start)){
            return;
        }
        char temp = board[i][j];
        board[i][j] = '*';
        helper(board, word, i + 1, j, start + 1);
        helper(board, word, i - 1, j, start + 1);
        helper(board, word, i, j + 1, start + 1);
        helper(board, word, i, j - 1, start + 1);
        board[i][j] = temp;


    }
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    helper(board, word, i, j, 0);
                }
                if(result){
                    return true;
                }
            }
        }
        return false;
        
    }
}