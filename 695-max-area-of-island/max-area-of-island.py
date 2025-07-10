class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        result = 0
        curr = 0
        def helper(grid, i , j):
            nonlocal result
            nonlocal curr
            if i < 0 or j < 0 or i >= len(grid) or j >= len(grid[0]) or grid[i][j] != 1:
                return
            grid[i][j] = 2
            curr = curr + 1
            helper(grid, i + 1, j)
            helper(grid, i - 1, j)
            helper(grid, i, j - 1)
            helper(grid, i, j + 1)

        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == 1:
                    curr = 0
                    helper(grid, i , j)
                    result = max(result, curr)
        return result

        