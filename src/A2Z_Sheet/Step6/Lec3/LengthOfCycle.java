package A2Z_Sheet.Step6.Lec3;


import A2Z_Sheet.Step6.Lec2.Node;

import java.util.HashMap;

public class LengthOfCycle {
    static int length(Node head){
        //Brute force
//        HashMap<Node,Integer> nodeMap = new HashMap<>();
//        Node temp = head;
//        int length = 0;
//        int timer = 0;
//        while (temp!=null){
//            if (nodeMap.containsKey(temp)){
//                length = timer - nodeMap.get(temp);
//                return length;
//            }else{
//                nodeMap.put(temp,timer++);
//                temp = temp.next;
//            }
//        }
//        return length;

        //Optimal approach
        Node slow = head;
        Node fast = head;
        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // Cycle found, count length
                int length = 1;
                Node temp = slow.next;
                while (temp != slow) {
                    length++;
                    temp = temp.next;
                }
                return length;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Linking the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Creating a loop from fifth to second
        fifth.next = third;
        System.out.println(length(head));
    }
}
