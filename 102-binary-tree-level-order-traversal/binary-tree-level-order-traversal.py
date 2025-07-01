# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        result = []
        queue = []
        if not root:
            return result
        queue.append(root)
        while(queue):
            size = len(queue)
            current = []
            while(size > 0):
                curr = queue.pop(0)
                current.append(curr.val)
                if curr.left:
                    queue.append(curr.left)
                if curr.right:
                    queue.append(curr.right)
                size = size - 1
            result.append(current)
        return result


