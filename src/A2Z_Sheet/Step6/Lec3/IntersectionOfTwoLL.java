package A2Z_Sheet.Step6.Lec3;
//Ps:160
import java.util.HashMap;

public class IntersectionOfTwoLL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //Brute force
//        while (headA!=null){
//            ListNode temp = headB;
//            while (temp!=null){
//                if (headA == temp){
//                    return headA;
//                }
//                temp = temp.next;
//            }
//            headA = headA.next;
//        }
//        return null;

        //Better approach
//        HashMap<ListNode,Integer> nodeMap = new HashMap<>();
//        ListNode temp = headA;
//        while (temp != null){
//            nodeMap.put(temp,1);
//            temp = temp.next;
//        }
//        temp = headB;
//        while (temp!=null){
//            if (nodeMap.containsKey(temp)){
//                return temp;
//            }
//            temp = temp.next;
//        }
//        return null;

        //Optimal approach - 1
//        int len = getDifference(headA,headB);
//        if (len < 0) {
//            while (len++ != 0) headB = headB.next;
//        } else {
//            while (len-- != 0) headA = headA.next;
//        }
//        while (headA!=null){
//            if (headA == headB) return headA;
//            headA = headA.next;
//            headB = headB.next;
//        }
//        return null;

        //Optimal approach - 2
        if (headA == null || headB == null)
            return null;
        ListNode pA = headA;
        ListNode pB = headB;
        // Traverse until they meet
        while (pA != pB) {
            // If reached end, switch list
            pA = (pA == null) ? headB : pA.next;
            pB = (pB == null) ? headA : pB.next;
        }
        // Either intersection node or null
        return pA;
    }

    private static int getDifference(ListNode head1, ListNode head2) {
        int len1 = 0, len2 = 0;
        while (head1 != null || head2 != null) {
            if (head1 != null) {
                len1++;
                head1 = head1.next;
            }
            if (head2 != null) {
                len2++;
                head2 = head2.next;
            }
        }
        return len1 - len2;  // If negative, length of list2 > length of list1, else vice-versa
    }
}
