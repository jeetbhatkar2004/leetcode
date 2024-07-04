class Solution {
    public int largestAltitude(int[] gain) {
        int i = 0;
        int curr = 0;
        int max = 0;
        while( i < gain.length ){
            curr = curr + gain[i];
            max = Math.max(max, curr);
            i++;
        }
        return max;
    }
}