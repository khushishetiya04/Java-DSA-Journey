/*
 * Topic: Queue using Array
 *
 * Description:
 * A Queue is a linear data structure that follows
 * the FIFO (First In First Out) principle.
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
 * enqueue() : O(1)
 * dequeue() : O(n)
 * peek()    : O(1)
 * isEmpty() : O(1)
 * isFull()  : O(1)
 * display() : O(n)
 *
 * Space Complexity: O(n)
 */

public class QueueUsingArray {
    private int[] queue;
    private int rear;
    private int capacity;

    public QueueUsingArray(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return rear == capacity - 1;
    }

    public void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue Overflow");
            return;
        }

        queue[++rear] = data;
        System.out.println(data + " inserted");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int removed = queue[0];

        for (int i = 0; i < rear; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;

        return removed;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -1;
        }
        return queue[0];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue: ");

        for (int i = 0; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);

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