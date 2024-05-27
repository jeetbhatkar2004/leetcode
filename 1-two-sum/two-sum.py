class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hash = {}
        count = 0
        for i in nums:
            com = target - i
            if(com in hash):
                return [count, hash.get(com)]
            hash[i] = count
            count = count + 1
        return [-1,-1]

        