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
    public boolean isPalindrome(ListNode head) {
      ListNode meio = middleNode(head);
      ListNode segundoHead = reverseList(meio);
      ListNode reverterAoInicio = segundoHead;
        
      while (head !=null && segundoHead !=null){
          if(head.val != segundoHead.val) {
              break;
          }
        head = head.next;
        segundoHead = segundoHead.next;
      }
        reverseList(reverterAoInicio);
          
        if((head ==null || segundoHead ==null)){
            return true;
        } else{
            return false;
        }
    }
    
    
    //MÉTODO QUE ENCONTRA O ELEMENTO DO MEIO DA LINKEDLIST
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
    
    //MÉTODO QUE INVERTE A LINKEDLIST
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
