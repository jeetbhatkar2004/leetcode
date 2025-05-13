class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        l = ['(', '{', '[']
        openingset = set(l)
        for char in s:
            if char in openingset:
                stack.append(char)
            elif(not stack):
                return False
            elif char == '}':
                temp = stack.pop()
                if (temp != '{'):
                    return False
            elif char == ')':
                temp = stack.pop()
                if (temp != '('):
                    return False                
            elif char == ']':
                temp = stack.pop()
                if (temp != '['):
                    return False        
        return len(stack) == 0
                

