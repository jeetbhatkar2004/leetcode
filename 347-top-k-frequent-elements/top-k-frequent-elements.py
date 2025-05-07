from collections import Counter
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        hashmap = Counter(nums)
        heap = []
        for key, val in hashmap.items():
            heapq.heappush(heap, (-val, key))
        result = []
        while k > 0:
            result.append((heapq.heappop(heap))[1])
            k = k - 1
        return result
        

        
            
