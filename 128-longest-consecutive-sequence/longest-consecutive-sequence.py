class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        result = 0
        hashset = set()
        for num in nums:
            hashset.add(num)
        for num in hashset:
            curr = 0
            if num - 1 not in hashset:
                while num in hashset:
                    curr = curr + 1
                    num = num + 1
                result = max(result, curr)
        return result

   


    


  