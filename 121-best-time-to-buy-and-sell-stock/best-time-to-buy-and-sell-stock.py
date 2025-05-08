class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        result = 0
        currmin = inf
        for num in prices:
            result = max(result, num - currmin)
            currmin = min(currmin, num)
        return result

         