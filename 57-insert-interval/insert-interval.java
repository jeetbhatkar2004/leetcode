class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;

        while (i < intervals.length && intervals[i][0] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }
        result.add(newInterval);
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        List<int[]> answer = new ArrayList<>();
        i = 0;
        answer.add(result.get(0));
        int[] curr = result.get(0);
        while(i < result.size()){
            if(curr[1] >= result.get(i)[0]){
                curr[1] = Math.max(curr[1], result.get(i)[1]);
            }else{
                curr = result.get(i);
                answer.add(curr);
                
            }
            i++;
        }
        return answer.toArray(new int[answer.size()] []);

    }

}