class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashmap = {}
        res = [-1,-1]
        i = 0
        while i < len(nums):
            if (target - nums[i]) in hashmap:
                res[0] = i
                res[1] = hashmap.get(target - nums[i])
                return res
            hashmap[nums[i]] = i
            i = i + 1 
        return res




        