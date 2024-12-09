class Solution {
    public int orangesRotting(int[][] grid) {
        boolean oneexists = false;
        Queue<int[]> qu = new LinkedList<>();
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2){
                    qu.add(new int[] {i, j});
                }
                if(grid[i][j] == 1){
                    oneexists = true;
                }
            }
        }
        if(!oneexists){
            return 0;
        }
        int level = 0;
        while(!qu.isEmpty()){
            int size = qu.size();
            while(size > 0){
                int[] curr = qu.poll();
                int x = curr[0];
                int y = curr[1];
                if(x < grid.length - 1 && grid[x + 1][y] == 1){
                    grid[x+1][y] = 2;
                    qu.add(new int[] {x+1, y});
                }
                if(y < grid[0].length - 1 && grid[x][y + 1] == 1){
                    grid[x][y + 1] = 2;
                    qu.add(new int[] {x, y+1});
                }                
                if(x > 0 && grid[x - 1][y] == 1){
                    grid[x-1][y] = 2;
                    qu.add(new int[] {x-1, y});
                }                
                if(y > 0 &&  grid[x][y - 1] == 1){
                    grid[x][y-1] = 2;
                    qu.add(new int[] {x, y-1});
                }
                size--;
            }
            level++;
        }
        boolean flag = false;
        for(int x = 0; x < grid.length; x++){
            for(int y = 0; y < grid[0].length; y++){
                if(grid[x][y] == 1){
                    flag = true;
                }
            }
        }
        if(flag){
            return -1;
        }
        return level - 1;
    }
}