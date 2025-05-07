class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        result = set()
        i = 0
        while i < len(nums):
            j = i + 1
            k = len(nums) - 1
            while j < k:
                curr = nums[i] + nums[j] + nums[k]
                if(curr == 0):
                    result.add((nums[i], nums[j], nums[k]))
                    j = j + 1
                    k = k - 1
                if(curr > 0):
                    k = k - 1
                if(curr < 0):
                    j = j + 1
            i = i + 1
        return list(result)



        