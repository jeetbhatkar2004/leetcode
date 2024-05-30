/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    ListNode helper(ListNode slow, ListNode fast){
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int count = 0;
        while( fast != null && fast.next != null){
            if(count != 0 && fast == slow){
                slow = head;
               return helper(slow, fast);
            }
            fast = fast.next.next;
            slow = slow.next;
            count++;
        }
        return null;

    }
}