class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hashmap = {}
        for strings in strs:
            sorted_string = ''.join(sorted(strings))
            if sorted_string in hashmap:
                hashmap.get(sorted_string).append(strings)
            else:
                hashmap[sorted_string] = []
                hashmap.get(sorted_string).append(strings)
        return list(hashmap.values())

      



        