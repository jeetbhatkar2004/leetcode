class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        left = 0
        right = (len(matrix) * len(matrix[0])) - 1
        while left <= right:
            mid = left + (right - left)//2
            mid1 = mid // len(matrix[0])
            mid2 = mid - ((mid1 + 1) * len(matrix[0]))
            if matrix[mid1][mid2] == target:
                return True
            elif matrix[mid1][mid2] > target:
                right = mid -1
            else:
                left = mid + 1
        return False


                
        
        
            
