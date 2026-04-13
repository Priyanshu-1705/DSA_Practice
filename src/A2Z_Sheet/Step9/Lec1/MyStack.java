package A2Z_Sheet.Step9.Lec1;
//Ps:225
import java.util.*;

class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);

        // Rotate the queue
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove(); // front = top
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}

