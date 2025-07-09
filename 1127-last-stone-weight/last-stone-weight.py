class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        for i in range(len(stones)):
            stones[i] = -1 * stones[i]
        heapq.heapify(stones)
        while(len(stones) > 1):
            largest = -1 * heapq.heappop(stones)
            twolargest = -1 * heapq.heappop(stones)
            remaining = (largest - twolargest)
            if remaining != 0:
                heapq.heappush(stones, -1*remaining)
        if len(stones) == 1:
            return -stones[0]
        return 0
        

        