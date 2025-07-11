class Solution:
    def wallsAndGates(self, rooms: List[List[int]]) -> None:
        """
        Do not return anything, modify rooms in-place instead.
        """
        qu = deque()
        for i in range(len(rooms)):
            for j in range(len(rooms[i])):
                if rooms[i][j] == 0:
                    qu.append((i,j))
        level = 0
        while len(qu) > 0:
            size = len(qu)
            while size > 0:
                currgate = qu.popleft() # get back to this
                i, j = currgate[0], currgate[1]
                if i > 0:
                    if rooms[i-1][j] == 2147483647:
                        rooms[i-1][j] = level + 1
                        qu.append((i-1, j))
                if j > 0:
                    if rooms[i][j-1] == 2147483647:
                        rooms[i][j-1] = level + 1
                        qu.append((i, j - 1))               
                if i < len(rooms) - 1:
                    if rooms[i+1][j] == 2147483647:
                        rooms[i+1][j] = level + 1
                        qu.append((i+1, j))
                if j < len(rooms[0]) - 1:
                    if rooms[i][j + 1] == 2147483647:
                        rooms[i][j + 1] = level + 1
                        qu.append((i, j + 1))
                size = size - 1
            level = level + 1

        
                



        
        

        



             