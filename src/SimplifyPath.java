import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        System.out.print(simplifyPath(path));
    }
    public static String simplifyPath(String path) {
        StringBuilder result = new StringBuilder();
        String[] pathArray = path.split("/");
        Stack<String> stack = new Stack<>();
        for (int i=0; i<pathArray.length; i++) {
            if (pathArray[i].equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else {
                if (!pathArray[i].isBlank() && !pathArray[i].equals(".")) {
                    stack.push(pathArray[i]);
                }
            }
        }
        if (stack.isEmpty()) return "/";
        while (!stack.isEmpty()) {
            result.insert(0, stack.pop()).insert(0, "/");
        }
        return result.toString();
    }
}
