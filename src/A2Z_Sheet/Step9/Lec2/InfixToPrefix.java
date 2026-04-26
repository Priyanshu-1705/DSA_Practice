package A2Z_Sheet.Step9.Lec2;

import java.util.*;
public class InfixToPrefix {
    public String infixToPrefix(String s){
        // Step 1: Reverse string
        StringBuilder input = new StringBuilder(s);
        input.reverse();

        // Step 2: Swap brackets
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(')
                input.setCharAt(i, ')');
            else if (input.charAt(i) == ')')
                input.setCharAt(i, '(');
        }
        // Step 3: Convert to postfix
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toString().toCharArray()) {

            if (Character.isLetterOrDigit(ch)) {
                result.append(ch);
            }

            else if (ch == '(') {
                stack.push(ch);
            }

            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }

            else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        // Step 4: Reverse result
        return result.reverse().toString();
    }
    private static int precedence(char ch){
        if (ch == '^'){
            return 3;
        } else if (ch == '*' || ch == '/') {
            return 2;
        } else if (ch == '+' || ch == '-') {
            return 1;
        }
        return -1;
    }
}
