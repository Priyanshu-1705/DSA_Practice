package A2Z_Sheet.Step6.Lec3;
//Ps:2095
public class DeleteMiddle {
    static ListNode deleteMiddle(ListNode head) {
        //brute force
//        ListNode temp = head;
//        int count = 0;
//        while (temp!=null){
//            count++;
//            temp = temp.next;
//        }
//        count = count / 2;
//        temp = head;
//        for (int i = 0; i < count - 1; i++) {
//            temp = temp.next;
//        }
//        temp.next = temp.next.next;
//        return head;


        //Optimal approach
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;
        // Move pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Delete middle
        slow.next = slow.next.next;
        return head;
    }
}
