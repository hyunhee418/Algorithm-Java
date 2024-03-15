import java.util.Stack;

public class ValidParenthese {

    public static void main(String[] args) {
        String s = "()";
        System.out.print(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack= new Stack<>();
        String open = "({[";
        String close = ")}]";
        for (int idx = 0; idx < s.length(); idx++) {
            char chr = s.charAt(idx);
            int closeIdx = close.indexOf(chr);
            if (open.indexOf(chr) != -1)  {
                stack.add(chr);
            } else if (closeIdx != -1) {
                if (stack.isEmpty()) return false;
                if (open.indexOf(stack.pop()) != closeIdx) return false;
            } else {
                return false;
            }
        }
        if (stack.empty()) return true;
        return false;
    }
}
