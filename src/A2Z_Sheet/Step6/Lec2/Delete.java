package A2Z_Sheet.Step6.Lec2;

public class Delete {
    static int deleteAtEnd(Node head){
        Node temp = head;
        // Edge case: only one node
        if (head == null || head.next == null) {
            int val = head.data;
            head = null;
            return val;
        }
        // Move to second last node
        while (temp.next.next != null){
            temp = temp.next;
        }
        int val = temp.next.data;  // last node value
        temp.next = null;          // delete last node
        return val;
    }
    static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2,null, head);
        head.next.next = new Node(3,null,head.next);
        display(head);
        deleteAtEnd(head);
        display(head);
    }
}
