class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        result = []
        def swap(nums, i , j):
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
        def helper(nums, currIndex):
            nonlocal result
            if currIndex == len(nums):
                result.append(nums.copy())
            for i in range(currIndex, len(nums)):
                swap(nums, i, currIndex)
                helper(nums, currIndex + 1)
                swap(nums, i, currIndex)
        helper(nums, 0)
        return result