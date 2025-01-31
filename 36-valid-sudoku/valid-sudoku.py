import math
class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        hashset = set()
        for i in range(0, len(board)):
            for j in range(0, len(board[0])):
                row = str(board[i][j]) + "in row " + str(i)
                col = str(board[i][j])+ "in col " + str(j)
                box = str(board[i][j])+ "in box " + str(i//3) + "" + str(j//3)
                if board[i][j] == ".":
                    continue
                if (row in hashset) or (col in hashset) or (box in hashset):
                    return False
                hashset.add(row)
                hashset.add(col)
                hashset.add(box)
        return True


        