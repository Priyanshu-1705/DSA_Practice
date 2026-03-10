package A2Z_Sheet.Step6.Lec1;

public class SearchInLL {
    static Boolean find(Node head, int val){
        Node temp = head;
        while (temp!=null){
            if (temp.data == val){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        System.out.println(find(head,3));
    }
}
