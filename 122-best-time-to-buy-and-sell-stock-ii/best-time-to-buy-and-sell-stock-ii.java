class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int j = 1;
        int i = 0;
        while(j < prices.length){
            if(prices[j] > prices[i]){
                max = max + (prices[j]-prices[i]);
            }
            i = j;
            j++;
        }
        return max;

        
        
    }
}