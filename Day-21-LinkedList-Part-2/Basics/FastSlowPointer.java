/*
 * Topic: Fast & Slow Pointer Technique
 *
 * Description:
 * Fast & Slow Pointer is a common Linked List
 * technique where:
 *
 * - Slow pointer moves one step at a time.
 * - Fast pointer moves two steps at a time.
 *
 * Applications:
 * - Find Middle Node
 * - Detect Cycle
 * - Find Cycle Entry
 * - Check Palindrome
 * - Reorder Linked List
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class FastSlowPointer {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Find Middle Node
    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Print Linked List
    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        print(head);
        Node middle = findMiddle(head);
        System.out.println("Middle Node: " + middle.data);
    }
}