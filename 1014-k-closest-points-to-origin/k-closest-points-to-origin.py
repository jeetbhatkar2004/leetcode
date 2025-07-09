class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        def helper(point):
            xcoor = point[0]
            ycoor = point[1]
            return math.sqrt(math.pow(xcoor,2) + math.pow(ycoor,2))
        heap = []
        for i in range(len(points)):
            heapq.heappush(heap,(helper(points[i]), i))
        result = []
        for i in range(k):
            result.append(points[heapq.heappop(heap)[1]])
        return result

        
        