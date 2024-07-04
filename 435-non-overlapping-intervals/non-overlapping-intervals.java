class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        if(intervals.length < 2){
            return 0;
        }
        int i = 1;
        int res = 0;
        int[] curr = intervals[0];
        while(i < intervals.length){
            if (curr[1] > intervals[i][0]){
                res++;
            }
            else{
                curr = intervals[i];
            }
            i++;
        }
        return res;  
    }
}