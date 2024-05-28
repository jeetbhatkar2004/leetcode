class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int curr = 0;
        int max = 0;
        if(prices.length < 2){
            return 0;
        }
        while(j < prices.length){
            curr = prices[j] - prices[i];
            if(curr < 0){
                i++;
                continue;
            }
            max = Math.max(max, curr);
            j++;
        }
        return max;
        
    }
}