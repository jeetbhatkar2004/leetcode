class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int result = Integer.MAX_VALUE;
        Queue<int[]> qu = new LinkedList<>();
        int steps = 1;
        if(grid[0][0] == 1){
            return -1;
        }
        qu.add(new int[] {0,0});
        grid[0][0] = 2;
        while(!qu.isEmpty()){
            int size = qu.size();
            while(size > 0){
                int[] curr = qu.poll();
                int x = curr[0];
                int y = curr[1];
                if (x == grid.length - 1 && y == grid.length - 1){
                    result = Math.min(result, steps);
                }
                if(x > 0 && grid[x - 1][y] == 0){ // up
                    qu.offer(new int[] {x - 1, y});
                    grid[x-1][y] = 2;
                }
                if(y > 0 && grid[x][y - 1] == 0){ // left
                    qu.offer(new int[] {x, y - 1});
                    grid[x][y-1] = 2;

                }                
                if(x < grid.length - 1 && grid[x + 1][y] == 0){ // down
                    qu.offer(new int[] {x + 1, y});
                    grid[x+1][y] = 2;

                }             
                if(y < grid.length - 1 && grid[x][y + 1] == 0){ // right
                    qu.offer(new int[] {x, y + 1});
                    grid[x][y+1] = 2;

                }
                if(x > 0 && y > 0 && grid[x - 1][y-1] == 0){ //up left
                    qu.offer(new int[] {x-1, y-1});
                    grid[x-1][y-1] = 2;

                }                
                if(x > 0 && y < grid.length - 1 && grid[x - 1][y+1] == 0){ // up right
                    qu.offer(new int[] {x-1, y+1});
                    grid[x-1][y+1] = 2;

                }                
                if(x < grid.length - 1 && y > 0 && grid[x + 1][y - 1] == 0){ // down left
                    qu.offer(new int[] {x+1, y-1});
                    grid[x+1][y-1] = 2;

                }                
                if(x < grid.length - 1 && y < grid.length - 1 && grid[x + 1][y + 1] == 0){ // down right
                    qu.offer(new int[] {x+1, y+1});
                    grid[x+1][y+1] = 2;

                }
                size--;
            }
            steps++;   
        }
        if(result == Integer.MAX_VALUE){
            return -1;
        }
        return result;
    }
}