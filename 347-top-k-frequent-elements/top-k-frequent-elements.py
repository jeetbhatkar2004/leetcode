from collections import Counter
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hashmap = Counter(nums)
        heap = []
        for num in hashmap:
            heapq.heappush(heap, (-hashmap.get(num), num))
        result = []
        while k > 0:
            result.append((heapq.heappop(heap))[1])
            k = k - 1
        return result
        

        
            
