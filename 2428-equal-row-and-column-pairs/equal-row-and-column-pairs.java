class Solution {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> set = new HashMap<>();
        int i = 0;
        int j = 0;
        while(i < grid.length){
            j = 0;
            StringBuilder curr = new StringBuilder();
            while(j < grid[0].length){
                curr.append(grid[i][j] + ",");
                j++;
            }
            if(set.containsKey(curr.toString())){
                int temp = set.get(curr.toString());
                temp++;
                set.put(curr.toString(), temp);
            }
            else{
                set.put(curr.toString(), 1);
            }
            i++;
        }
        i = 0;
        j = 0;
        int result = 0;
        while(j < grid[0].length){
            i = 0;
            StringBuilder curr = new StringBuilder();
            while(i < grid.length){
                curr.append(grid[i][j] + ",");
                i++;
            }
            String temp = curr.toString();
            if (set.containsKey(temp)){
                result = result + set.get(temp);
            }
            j++;
        }
        return result;
    }
}