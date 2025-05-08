class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        hashmap = {}
        i = 0
        j = 0
        currmax = 0
        result = 0
        for i in range(0, len(s)):
            if s[i] in hashmap:
                hashmap[s[i]] += 1
            else:
                hashmap[s[i]] = 1
            currmax = max(currmax, hashmap[s[i]])
            if ((i - j + 1) - currmax) > k:
                if hashmap[s[j]] == 1:
                    hashmap.pop(s[j])
                else:
                    hashmap[s[j]] -= 1
                j = j + 1
            result = max(result, i - j + 1)
            i = i + 1
        return result






