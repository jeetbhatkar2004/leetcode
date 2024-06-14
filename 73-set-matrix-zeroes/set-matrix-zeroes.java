class Solution {
    void helper(int[][] matrix, int i, int j){     
        int m = matrix.length;
        int n = matrix[0].length;
        int tempi = i;
        int tempj = j;
        i = 0;
        j = 0;
        while(i < m){
            if(matrix[i][tempj] == 0){
            }
            else{
                matrix[i][tempj] = 4532;
            }
            i++;
        }
        while(j < n){
            if(matrix[tempi][j] == 0){
            }
            else{
                matrix[tempi][j] = 4532;
            }
            j++;
        }


    }
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = 0;
        while(i < m){
            j = 0;
            while(j < n){
                if (matrix[i][j] == 0){
                    helper(matrix, i, j);
                }
                j++;
            }
            i++;
        }
        i = 0;
        j = 0;
        while(i < m){
            j = 0;
            while(j < n){
                if(matrix[i][j] == 4532){
                    matrix[i][j] = 0;
                }
                j++;
            }
            i++;
        }
    }
}