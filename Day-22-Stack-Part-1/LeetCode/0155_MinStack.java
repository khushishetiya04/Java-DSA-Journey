/*
 * LeetCode: 155
 * Problem: Min Stack
 * Difficulty: Medium
 *
 * Description:
 * Design a stack that supports:
 * - push
 * - pop
 * - top
 * - getMin
 *
 * All operations must work in O(1) time.
 *
 * Approach:
 * - Use two stacks:
 *   1. Main stack stores all elements.
 *   2. Min stack stores the minimum element
 *      at every level.
 *
 * Pattern:
 * Stack Design
 *
 * Time Complexity:
 * Push   : O(1)
 * Pop    : O(1)
 * Top    : O(1)
 * getMin : O(1)
 *
 * Space Complexity: O(n)
 */

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    public void pop() {
        if (stack.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}