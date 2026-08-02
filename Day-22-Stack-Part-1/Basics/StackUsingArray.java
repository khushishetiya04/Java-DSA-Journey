/*
 * Topic: Stack using Array
 *
 * Description:
 * Implement a Stack using an array.
 *
 * Supported Operations:
 * - Push
 * - Pop
 * - Peek
 * - isEmpty
 *
 * Time Complexity:
 * Push  : O(1)
 * Pop   : O(1)
 * Peek  : O(1)
 *
 * Space Complexity: O(n)
 */

public class StackUsingArray {
    static class Stack {
        private int[] arr;
        private int top;
        private int capacity;

        public Stack(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            top = -1;
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public boolean isFull() {
            return top == capacity - 1;
        }

        public void push(int data) {
            if (isFull()) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = data;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top];
        }

        public void print() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }
            System.out.print("Top -> ");

            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

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