class Solution:
    def carFleet(self, target: int, position: List[int], speed: List[int]) -> int:
        tuplearr = []
        stack = []
        def helper(target, position, speed):
            return (target-position)/speed
        for i in range(0, len(position)):
            tuplearr.append((-position[i], speed[i]))
        tuplearr.sort()
        for element in tuplearr:
            if stack and stack[-1] >= helper(target, -element[0], element[1]):
                continue
            else:
                stack.append(helper(target, -element[0], element[1]))
        return len(stack)




        