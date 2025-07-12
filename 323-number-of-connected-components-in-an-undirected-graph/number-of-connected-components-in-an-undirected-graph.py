class Solution:
    def countComponents(self, n: int, edges: List[List[int]]) -> int:
        result = 0
        completed = set()
        visiting = set()
        hashmap = defaultdict(list)
        for items in edges:
            i, j = items[0], items[1]
            hashmap[i].append(j)
            hashmap[j].append(i)
        def helper(curr, prev):
            if (curr in completed) or (curr in visiting):
                return
            visiting.add(curr)
            neighbors = hashmap[curr]
            for i in neighbors:
                if prev != i:
                    helper(i, curr)
            visiting.remove(curr)
            completed.add(curr)
        for key,value in hashmap.items():
            size = len(completed)
            helper(key, None)
            if size != len(completed):
                result = result + 1
        return result + (n-len(completed))
        