class Solution {
    public int kthFactor(int n, int k) {
        int i = 1;
        int result = Integer.MIN_VALUE;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        while(i <= Math.sqrt(n)){
            if(n % i == 0){
                pq.offer(i);
                if(i != n/i){
                    pq.offer(n/i);
                }
            }
            i++;
            while(pq.size() > k){
                result = pq.poll();
            }
        }
        if(pq.size() == k){
            return pq.poll();
        }
        return -1;

       
}}