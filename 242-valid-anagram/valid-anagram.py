from collections import Counter
class Solution:
    def isAnagram(self, s: str, t: str):
        maps = Counter(s)
        mapt = Counter(t)
        return maps == mapt

        
        

        
