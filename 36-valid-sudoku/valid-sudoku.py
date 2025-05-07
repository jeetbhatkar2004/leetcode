class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        cols = set()
        rows = set()
        boxes = set()
        i = 0
        j = 0
        while i < len(board):
            j = 0
            while j < len(board[0]):
                curr = board[i][j]
                currrow = str(curr) + "in row " + str(i)
                currcol = str(curr) + "in col " + str(j)
                currbox = str(curr) + "in box " + str(i//3) + " and " + str(j//3)
                if curr == '.':
                    j = j + 1
                    continue
                if (currcol in cols) or (currrow in rows) or (currbox in boxes):
                    return False
                cols.add(str(curr) + "in col " + str(j))
                rows.add(str(curr) + "in row " + str(i))
                boxes.add(str(curr) + "in box " + str(i//3) + " and " + str(j//3))
                j = j + 1
            i = i + 1
        return True
            

        
        