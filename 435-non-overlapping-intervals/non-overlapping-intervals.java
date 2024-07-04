import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        // Sort the intervals based on their end time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        if (intervals.length < 2) {
            return 0;
        }

        int res = 0;
        int[] curr = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (curr[1] > intervals[i][0]) {
                res++;
            } else {
                curr = intervals[i];
            }
        }

        return res;
    }
}
