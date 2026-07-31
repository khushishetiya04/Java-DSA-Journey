/*
 * Topic: Add Middle in Linked List
 *
 * Description:
 * Insert a new node at a given index
 * in the linked list.
 *
 * Index starts from 0.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class AddMiddle {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    // Insert at a given index
    public void addMiddle(int index, int data) {

        // Insert at beginning
        if (index == 0) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        int i = 0;

        while (i < index - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        // Invalid index
        if (temp == null) {
            System.out.println("Invalid Index");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Print Linked List
    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        AddMiddle list = new AddMiddle();

        list.addMiddle(0, 10);
        list.addMiddle(1, 30);
        list.addMiddle(1, 20);
        list.printList();
    }
}