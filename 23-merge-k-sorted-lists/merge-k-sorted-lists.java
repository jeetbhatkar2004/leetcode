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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        ListNode curr = new ListNode();
        while (i < lists.length){
            curr = lists[i];
            while(curr != null){
                res.add(curr.val);
                curr = curr.next;
            }
            i++;
        }
        Collections.sort(res);
        if(res.size() < 1){
            return null;
        }
        i = 1;
        ListNode head = new ListNode(res.get(0));
        ListNode ans = head;
        while(i < res.size()){
            head.next = new ListNode(res.get(i));
            head = head.next;
            i++;
        }
        return ans;
    }
}