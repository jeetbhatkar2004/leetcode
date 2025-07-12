class Solution:
    def validTree(self, n: int, edges: List[List[int]]) -> bool:
        hashmap = defaultdict(list)
        visiting = set()
        completed = set()
        result = True
        for items in edges:
            i, j = items[0], items[1]
            hashmap[i].append(j)
            hashmap[j].append(i)
        def helper(curr, prev):
            nonlocal result
            if curr in visiting:
                result = False
                return
            if curr in completed:
                return
            visiting.add(curr)
            neighbors = hashmap[curr]
            for i in neighbors:
                if i != prev:
                    helper(i, curr)
            visiting.remove(curr)
            completed.add(curr)
        helper(0, None)
        if not result:
            return False
        if len(completed) != n:
            return False
        return True

        