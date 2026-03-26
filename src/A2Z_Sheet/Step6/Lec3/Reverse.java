package A2Z_Sheet.Step6.Lec3;
//Ps:206
public class Reverse {
    static ListNode reverseList(ListNode head) {
        //Brute force
//        ListNode newHead = null;
//        ListNode curr = head;
//
//        while (curr != null) {
//            newHead = insertAtHead(newHead, curr.val);
//            curr = curr.next;
//        }
//        return newHead;

        //Optimal
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next; // save next
            curr.next = prev;          // reverse link
            prev = curr;               // move prev
            curr = next;               // move curr
        }
        return prev;
    }

     private static ListNode insertAtHead(ListNode head, int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        return node;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        ListNode.display(head);
        head = reverseList(head);
        ListNode.display(head);
    }
}
