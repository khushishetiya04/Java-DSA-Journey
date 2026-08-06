/*
 * Topic: Circular Queue
 *
 * Description:
 * A Circular Queue is a linear data structure
 * in which the last position is connected to
 * the first position, allowing efficient use
 * of space.
 *
 * Operations:
 * - enqueue()
 * - dequeue()
 * - peek()
 * - isEmpty()
 * - isFull()
 * - display()
 *
 * Time Complexity:
 * enqueue  : O(1)
 * dequeue  : O(1)
 * peek     : O(1)
 * isEmpty  : O(1)
 * isFull   : O(1)
 * display  : O(n)
 *
 * Space Complexity: O(n)
 */

public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;

        System.out.println(data + " inserted");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int removed = queue[front];
        front = (front + 1) % capacity;
        size--;
        return removed;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue: ");

        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();

        System.out.println("Removed: " + queue.dequeue());

        queue.display();

        queue.enqueue(50);
        queue.enqueue(60);

        queue.display();

        System.out.println("Front Element: " + queue.peek());
    }
}