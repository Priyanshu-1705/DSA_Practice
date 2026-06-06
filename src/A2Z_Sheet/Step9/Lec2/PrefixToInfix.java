package A2Z_Sheet.Step9.Lec2;

import java.util.Stack;

public class PrefixToInfix {
    static String prefixToPostfix(String s){
        Stack<String> stack = new Stack<>();
        for (int i= s.length()-1; i>=0; i--){
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                String temp = "("+op1+ch+op2+")";
                stack.push(temp);
            }
        }
        return stack.pop();
    }
}
