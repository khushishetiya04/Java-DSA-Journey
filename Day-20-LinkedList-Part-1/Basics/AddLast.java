/*
 * Topic: Add Last in Linked List
 *
 * Description:
 * Insert a new node at the end of
 * the linked list.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class AddLast {
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

        // Empty List
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
        AddLast list = new AddLast();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.printList();
    }
}