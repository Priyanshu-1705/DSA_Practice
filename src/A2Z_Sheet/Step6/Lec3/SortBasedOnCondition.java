package A2Z_Sheet.Step6.Lec3;

public class SortBasedOnCondition {
    static ListNode sort(ListNode head){
        if (head == null || head.next == null)
            return head;

        // Dummy nodes
        ListNode zeroD = new ListNode(-1);
        ListNode oneD = new ListNode(-1);
        ListNode twoD = new ListNode(-1);

        // Tail pointers
        ListNode zero = zeroD;
        ListNode one = oneD;
        ListNode two = twoD;

        ListNode curr = head;

        // Step 1: Distribute nodes into 3 lists
        while (curr != null) {
            if (curr.val == 0) {
                zero.next = curr;
                zero = zero.next;
            }
            else if (curr.val == 1) {
                one.next = curr;
                one = one.next;
            }
            else {
                two.next = curr;
                two = two.next;
            }
            curr = curr.next;
        }

        // Step 2: Connect lists
        // 0 -> 1 or 2
        if (oneD.next != null)
            zero.next = oneD.next;
        else
            zero.next = twoD.next;

        // 1 -> 2
        one.next = twoD.next;

        // End list
        two.next = null;

        // New head
        if (zeroD.next != null)
            return zeroD.next;
        else if (oneD.next != null)
            return oneD.next;
        else
            return twoD.next;
    }
}
