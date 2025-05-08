class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        hashset = set()
        result = 0
        i = 0
        j = 0
        while i < len(s):
            while s[i] in hashset:
                hashset.remove(s[j])
                j = j + 1
            hashset.add(s[i])
            result = max(result, len(hashset))
            i = i + 1
        return result
            



