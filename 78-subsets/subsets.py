class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        result = []
        def helper(nums, currlist, curr):
            nonlocal result
            result.append(currlist.copy())
            for i in range(curr, len(nums)):
                currlist.append(nums[i])
                helper(nums, currlist, i + 1)
                currlist.pop()
        helper(nums, [], 0)
        return result
        
        