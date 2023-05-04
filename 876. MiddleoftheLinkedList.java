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
    public ListNode middleNode(ListNode head) {
    if (head == null) {//verificação se a lista está vazia para evitar NullPointerException
        return null;
    }    
    ListNode auxLento = head;
    ListNode auxRapido = head;
    return buscaMeio(auxLento,auxRapido);

    }

    private ListNode buscaMeio(ListNode auxLento,ListNode auxRapido){
        if(auxRapido != null && auxRapido.next != null){
            return buscaMeio(auxLento.next,auxRapido.next.next);
        }else{//auxRapido == null || auxRapido.next == null: chegou ao final da lista e pode retornar o meio
            return auxLento;
        }
    }
}
