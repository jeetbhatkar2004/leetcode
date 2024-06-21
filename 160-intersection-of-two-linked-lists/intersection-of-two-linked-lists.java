/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode lista, ListNode listb) {
        Set<ListNode> lla = new HashSet<>();
        Set<ListNode> llb = new HashSet<>();
        while(lista != null || listb != null ){
            if(lista == listb){
                return lista;
            }
            if(llb.contains(lista)){
                return lista;
            }
            if(lla.contains(listb)){
                return listb;
            }
            lla.add(lista);
            llb.add(listb);
            if(lista != null){
                lista = lista.next;
            }
            if(listb != null){
                listb = listb.next;
            }
        }
        return null;
    }
}