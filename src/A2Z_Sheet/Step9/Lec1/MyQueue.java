package A2Z_Sheet.Step9.Lec1;
//Ps:232

import java.util.*;

class MyQueue {

//    LinkedList<Integer> first;
//    LinkedList<Integer> sec;
//    public MyQueue() {
//        first = new LinkedList<>();
//        sec = new LinkedList<>();
//    }
//    public void push(int x) {
//        first.addLast(x);  // enqueue
//    }
//    public int pop() {
//        // move all elements except last
//        while (first.size() > 1) {
//            sec.addLast(first.removeFirst());
//        }
//        int removed = first.removeFirst(); // actual pop
//        // swap lists
//        LinkedList<Integer> temp = first;
//        first = sec;
//        sec = temp;
//        return removed;
//    }
//    public int peek() {
//        return first.getFirst();
//    }
//    public boolean empty() {
//        return first.isEmpty();
//    }

        //Amortized version
        Stack<Integer> input = new Stack<>();
        Stack<Integer> output = new Stack<>();
        public void push(int x) {
            input.push(x);
        }
        public int pop() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            return output.pop();
        }
        public int peek() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            return output.peek();
        }
        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }
}
