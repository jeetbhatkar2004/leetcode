class MinStack:

    def __init__(self):
        self.stack = []
        self.heap = []
    def push(self, val: int) -> None:
        self.stack.append(val)
        heapq.heappush(self.heap, val)

    def pop(self) -> None:
        temp = self.stack.pop()
        self.heap.remove(temp)
        heapq.heapify(self.heap)


    def top(self) -> int:
        return self.stack[-1]
        

    def getMin(self) -> int:
        return self.heap[0]
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()