package A2Z_Sheet.Step6.Lec3;
//Ps:238
import java.util.ArrayList;

public class OddEven {
    static ListNode oddEvenList(ListNode head) {
        //Brute force
//        ArrayList<Integer> oddList = new ArrayList<>();
//        ArrayList<Integer> evenList = new ArrayList<>();
//        ListNode temp = head;
//        int i = 1;
//        while (temp!=null){
//            if ((i & 1) == 1){
//                oddList.add(temp.val);
//            }else {
//                evenList.add(temp.val);
//            }
//            i++;
//            temp = temp.next;
//        }
//        ListNode newHead = new ListNode(oddList.get(0));
//        for (int j = 1; j < oddList.size(); j++) {
//            insertAtEnd(newHead, oddList.get(j));
//        }
//        for (int j = 0; j < evenList.size(); j++) {
//            insertAtEnd(newHead, evenList.get(j));
//        }
//        return newHead;

        //Optimal approach
        if (head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    static void insertAtEnd(ListNode head, int k){
        ListNode node = new ListNode(k);
        ListNode temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }
}
