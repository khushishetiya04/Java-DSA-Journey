/*
 * Topic: Stack using Deque
 *
 * Description:
 * Implement a Stack using Java's Deque interface.
 *
 * Deque (Double Ended Queue) allows insertion
 * and deletion from both ends.
 *
 * Stack Operations:
 * - push() -> addFirst()
 * - pop()  -> removeFirst()
 * - peek() -> peekFirst()
 *
 * Time Complexity:
 * Push  : O(1)
 * Pop   : O(1)
 * Peek  : O(1)
 *
 * Space Complexity: O(n)
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingDeque {
    static class Stack {
        private Deque<Integer> deque;

        public Stack() {
            deque = new ArrayDeque<>();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }

        public void push(int data) {
            deque.addFirst(data);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return deque.removeFirst();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return deque.peekFirst();
        }

        public void print() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }
            System.out.print("Top -> ");

            for (int value : deque) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.print();

        System.out.println("Peek: " + stack.peek());

        System.out.println("Pop: " + stack.pop());

        stack.print();

        System.out.println("Is Empty: " + stack.isEmpty());
    }
}