# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def diameterOfBinaryTree(self, root: Optional[TreeNode]) -> int:
        self.result = 0
        def helper(root):
            if not root:
                return 0
            left = helper(root.left)
            right = helper(root.right)
            self.result = max(self.result, left + right)
            return max(left, right) + 1
        helper(root)
        return self.result
            


        