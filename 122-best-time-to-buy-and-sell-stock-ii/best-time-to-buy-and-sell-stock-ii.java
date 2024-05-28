class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2 ){
            return 0;
        }
        int i = 0;
        int j = 1;
        int max = 0;
        while(j < prices.length){
            int curr = prices[j] - prices[i];
            if (curr > 0){
                max = max + curr;
            }
            i++;
            j++;
        }
        return max;
        
    }
}