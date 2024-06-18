class Solution {
    boolean flag = false;
    void helper(char[][] board, int i, int j, String word, int curr){
        if(curr == word.length()){
            flag = true;
            return;
        }
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(curr)){
            return;
        }
        char temp = board[i][j];
        board[i][j] = '*'; 

        helper(board, i+1, j, word, curr+1);
        helper(board, i-1, j, word, curr+1);
        helper(board, i, j+1, word, curr+1);
        helper(board, i, j-1, word, curr+1);
        board[i][j] = temp; // Restore the current cell

    }
    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        int i = 0;
        int j = 0;
        while(i < n){
            j = 0;
            while(j < m){
                if(board[i][j] == word.charAt(0)){
                    helper(board, i, j, word, 0);
                    if(flag){
                        return true;
                    }
                }
                j++;
            }
            i++;
        }
        return false;
        
    }
}