class Solution:
    def solve(self, board: List[List[str]]) -> None:
        def helper(board, i , j):
            if i < 0 or j < 0 or i >= len(board) or j >= len(board[0]) or board[i][j] != 'O':
                return
            board[i][j] = '*'
            helper(board, i + 1, j)       
            helper(board, i - 1, j)
            helper(board, i, j + 1)
            helper(board, i, j - 1)

        for i in range(len(board)):
            helper(board, i, 0)
            helper(board, i, len(board[0]) -1)
        for i in range(len(board[0])):
            helper(board, 0, i)
            helper(board, len(board) - 1, i)
        for i in range(len(board)):
            for j in range(len(board[0])):
                if board[i][j] == 'O':
                    board[i][j] = 'X'
                if board[i][j] == '*':
                    board[i][j] = 'O'
        
        