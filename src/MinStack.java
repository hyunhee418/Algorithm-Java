import java.util.Stack;

public class MinStack {
    private final Stack<Integer> stack;
    private int topValue;
    private int minValue;
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        topValue = val;
        if (stack.isEmpty()) {
            minValue = val;
        } else {
            minValue = Math.min(val, minValue);
        }
        stack.push(val);
    }

    public void pop() {
        int a = stack.pop();
        if (!stack.isEmpty()) {
            topValue = stack.pop();
            stack.push(topValue);
            if (a == minValue) {
                minValue = stack.stream().min(Integer::compareTo).get();
            }
        }
    }

    public int top() {
        return topValue;
    }

    public int getMin() {
        return minValue;
    }
    public static void main() {
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);
        System.out.println(minStack.top()); // -3을 반환
        minStack.pop();
        System.out.println(minStack.getMin()); // -2를 반환
        minStack.pop();
        System.out.println(minStack.getMin()); // -2를 반환
        minStack.pop();
        minStack.push(2147483647);
        System.out.println(minStack.top()); // -3을 반환
        System.out.println(minStack.getMin()); // -2를 반환
        minStack.push(-2147483647);
        System.out.println(minStack.top()); // -3을 반환
        System.out.println(minStack.getMin()); // -2를 반환
        minStack.pop();
        System.out.println(minStack.getMin()); // 0을 반환
    }
}

