class Solution {
    double distance(int[] target, int[] source){
        return Math.sqrt(Math.pow(target[0] - source[0], 2) + Math.pow(target[1] - source[1], 2));
    }
    public int minKnightMoves(int x, int y) {
        int result = 0;
        Queue<int[]> qu = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        qu.add(new int[] {0,0});
        if(x == 0 && y == 0){
            return result;
        }
        boolean bool = true;
        while(!qu.isEmpty()){
            int size = qu.size();
            result++;
            while(size > 0){
                int[] curr = qu.poll();
                int currx = curr[0];
                int curry = curr[1];
                double currdistance = distance(new int[] {x,y}, curr);
                if(currx + 1 == x && curry + 2 == y){
                    return result;
                }
                if((currdistance > distance(new int[] {x, y}, new int [] {currx + 1, curry + 2}) || bool) && !visited.contains(currx + 1 + "" + (curry + 2))){
                    visited.add(currx  + 1 + "" + (curry + 2));
                    qu.add(new int[] {currx + 1, curry + 2});
                }
                if(currx + 2 == x && curry + 1 == y){
                    return result;
                }
                if((currdistance > distance(new int[] {x, y}, new int [] {currx + 2, curry + 1}) || bool) && !visited.contains(currx + 2 + "" + (curry + 1))){
                    visited.add(currx  + 2 + "" + (curry + 1));
                    qu.add(new int[] {currx + 2, curry + 1});
                }
                if(currx + 2 == x && curry - 1 == y){
                    return result;
                }
                if((currdistance > distance(new int[] {x, y}, new int [] {currx + 2, curry - 1}) || bool) && !visited.contains(currx + 2 + "" + (curry - 1))){
                    visited.add(currx  + 2 + "" + (curry - 1));
                    qu.add(new int[] {currx + 2, curry - 1});
                }
                if(currx + 1 == x && curry - 2 == y){
                    return result;
                }
                if((currdistance > distance(new int[] {x, y}, new int [] {currx + 1, curry - 2}) || bool) && !visited.contains(currx + 1 + "" + (curry - 2))){
                    visited.add(currx  + 1 + "" + (curry - 2));
                    qu.add(new int[] {currx + 1, curry - 2});
                }              
                if(currx - 1 == x && curry - 2 == y){
                    return result;
                }
                if((currdistance > distance(new int[] {x, y}, new int [] {currx - 1, curry - 2}) || bool) && !visited.contains(currx - 1 + "" + (curry - 2))){
                    visited.add(currx  - 1 + "" + (curry - 2));
                    qu.add(new int[] {currx - 1, curry - 2});
                }                
                if(currx - 2 == x && curry - 1 == y){
                    return result;
                }
                if((currdistance > distance(new int[] {x, y}, new int [] {currx - 2, curry - 2}) || bool) && !visited.contains(currx - 2 + "" + (curry - 1))){
                    visited.add(currx  - 2 + "" + (curry - 1));
                    qu.add(new int[] {currx - 2, curry - 1});
                }               
                if(currx - 2 == x && curry + 1 == y){
                    return result;
                }
                if((currdistance > distance(new int[] {x, y}, new int [] {currx - 2, curry + 1} )|| bool) && !visited.contains(currx - 2 + "" + (curry + 1))){
                    visited.add(currx  - 2 + "" + (curry + 1));
                    qu.add(new int[] {currx - 2, curry + 1});
                }                
                if(currx - 1 == x && curry + 2 == y){
                    return result;
                }
                if((currdistance > distance(new int[] {x, y}, new int [] {currx - 1, curry + 2}) || bool) && !visited.contains(currx - 1 + "" + (curry + 2))){
                    visited.add(currx - 1 + "" + (curry + 2));
                    qu.add(new int[] {currx - 1, curry + 2});
                }
                bool = false;
                size--;
            }
        }
        return -1;
    }
}