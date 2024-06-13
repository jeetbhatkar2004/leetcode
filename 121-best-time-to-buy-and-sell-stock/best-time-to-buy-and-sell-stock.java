class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 0;
        int curr = 0;
        int max = 0;
        while(j < prices.length){
            curr = prices[j] - prices[i];
            if(curr < 0){
                i = j;
            }
            else{
                max = Math.max(curr, max);
            }
            j++;
        }  
        return max;
    }
}