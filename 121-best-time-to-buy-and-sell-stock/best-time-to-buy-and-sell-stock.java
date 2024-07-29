class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int curr = 0;
        int i = 0;
        while(i < prices.length){
            curr = prices[i] - min;
            max = Math.max(max, curr);
            min = Math.min(min, prices[i]);
            i++;
        }
        return max;
    }
}