from collections import Counter
class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        def custom_equal(map1, map2):
            for key, value in map1.items():
                if key not in map2 or value != map2[key]:
                    return False
            return True

        hashmap_s1 = Counter(s1)
        hashmap_s2 = {}
        i = 0
        j = 0
        while i < len(s2):
            char = s2[i]
            if char not in hashmap_s1:
                j = i + 1
                i = i + 1
                hashmap_s2.clear()
                continue
            if char in hashmap_s2:
                hashmap_s2[char] += 1
            else:
                hashmap_s2[char] = 1
            while hashmap_s2[char] > hashmap_s1[char] and j <= i:
                if hashmap_s2[s2[j]] == 1:
                    hashmap_s2.pop(s2[j])
                else:
                    hashmap_s2[s2[j]] -= 1
                j = j + 1
            if custom_equal(hashmap_s1, hashmap_s2):
                return True
            i += 1
        return False

            
            
        