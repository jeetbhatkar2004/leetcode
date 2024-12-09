import java.util.Arrays;
class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(set.contains(board[i][j] + " in row" + i) || set.contains(board[i][j] + " in col" + j) || set.contains(board[i][j] + "in box" + i/3 + j/3)){
                    return false;
                }
                set.add(board[i][j] + " in row" + i);
                set.add(board[i][j] + " in col" + j);
                set.add(board[i][j] + "in box" + i/3 + j/3);
            }
        }
        return true;  
    }
}