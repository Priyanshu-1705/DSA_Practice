package A2Z_Sheet.Step6.Lec3;

import java.util.ArrayList;
import java.util.Collections;


public class Sort {
    static ListNode sortList(ListNode head) {
        //Brute force
        if (head == null || head.next == null) return head;
        ArrayList<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);
        ListNode newHead = new ListNode(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            insertAtEnd(newHead, list.get(i));
        }
        return newHead;


        //Optimal approach


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
