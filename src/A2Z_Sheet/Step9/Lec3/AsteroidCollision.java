package A2Z_Sheet.Step9.Lec3;
//Ps:735

import java.util.*;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i : asteroids) {
            boolean destroyed = false;
            while (!stack.isEmpty() && stack.peek() > 0 && i < 0) {
                int top = stack.peek();
                if (Math.abs(top) == Math.abs(i)) {
                    stack.pop();
                    destroyed = true;
                    break;
                }
                else if (Math.abs(top) > Math.abs(i)) {
                    destroyed = true;
                    break;
                }
                else {
                    stack.pop();
                }
            }
            if (!destroyed) {
                stack.push(i);
            }
        }
        int[] ans = new int[stack.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;

        //Better Implementation
//        int[] stack = new int[asteroids.length];
//        int top = -1;
//        for (int a : asteroids) {
//            while (top >= 0 && stack[top] > 0 && a < 0) {
//                if (stack[top] < -a) {
//                    top--; // pop
//                }
//                else if (stack[top] == -a) {
//                    top--; // both destroyed
//                    a = 0;
//                    break;
//                }
//                else {
//                    a = 0; // current destroyed
//                    break;
//                }
//            }
//            if (a != 0) {
//                stack[++top] = a;
//            }
//        }
//        return Arrays.copyOfRange(stack,0,top+1);
    }
}