package Codopedia.Array;

/*
 * Minimum Stack
 * 
 * Design a stack class that supports the following operations: 
 * 1. push(val): Push the element 'val' onto the stack.
 * 2. pop(): Remove the element on the top of the stack.
 * 3. top(): Retrieve the top element of the stack.
 * 4. getMin(): Retrieve the minimum element in the stack.
 *
 * The goal is to ensure each operation runs in O(1) time.
 *
 * Example 1:
 * Input: ["MinStack", "push", 1, "push", 2, "push", 0, "getMin", "pop", "top", "getMin"]
 * Output: [null,null,null,null,0,null,2,1]
 *
 * Explanation:
 * MinStack minStack = new MinStack();
 * minStack.push(1);
 * minStack.push(2);
 * minStack.push(0);
 * minStack.getMin();  // returns 0
 * minStack.pop();
 * minStack.top();     // returns 2
 * minStack.getMin();  // returns 1
 *
 * Constraints:
 * - The values will always be within the range: -2^31 <= val <= 2^31 - 1.
 * - The stack will never be empty when pop, top, or getMin operations are called.
 */

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
