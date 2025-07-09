# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
        result = True
        prev = None
        def helper(root):
            nonlocal result
            nonlocal prev
            if not root:
                return None
            helper(root.left)
            if prev and prev.val >= root.val:
                result = False
                return
            prev = root
            helper(root.right)
        helper(root)
        return result

        
        

