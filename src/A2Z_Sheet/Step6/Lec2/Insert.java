package A2Z_Sheet.Step6.Lec2;

public class Insert {
    static void insertAtEnd(Node head, int k){
        if (head == null){
            head = new Node(k);
        }
        Node node = new Node(k);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        node.prev = temp;
        temp.next = node;
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
        insertAtEnd(head,2);
        display(head);
    }
}
