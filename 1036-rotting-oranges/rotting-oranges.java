class Solution {
    public int orangesRotting(int[][] grid) {
        boolean foundone = false;
        Queue<int[]> qu = new LinkedList<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2){
                    qu.add(new int[] {i,j});
                }
                if(grid[i][j] == 1){
                    foundone = true;
                }
            }
        }
        if(!foundone){
            return 0;
        }
        int count = 0;
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
            count++;
        }
        if (!check(grid)){
            return -1;
        }
        return count-1;

    }
    boolean check(int[][] grid){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j< grid[0].length; j++){
                if(grid[i][j] == 1){
                    return false;
                }
            }
        }
        return true;
    }
}