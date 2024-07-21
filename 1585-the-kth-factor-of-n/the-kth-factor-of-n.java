class Solution {
    int other = 0;
    boolean div(int i, int n){
        if(n % i == 0){
            other = n/i;
            return true;
        }
        else{
            return false;
        }
    }
    public int kthFactor(int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();
        int i = 1;
        while(i <= Math.sqrt(n)){
            if(div(i,n) && !set.contains(i)){
                pq.add(i);
                if(i != other){
                    pq.add(other);
                    set.add(other);
                }
                set.add(i);
            }
            i++;
        }
        int size = pq.size();
        if(k > size){
            return -1;
        }
        i = 1;
        while(i < k){
            pq.poll();
            i++;
        }
        return pq.poll();
    }
}