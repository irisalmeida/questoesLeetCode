
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
        // Caso base para recursão: quando head ou head.next é null
        if (head == null || head.next == null) {
            return head;
        }

        // Se os valores de head e head.next forem iguais, chame recursivamente com head.next
        if (head.val == head.next.val) {
            return deleteDuplicates(head.next);
        } 
        // Se os valores de head e head.next não forem iguais, chame recursivamente com head.next
        else {
            head.next = deleteDuplicates(head.next);
            return head;
        }
    }
}


//Versão iterativa:
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
		if(head == null){
			return null;

    }
        ListNode node = head;
        while (node.next != null) {
            if (node.val == node.next.val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}
