class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        qu = deque()
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == 2:
                    qu.append((i,j))
        level = 0
        result = 0
        while len(qu) > 0:
            size = len(qu)
            while size > 0:
                cell = qu.popleft()
                i = cell[0]
                j = cell[1]
                if i > 0:
                    if grid[i-1][j] == 1:
                        grid[i-1][j] = -2
                        result = max(result, level + 1)
                        qu.append((i-1,j))
                if j > 0:
                    if grid[i][j - 1] == 1:
                        grid[i][j - 1] = -2
                        result = max(result, level + 1)
                        qu.append((i,j - 1))
                if i < len(grid) - 1:
                    if grid[i+1][j] == 1:
                        grid[i+1][j] = -2
                        result = max(result, level + 1)
                        qu.append((i+1,j))
                if j < len(grid[0]) - 1:
                    if grid[i][j + 1] == 1:
                        grid[i][j + 1] = -2
                        result = max(result, level + 1)
                        qu.append((i,j + 1))
                size = size - 1
            level = level + 1
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] == 1:
                    return -1
        return result


         