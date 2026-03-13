package A2Z_Sheet.Step6.Lec2;

public class Reverse {
    static Node reverse(Node head){
        //Brute force
//        if (head == null) return null;
//        Node temp = head;
//        while (temp.next != null){
//            temp = temp.next;
//        }
//        Node node = temp;
//        while (temp.prev != null){
//            insertAtEnd(node,temp.prev.data);
//            temp = temp.prev;
//        }
//        return node;


        Node current = head;
        Node last = null;
        while (current != null) {
            Node temp = current.next;
            current.next = current.prev;
            current.prev = temp;

            last = current; // new head
            current = temp; // move forward
        }
        return last;
    }

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
        Node head = new Node(3);
        head.next = new Node(2,null, head);
        head.next.next = new Node(1,null,head.next);
        display(head);

        Node head1 = reverse(head);
        display(head1);
    }
}
