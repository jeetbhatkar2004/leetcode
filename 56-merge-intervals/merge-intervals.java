class Solution {
    public int[][] merge(int[][] intervals) {
        int i = 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] curr = intervals[0];
        List<int[]> res = new ArrayList<>();
        while(i < intervals.length){
            if(curr[1] >= intervals[i][0]){
                curr[1] = Math.max(curr[1], intervals[i][1]);
            }
            else{
                res.add(curr);
                curr = intervals[i];
            }
            i++;
        }
        res.add(curr);
        return res.toArray(new int[res.size()][]);
    }
}