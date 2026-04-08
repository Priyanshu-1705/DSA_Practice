package A2Z_Sheet.Step9.Lec1;

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class ImplementStackUsingLinkedLIst {
    private Node head;
    private int size;

    public ImplementStackUsingLinkedLIst() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // O(1)
    public void push(int item) {
        Node node = new Node(item);
        node.next = head;
        head = node;
        size++;
    }

    // O(1)
    public int pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty!!!");
        }
        int removed = head.data;
        head = head.next;
        size--;
        return removed;
    }

    // O(1)
    public int peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty!!!");
        }
        return head.data;
    }

    public int size() {
        return size;
    }
}