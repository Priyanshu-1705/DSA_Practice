package A2Z_Sheet.Step6.Lec2;

public class Node {
        // Stores data of the node
        int data;

        // Pointer to the next node
        public Node next;

        // Pointer to the previous node
        Node prev;

        // Constructor when data, next and prev are provided
        Node(int data1, Node next1, Node prev1) {
            data = data1;
            next = next1;
            prev = prev1;
        }

        // Constructor when only data is provided
        public Node(int data1) {
            data = data1;
            next = null;
            prev = null;
        }
}
