import java.util.HashMap;
import java.util.Map;

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
    public ListNode deleteDuplicates(ListNode head) {
        // Map to store the frequency of each value in the linked list
        Map<Integer, Boolean> map = new HashMap<>();
        ListNode curr = head;

        // First pass to count the occurrences of each value
        while (curr != null) {
            if (map.containsKey(curr.val)) {
                map.put(curr.val, false);
            } else {
                map.put(curr.val, true);
            }
            curr = curr.next;
        }

        // Dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        ListNode res = dummy;

        // Second pass to construct the result list with only unique values
        curr = head;
        while (curr != null) {
            if (map.get(curr.val)) {
                res.next = new ListNode(curr.val);
                res = res.next;
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}
