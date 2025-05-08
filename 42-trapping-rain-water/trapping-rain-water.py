class Solution:
    def trap(self, height: List[int]) -> int:
        # left = 0 TRIED TO DO THE O(1) APPROACH BUT IONO WHATS WRONG
        # right = len(height) - 1
        # leftmax = 0
        # rightmax = 0
        # result = 0
        # while left < right:
        #     leftmax = max(leftmax, left)
        #     rightmax = max(rightmax, right)
        #     if height[left] < height[right]:
        #         left = left + 1
        #         result = result + (leftmax - height[left])
        #     else:
        #         right = right - 1
        #         result = result + (rightmax - height[right])
        # return result
        leftmax = [0] * len(height)
        rightmax = [0] * len(height)
        currmax = 0
        result = 0
        for i in range(0, len(height)):
            leftmax[i] = currmax
            currmax = max(currmax, height[i])
        currmax = 0
        for i in range(len(height) - 1, -1, -1):
            rightmax[i] = currmax
            currmax = max(currmax, height[i])
        for i in range(0, len(height)):
            result = result + max((min(leftmax[i], rightmax[i])) - height[i], 0)
        return result

        
        
