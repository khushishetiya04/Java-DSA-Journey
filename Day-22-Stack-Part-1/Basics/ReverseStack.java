/*
 * Topic: Reverse Stack using Recursion
 *
 * Description:
 * Reverse the elements of a stack
 * without using any extra stack.
 *
 * Algorithm:
 * 1. Pop the top element.
 * 2. Recursively reverse the remaining stack.
 * 3. Insert the popped element at the bottom.
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(n)
 */

import java.util.Stack;
public class ReverseStack {
    // Insert an element at the bottom of the stack
    public static void insertAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, data);
        stack.push(top);
    }

    // Reverse the stack
    public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reverse(stack);
        insertAtBottom(stack, top);
    }

    // Print stack from top to bottom
    public static void print(Stack<Integer> stack) {
        Stack<Integer> temp = new Stack<>();

        while (!stack.isEmpty()) {
            int val = stack.pop();
            System.out.print(val + " ");
            temp.push(val);
        }

        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.print("Original Stack (Top -> Bottom): ");
        print(stack);

        reverse(stack);

        System.out.print("Reversed Stack (Top -> Bottom): ");
        print(stack);
    }
}