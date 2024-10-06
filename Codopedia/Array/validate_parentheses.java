package Codopedia.Array;

/*
 * Problem Statement: Valid Parentheses
 *
 * Description:
 * You are given a string 's' consisting of the following characters: '(', ')', '{', '}', '[' and ']'.
 * The input string 's' is valid if and only if:
 * 1. Every open bracket has a corresponding close bracket of the same type.
 * 2. Open brackets are closed in the correct order.
 * 3. Every close bracket has a corresponding open bracket of the same type.
 *
 * Your task:
 * Write a function that takes the input string 's' and returns 'true' if it is valid, and 'false' otherwise.
 *
 * Examples:
 * 1. Input: s = "[]"
 *    Output: true
 *    Explanation: The string contains a single pair of matching brackets.
 *
 * 2. Input: s = "([{}])"
 *    Output: true
 *    Explanation: The string contains nested and matching brackets in the correct order.
 *
 * 3. Input: s = "[(])"
 *    Output: false
 *    Explanation: The brackets are not closed in the correct order.
 *
 * Constraints:
 * - 1 <= s.length <= 10^4
 * - 's' consists only of the characters '(', ')', '{', '}', '[' and ']'.
 *
 * Approach:
 * 1. Use a stack to keep track of opening brackets.
 * 2. When encountering a closing bracket, check if it matches the top of the stack.
 *    - If matched, pop the top of the stack.
 *    - If not matched or the stack is empty, return false.
 * 3. At the end, if the stack is empty, return true, indicating all brackets are matched and closed correctly.
 *
 * Time Complexity: O(n) - where 'n' is the length of the string. Each character is processed once.
 * Space Complexity: O(n) - in the worst case, all opening brackets are stored in the stack.
 */

import java.util.Stack;

public class validate_parentheses {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){

            if (c=='(' || c=='{' || c=='['){
                stack.push(c);
            }
            else{
                if(c==')' || c=='}' || c==']'){

                    if(stack.isEmpty()){
                        return false;
                    }

                    char top = stack.pop();
                    if((c==')' && top!='(') ||
                            (c=='}' && top!='{') ||
                            (c==']' && top!='[')) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
