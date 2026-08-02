/*
 * Topic: Stack using Linked List
 *
 * Description:
 * Implement a Stack using a Singly Linked List.
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

public class StackUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        private Node top;

        public Stack() {
            top = null;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack Underflow");
                return -1;
            }
            int value = top.data;
            top = top.next;
            return value;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return top.data;
        }

        public void print() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }
            System.out.print("Top -> ");
            Node temp = top;

            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
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