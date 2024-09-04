class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int i = 0;
        int result = 0;
        int[] direction = new int[] {0,1};
        int[] currpos = new int[] {0,0};
        Set<String> obstacleset = new HashSet<>();
        for(int j = 0; j < obstacles.length; j++){
            int x = obstacles[j][0];
            int y = obstacles[j][1];
            String hash = x + "," + y;
            obstacleset.add(hash);
        }
        while(i < commands.length){
            if(commands[i] == -2){
                direction = newDir(direction, true);
            }
            else if (commands[i] == -1){
                direction = newDir(direction, false);
            }
            else{
                for(int j = 0; j < commands[i]; j++){
                    int prevx = currpos[0];
                    int prevy = currpos[1];
                    currpos[0] = currpos[0] + direction[0];
                    currpos[1] = currpos[1] + direction[1];
                    String hash = currpos[0] + "," + currpos[1];
                    if(obstacleset.contains(hash)){
                        currpos[0] = prevx;
                        currpos[1] = prevy;
                        break;
                    }
                }
            }
            result = Math.max(result, calcEuc(currpos));
            i++;
        }
        return result;
    }
    int calcEuc(int[] currpos){
        int x = currpos[0];
        int y = currpos[1];
        int temp =(int) Math.pow(x,2) + (int)Math.pow(y,2);
        return temp;
    }
    int[] newDir(int[] curr, boolean left){
        int[] result = new int[2];
        int x = curr[0];
        int y = curr[1];
        if(left){
            if(x == 1){
                result[0] = 0;
                result[1] = 1;
            }
            else if (x == -1){
                result[0] = 0;
                result[1] = -1;
            }
            else if(y == 1){
                result[0] = -1;
                result[1] = 0;
            }
            else{
                result[0] = 1;
                result[1] = 0;
            }
        }
        else{
            if(x == 1){
                result[0] = 0;
                result[1] = -1;
            }
            else if(x == -1){
                result[0] = 0;
                result[1] = 1;
            }
            else if (y == 1){
                result[0] = 1;
                result[1] = 0;
            }
            else{
                result[0] = -1;
                result[1] = 0;
            }
            
        }
        return result;
    }
}