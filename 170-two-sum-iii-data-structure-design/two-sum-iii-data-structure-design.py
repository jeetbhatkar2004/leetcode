class TwoSum:

    def __init__(self):
        self.backingarray = []
        
    def add(self, number: int) -> None:
        self.backingarray.append(number)
    def find(self, value: int) -> bool:
        hashset = set()
        for num in self.backingarray:
            if (value - num) in hashset:
                return True
            hashset.add(num)
        return False
        


# Your TwoSum object will be instantiated and called as such:
# obj = TwoSum()
# obj.add(number)
# param_2 = obj.find(value)