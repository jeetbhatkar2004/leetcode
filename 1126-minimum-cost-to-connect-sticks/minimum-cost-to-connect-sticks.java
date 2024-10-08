class Solution {
    public int connectSticks(int[] sticks) {
        int result = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < sticks.length; i++){
            pq.add(sticks[i]);
        }
        while(pq.size() != 1){
            int smallest = pq.poll();
            int smallest2 = pq.poll();
            int cummulative = smallest + smallest2;
            result = result + cummulative;
            pq.offer(cummulative);
        }
        return result;
    }
}