/*
 * Topic: Print Linked List
 *
 * Description:
 * Traverse the linked list from head
 * to null and print each node.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class PrintLinkedList {
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

    // Print the Linked List
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
        PrintLinkedList list = new PrintLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.printList();
    }
}