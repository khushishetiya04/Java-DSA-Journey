/*
 * Topic: Queue using Linked List
 *
 * Description:
 * A Queue is a linear data structure that follows
 * the FIFO (First In First Out) principle.
 *
 * This implementation uses a Linked List,
 * allowing O(1) enqueue and dequeue operations.
 *
 * Operations:
 * - enqueue()
 * - dequeue()
 * - peek()
 * - isEmpty()
 * - display()
 *
 * Time Complexity:
 * enqueue() : O(1)
 * dequeue() : O(1)
 * peek()    : O(1)
 * isEmpty() : O(1)
 * display() : O(n)
 *
 * Space Complexity: O(n)
 */

public class QueueUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }
    private Node front;
    private Node rear;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data + " inserted");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int removed = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        return removed;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        Node temp = front;
        System.out.print("Queue: ");

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        System.out.println("Removed: " + queue.dequeue());

        queue.display();

        System.out.println("Front Element: " + queue.peek());
    }
}