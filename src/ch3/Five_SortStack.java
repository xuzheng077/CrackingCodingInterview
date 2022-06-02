package ch3;

import java.util.Stack;

/**
 * @author Xu Zheng
 * @description
 */
public class Five_SortStack {
    private static Stack<Integer> sortStack(Stack<Integer> stack) {
        if (stack == null || stack.isEmpty()) {
            return null;
        }
        //auxiliary stack
        Stack<Integer> helper = new Stack<>();
        while (!stack.isEmpty()) {
            int top = stack.pop();
            if (helper.isEmpty()) {
                helper.push(top);
            } else {
                while (!helper.isEmpty() && helper.peek() < top) {
                    stack.push(helper.pop());
                }
                helper.push(top);
            }
        }
        return helper;
    }

    public static void main(String[] args) {
        Stack<Integer> test = new Stack<>();
        test.push(1);
        test.push(12);
        test.push(8);
        test.push(10);
        test.push(5);
        Stack<Integer> result = sortStack(test);
        while (!result.isEmpty()) {
            System.out.println(result.pop());
        }
    }
}
