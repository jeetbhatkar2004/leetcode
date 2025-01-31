class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        result = 0
        hashset = set(nums)
        for j in hashset:
            if j - 1 not in hashset:
                curr = 1
                temp = j
                while temp+1 in hashset:
                    curr = curr + 1
                    temp = temp + 1
                result = max(curr, result)
        return result


        