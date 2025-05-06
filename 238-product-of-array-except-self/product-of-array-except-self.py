class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefix = [1] * len(nums)
        suffix = [1] * len(nums)
        result = [1] * len(nums)
        i = 1
        while i < len(nums):
            prefix[i] = prefix[i-1] * nums[i-1]
            i = i + 1
        i = len(nums) - 2
        while i >= 0:
            suffix[i] = suffix[i + 1] * nums[i + 1]
            i = i - 1
        i = 0
        while i < len(nums):
            result[i] = prefix[i] * suffix[i]
            i = i + 1
        return result
        
