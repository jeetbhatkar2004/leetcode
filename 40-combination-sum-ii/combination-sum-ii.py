class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        result = []
        currSum = 0
        def helper(candidates, target, currPath, currIndex):
            nonlocal result
            nonlocal currSum
            if currSum == target:
                result.append(currPath.copy())
            if currSum > target:
                return
            for i in range(currIndex, len(candidates)):
                if i > currIndex and candidates[i] == candidates[i-1]:
                    continue
                currPath.append(candidates[i])
                currSum = currSum + candidates[i]
                helper(candidates, target, currPath, i + 1)
                removed = currPath.pop()
                currSum = currSum - removed
        candidates.sort()
        helper(candidates, target, [], 0)
        return result
        
        