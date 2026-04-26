package A2Z_Sheet.Step9.Lec2;

import java.util.Stack;

public class InfixToPostfix {
    static String infixToPostfix(String s){

        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (char ch: s.toCharArray()){
            if (ch == ' ') continue;
            if (ch == '('){
                stack.push(ch);
            }
            else if (ch == ')') {
                while (!stack.isEmpty()){
                    if (stack.peek() == '('){
                        stack.pop();
                        break;
                    }else res.append(stack.pop());
                }
            }
            else if (ch == '+' || ch == '-' || ch == '^' || ch == '*' || ch == '/') {

                // Pop while (higher precedence) OR (equal precedence & left associative)
                while (!stack.isEmpty() && stack.peek() != '(' &&
                        (priority(stack.peek()) > priority(ch) ||
                                (priority(stack.peek()) == priority(ch) && ch != '^'))) {
                    res.append(stack.pop());
                }

                stack.push(ch);
            }
            else {
                res.append(ch);
            }
        }

        while (!stack.isEmpty()){
            res.append(stack.pop());
        }

        return res.toString();
    }

    private static int priority(char ch){
        if (ch == '^'){
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "(p + q) * (m - n)";
        System.out.println(infixToPostfix(s));

    }
}
