class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int[] curr = intervals[0];
        int i = 1;
        while(i < intervals.length) {
            if (curr[1] >= intervals[i][0]) {
                curr[1] = Math.max(curr[1], intervals[i][1]);
            } else {
                result.add(curr);
                curr = intervals[i];
            }
            i++;
        }
        result.add(curr);
        return result.toArray(new int[result.size()][]);
    }
}