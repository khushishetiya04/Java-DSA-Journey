/*
 * LeetCode: 232
 * Problem: Implement Queue using Stacks
 * Difficulty: Easy
 *
 * Description:
 * Implement a First In First Out (FIFO)
 * queue using only two stacks.
 *
 * Supported Operations:
 * - push
 * - pop
 * - peek
 * - empty
 *
 * Approach:
 * - Use two stacks:
 *   1. input  -> stores newly inserted elements.
 *   2. output -> provides queue front.
 * - Transfer elements from input to output
 *   only when output becomes empty.
 *
 * Pattern:
 * Stack, Queue Design
 *
 * Time Complexity:
 * Push  : O(1)
 * Pop   : Amortized O(1)
 * Peek  : Amortized O(1)
 * Empty : O(1)
 *
 * Space Complexity: O(n)
 */

class MyQueue {

    private Stack<Integer> input;
    private Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        move();
        return output.pop();
    }

    public int peek() {
        move();
        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    // Transfer elements only when needed
    private void move() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */