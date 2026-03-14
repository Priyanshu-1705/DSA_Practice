package A2Z_Sheet.Step6.Lec3;

import A2Z_Sheet.Step6.Lec2.Node;

public class ListNode {
      int val;
      ListNode next;
      ListNode(int val) {
          this.val = val;
      }
      ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }

    static void display(ListNode head){
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val+" <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
