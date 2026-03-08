package A2Z_Sheet.Step6.Lec1;
//Ps:237
public class DeletionAtLastNode {
    static void display(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    static Node deletionAtLastNode(Node head){
        if (head == null || head.next == null){
            return null;
        }
        // Traverse to the second last node
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        // Delete tail node
        curr.next = null;
        // Return updated head
        return head;
    }

//    public void deleteNode(ListNode node) {
//        //We don’t delete the node —
//        //we copy the next node’s data and remove the next node.
//        node.val = node.next.val;
//        node.next = node.next.next;
//    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node node1 = new Node(2);
        head.next = node1;
        Node node2 = new Node(3);
        node1.next = node2;
        display(head);
        deletionAtLastNode(head);
        display(head);

    }
}
