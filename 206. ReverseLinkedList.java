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
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode anterior = null;//começa no NIL
        ListNode atual = head;
        return inverte(anterior,atual);
    }  

    private ListNode inverte(ListNode anterior,ListNode atual){
        if(atual != null){
            ListNode aux = atual.next;
            atual.next = anterior;
            return inverte(atual,aux);
        }else{//chegou ao final e pode retornar 
            return anterior;
        }
    }

}
