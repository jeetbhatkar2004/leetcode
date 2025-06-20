# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        fast = head
        slow = head
        first = True
        while(True):
            if slow == fast and not first:
                return True
            if fast is None or fast.next is None:
                break
            first = False
            slow = slow.next
            fast = fast.next.next
        return False
        