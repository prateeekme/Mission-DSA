package Codopedia;

import java.util.Stack;

public class minimum_stack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public void MinStack() {

        stack = new Stack<>();
        minStack = new Stack<>();

    }

    public void push(int val) {
        stack.push(val);
        val = Math.min(val, minStack.isEmpty() ? val : minStack.peek());
        minStack.push(val);

    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        stack.peek();
        return 0;
    }

    public int getMin() {
        Stack<Object> minstack = null;
        minstack.peek();
        return 0;
    }
}