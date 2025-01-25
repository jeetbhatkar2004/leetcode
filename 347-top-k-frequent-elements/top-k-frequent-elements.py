from collections import defaultdict
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        heap = []
        hashmap = defaultdict(int)
        for i in nums:
            hashmap[i] += 1
        for key in hashmap.keys():
            heapq.heappush(heap, (-(hashmap[key]), key))
        result = []
        for i in range(0, k):
            result.append(heapq.heappop(heap)[1])
        return result