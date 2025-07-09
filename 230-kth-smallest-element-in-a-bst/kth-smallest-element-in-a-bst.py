class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        result = 0
        curr = 1
        def helper(root):
            nonlocal result
            nonlocal curr
            nonlocal k
            if not root:
                return None
            helper(root.left)
            if curr == k:
                result = root.val
            curr = curr + 1
            helper(root.right)
        helper(root)
        return result
            

        