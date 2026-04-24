package A2Z_Sheet.Step9.Lec1;
//Ps:20
import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else {
                if (stack.isEmpty()) return false;
                char top = stack.peek();
                if (ch == ')' && top != '(') return false;
                if (ch == '}' && top != '{') return false;
                if (ch == ']' && top != '[') return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
