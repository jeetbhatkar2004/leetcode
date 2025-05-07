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
                currrow = (curr, i)
                currcol = (curr, j)
                currbox = (curr, i//3, j//3)
                if curr == '.':
                    j = j + 1
                    continue
                if (currcol in cols) or (currrow in rows) or (currbox in boxes):
                    return False
                cols.add((curr, j))
                rows.add((curr, i))
                boxes.add((curr, i//3, j//3))
                j = j + 1
            i = i + 1
        return True
            

        
        