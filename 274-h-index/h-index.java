class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int i = 0;
        int max = 0;
        while(i < citations.length){
            if(citations[i] >= citations.length - i){
                max = Math.max(max, citations.length - i);
            }
            i++;
        }
        return max;
    }
}