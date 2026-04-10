package A2Z_Sheet.Step9.Lec1;
//Ps:155
import java.util.Stack;

public class MinStack {
    Stack<Long> stack;
    long min;

    public MinStack() {
        stack = new Stack<>();
        min = Long.MAX_VALUE;
    }

    public void push(int val) {
        long v = val;
        if (stack.isEmpty()) {
            stack.push(v);
            min = v;
        } else {
            if (v > min) {
                stack.push(v);
            } else {
                stack.push(2 * v - min);
                min = v;
            }
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;

        long x = stack.peek();
        stack.pop();

        if (x < min) {
            min = 2 * min - x;
        }

        if (stack.isEmpty()) {
            min = Long.MAX_VALUE;
        }
    }

    public int top() {
        if (stack.isEmpty()) return -1;

        long x = stack.peek();
        if (x > min) return (int)x;
        return (int)min;
    }

    public int getMin() {
        if (stack.isEmpty()) return -1;
        return (int)min;
    }
}
