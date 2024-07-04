class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int curr = 0;
        int i = 0;
        while(i < gain.length ){
            curr = curr + gain[i];
            max = Math.max(curr, max);
            i++;
        }
        return max;
        
    }
}