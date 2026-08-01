/*
 * Topic: Dummy Node Technique
 *
 * Description:
 * A Dummy Node is an extra node placed
 * before the head of a linked list.
 *
 * It simplifies insertion and deletion,
 * especially when the head node changes.
 *
 * Time Complexity : O(1)
 * Space Complexity: O(1)
 */

public class DummyNodeTechnique {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Delete all nodes having the given key
    public static Node delete(Node head, int key) {
        Node dummy = new Node(-1);
        dummy.next = head;
        Node curr = dummy;

        while (curr.next != null) {
            if (curr.next.data == key) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return dummy.next;
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
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(2);

        System.out.println("Before:");
        print(head);

        head = delete(head, 2);

        System.out.println("After:");
        print(head);
    }
}