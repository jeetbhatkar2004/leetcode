class Solution {
    int res = 0;
    boolean isExit(char[][] maze, int[] curr, int[] entrance){
    if ((curr[0] == 0 || curr[0] == maze.length - 1 || curr[1] == 0 || curr[1] == maze[0].length - 1) && !(curr[0] == entrance[0] && curr[1] == entrance[1])) {
            return true;
        }
        return false;
    }        

    public int nearestExit(char[][] maze, int[] entrance) {
        Queue<int[]> qu = new LinkedList<>();
        qu.add(entrance);
        maze[entrance[0]][entrance[1]] = '*';
        while(!qu.isEmpty()){
            int size = qu.size();
            while(size > 0){
                int[] curr = qu.poll();
                int i = curr[0];
                int j = curr[1];
                if(isExit(maze, curr, entrance)){
                    return res;
                }
                if(i + 1 < maze.length && maze[i + 1][j] == '.'){
                    qu.add(new int[] {i + 1, j});
                    maze[i + 1][j] = '*';
                }
                if(i - 1 >= 0 && maze[i - 1][j] == '.'){
                    qu.add(new int[] {i - 1, j});
                    maze[i - 1][j] = '*';
                }           
                if(j + 1 < maze[0].length && maze[i][j + 1] == '.'){
                    qu.add(new int[] {i, j + 1});
                    maze[i][j + 1] = '*';

                }            
                if(j - 1 >= 0 && maze[i][j - 1] == '.'){
                    qu.add(new int[] {i, j - 1});
                    maze[i][j - 1] = '*';

                }
                size--;
            }
            res++;
        }
        return -1;
    }
}