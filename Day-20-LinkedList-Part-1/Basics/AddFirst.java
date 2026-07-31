/*
 * Topic: Add First in Linked List
 *
 * Description:
 * Insert a new node at the beginning of
 * the linked list.
 *
 * Time Complexity : O(1)
 * Space Complexity: O(1)
 */

public class AddFirst {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    // Insert at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
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
        AddFirst list = new AddFirst();

        list.addFirst(30);
        list.addFirst(20);
        list.addFirst(10);
        list.printList();
    }
}