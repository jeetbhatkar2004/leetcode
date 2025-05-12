from collections import Counter
class Solution:
    def minWindow(self, s: str, t: str) -> str:
        def check(s,t):
            for key, value in t.items():
                if (key not in s) or (value > s.get(key)):
                    return False
            return True
        dict_t = Counter(t)
        dict_s = {}
        i = 0
        j = 0
        result = ""
        resultsize = inf
        currstring = ""
        while i < len(s):
            currstring = currstring + s[i]
            if s[i] in dict_s:
                dict_s[s[i]] += 1
            else:
                dict_s[s[i]] = 1
            while check( dict_s, dict_t) and j <= i:
                if(len(currstring) < resultsize):
                    result = currstring
                    resultsize = len(currstring)
                if dict_s[s[j]] > 1:
                    dict_s[s[j]] -= 1
                else:
                    dict_s.pop(s[j])
                currstring = currstring[1:]
                j = j + 1
            i = i + 1
        return result
            
            
                
            
        
        