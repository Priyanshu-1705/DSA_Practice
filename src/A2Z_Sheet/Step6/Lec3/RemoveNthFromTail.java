package A2Z_Sheet.Step6.Lec3;
//Ps:19
public class RemoveNthFromTail {
    static ListNode removeNthFromEnd(ListNode head, int n) {
        //Brute force
//        if (head == null) return null;
//        // Step 1: Find length
//        ListNode temp = head;
//        int length = 0;
//        while (temp != null) {
//            length++;
//            temp = temp.next;
//        }
//        // Step 2: If removing the head
//        if (n == length) {
//            return head.next;
//        }
//        // Step 3: Find previous node of the one to delete
//        int ind = length - n;
//        temp = head;
//        for (int i = 1; i < ind; i++) {
//            temp = temp.next;
//        }
//        // Step 4: Delete node
//        temp.next = temp.next.next;
//        return head;

        //Optimal
        if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        // Move fast n steps
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        // Edge case: remove head
        if (fast == null) {
            return head.next;
        }
        // Move both
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        // Remove node
        slow.next = slow.next.next;
        return head;
    }

}
