package A2Z_Sheet.Step6.Lec3;
//Ps:876
public class MiddleNode {
    static ListNode middleNode(ListNode head) {
        //Brute force
//        ListNode temp = head;
//        int count = 0;
//        while (temp!=null){
//            count++;
//            temp = temp.next;
//        }
//        count = count / 2;
//        temp = head;
//        for (int i = 0; i < count; i++) {
//            temp = temp.next;
//        }
//        return temp;

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
