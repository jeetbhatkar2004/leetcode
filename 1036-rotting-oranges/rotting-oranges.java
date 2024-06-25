class Solution {
    boolean check(int[][] grid){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    return true;
                }
            }
        }
        return false;
    }
    public int orangesRotting(int[][] grid) {
        Queue<int[]> qu = new LinkedList<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2){
                    qu.add(new int[] {i,j});
                }
            }
        }
        int result = 0;
        while(!qu.isEmpty()){
            int size = qu.size();
            while(size > 0){
                int[] curr = qu.poll();
                int i = curr[0];
                int j = curr[1];
                if(i + 1 < grid.length && grid[i+1][j] == 1){
                    qu.add(new int[] {i + 1, j});
                    grid[i + 1][j] = -1;

                }
                if(j + 1 < grid[0].length && grid[i][j + 1] == 1){
                    qu.add(new int[] {i, j + 1});
                    grid[i][j + 1] = -1;

                }            
                if(i > 0 && grid[i - 1][j] == 1){
                    qu.add(new int[] {i - 1, j});
                    grid[i - 1][j] = -1;

                }               
                if(j > 0  && grid[i][j - 1] == 1){
                    qu.add(new int[] {i, j - 1});
                    grid[i][j - 1] = -1;

                }
                size--;
            }
            result++;
        }
        if(check(grid)){
            return -1;
        }
        if(result == 0){
            return result;
        }
        return result - 1;
    }
}