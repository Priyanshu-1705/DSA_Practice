package A2Z_Sheet.Step6.Lec1;

public class InsertAtHead {
    static Node insertAtHead(Node head, int val){
        Node node = new Node(val,head);
        return node;
    }

    static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        display(head);
        head = insertAtHead(head,1);
        display(head);
    }
}
