class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        result = False
        def helper(board, i, j, currIndex, word):
            nonlocal result
            if i < 0 or j < 0 or i >= len(board) or j >= len(board[0]) or board[i][j] != word[currIndex]:
                return
            if currIndex == len(word) - 1:
                result = True
                return
            currIndex = currIndex + 1
            temp = board[i][j]
            board[i][j] = '*'
            helper(board, i + 1, j, currIndex, word)
            helper(board, i - 1, j, currIndex, word)
            helper(board, i, j + 1, currIndex, word)
            helper(board, i, j - 1, currIndex, word)
            board[i][j] = temp
        for i in range(len(board)):
            for j in range(len(board[0])):
                if board[i][j] == word[0]:
                    helper(board, i, j, 0, word)
        return result