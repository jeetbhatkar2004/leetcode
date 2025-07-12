class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:
        hashmap = {}
        visited = set()
        completed = set()
        for item in prerequisites:
            key = item[0]
            val = item[1]
            if key in hashmap:
                hashmap[key].append(val)
            else:
                hashmap[key] = []
                hashmap[key].append(val)
        result = True
        def helper(curr):
            nonlocal result
            if (curr not in hashmap) or (curr in completed):
                return
            if curr in visited:
                result = False
                return
            visited.add(curr)
            for i in hashmap[curr]:
                helper(i)
            visited.remove(curr)
            completed.add(curr)
        for item in hashmap:
            helper(item)
            if not result:
                return False
        return result
        