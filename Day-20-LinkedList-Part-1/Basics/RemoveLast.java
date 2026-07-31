/*
 * Topic: Remove Last Node from Linked List
 *
 * Description:
 * Delete the last node of the linked list.
 *
 * Cases:
 * 1. Empty list
 * 2. Single node
 * 3. Multiple nodes
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class RemoveLast {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    // Insert at the end
    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Remove last node
    public void removeLast() {
        // Empty List
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        // Single Node
        if (head.next == null) {
            head = null;
            return;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }

        // Remove last node
        prev.next = null;
    }

    // Print Linked List
    public void printList() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        RemoveLast list = new RemoveLast();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        System.out.println("Before Removal:");
        list.printList();

        list.removeLast();

        System.out.println("After Removal:");
        list.printList();
    }
}