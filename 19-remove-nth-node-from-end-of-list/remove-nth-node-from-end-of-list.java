/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            count++;
        }
        curr = head;
        if(count == n){
            head = head.next;
            return head;
        }
        int jump = count - n -1;
        while(jump > 0){
            curr = curr.next;
            jump--;
        }
        curr.next = curr.next.next;
        return head;
    }
}