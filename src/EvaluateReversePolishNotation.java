import java.util.List;
import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] intervals = {"3","11","+","5","-"};
        System.out.println(evalRPN(intervals));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int idx = 0; idx < tokens.length; idx++) {
            String token = tokens[idx];
            if (token.equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b+a);
            }else if (token.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b-a);
            }else if (token.equals("*")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b*a);
            }else if (token.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.add(b/a);
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
