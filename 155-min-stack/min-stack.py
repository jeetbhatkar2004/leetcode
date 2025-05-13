class MinStack:

    def __init__(self):
        self.stack = []
        self.currmin = inf
    def push(self, val: int) -> None:
        self.currmin = min(self.currmin, val)
        self.stack.append([val, self.currmin])
    
    def pop(self) -> None:
        self.stack.pop()
        if self.stack:
            self.currmin = self.stack[-1][1]
        else:
            self.currmin = inf


    def top(self) -> int:
        return self.stack[-1][0]
        

    def getMin(self) -> int:
        return self.stack[-1][1]
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()