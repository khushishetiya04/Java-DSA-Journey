/*
 * Topic: Node Creation in Linked List
 *
 * Description:
 * A Node is the basic building block of
 * a singly linked list.
 *
 * Each node contains:
 * 1. Data
 * 2. Reference to the next node
 *
 * Time Complexity : O(1)
 * Space Complexity: O(1)
 */

public class Node {
    int data;
    Node next;

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Linking the nodes
        first.next = second;
        second.next = third;

        // Traversing the linked list
        Node temp = first;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}