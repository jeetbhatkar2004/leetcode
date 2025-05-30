class Solution {
    public double findtime(int[] piles, int speed){
        int i = 0;
        double time = 0;
        while(i < piles.length){
            double temp = (double) piles[i];
            time = time + Math.ceil(temp/(double) speed);
            i++;
        }
        return time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        int i = 0;
        while(i < piles.length){
            max= Math.max(max, piles[i]);
            i++;
        }
        int start = 1;
        int end = max;
        while (start < end) {
            int mid = start + (end - start) / 2;
            double temp = findtime(piles, mid);
            if (temp <= h) {
                end = mid; 
            } else {
                start = mid + 1; 
            }
        }
        return start; 
    }
}