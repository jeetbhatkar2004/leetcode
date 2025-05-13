class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        operations_set = set(['+', '-', '*', '/'])
        stack = []
        i = 0
        for char in tokens:
            if char in operations_set:
                secondelement = stack.pop()
                firstelement = stack.pop()
                if (char == '+'):
                    stack.append(secondelement + firstelement)
                if (char == '-'):
                    stack.append(firstelement - secondelement) 
                if (char == '*'):
                    stack.append(secondelement * firstelement)  
                if (char == '/'):
                    stack.append(int(firstelement / secondelement))
            else:
                stack.append(int(char))
            i = i + 1
        return stack.pop()
                
            
        