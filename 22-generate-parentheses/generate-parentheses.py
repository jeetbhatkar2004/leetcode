class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        res = []
        stack = []
        def helper(l, r, n):
            if l == r == n:
                res.append("".join(stack))
                return
            if l < n:
                stack.append('(')
                helper(l + 1, r, n)
                stack.pop()
            if r < l:
                stack.append(')')
                helper(l, r + 1, n)
                stack.pop()
        helper(0,0,n)
        return res
        

        