class Solution {
    public int kthFactor(int n, int k) {
        int i = 1;
        int result = Integer.MIN_VALUE;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while(i <= n){
            if(n % i == 0){
                pq.offer(i);
            }
            i++;
            if(pq.size() > k){
                result = pq.poll();
            }
        }
        if(pq.size() == k){
            return pq.poll();
        }
        return -1;

       
}}