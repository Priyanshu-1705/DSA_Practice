package A2Z_Sheet.Step9.Lec2;

import java.util.Stack;

public class PostfixToInfix {
    static String postfixToInfix(String s){
        Stack<String> stack = new Stack<>();
        for (char ch: s.toCharArray()){
            if (Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }else {
                String op2 = stack.pop();
                String op1 = stack.pop();
                String temp = "("+op1+ch+op2+")";
                stack.push(temp);
            }
        }
        return stack.pop();
    }
}
