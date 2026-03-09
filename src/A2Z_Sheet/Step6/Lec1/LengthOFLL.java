package A2Z_Sheet.Step6.Lec1;

public class LengthOFLL {
    static int length(Node head){
        Node temp = head;
        int length = 0;
        while (temp!=null){
            length++;
            temp = temp.next;
        }
        return length;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        System.out.println(length(head));
    }
}
