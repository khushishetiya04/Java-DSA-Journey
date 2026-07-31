/*
 * Topic: Clear Linked List
 *
 * Description:
 * Remove all nodes from the linked list
 * by setting the head to null.
 *
 * Time Complexity : O(1)
 * Space Complexity: O(1)
 */

public class ClearLinkedList {
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

    // Clear the Linked List
    public void clear() {
        head = null;
    }

    // Check if Linked List is Empty
    public boolean isEmpty() {
        return head == null;
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
        ClearLinkedList list = new ClearLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        System.out.println("Before Clear:");
        list.printList();

        list.clear();

        System.out.println("After Clear:");
        list.printList();

        System.out.println("Is Empty: " + list.isEmpty());
    }
}