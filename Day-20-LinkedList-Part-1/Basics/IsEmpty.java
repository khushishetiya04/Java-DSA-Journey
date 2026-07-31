/*
 * Topic: Check if Linked List is Empty
 *
 * Description:
 * Check whether the linked list contains
 * any nodes.
 *
 * If head is null, the linked list is empty.
 *
 * Time Complexity : O(1)
 * Space Complexity: O(1)
 */

public class IsEmpty {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    // Check if the linked list is empty
    public boolean isEmpty() {
        return head == null;
    }

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

    public static void main(String[] args) {
        IsEmpty list = new IsEmpty();
        System.out.println("Is Empty: " + list.isEmpty());

        list.addLast(10);
        System.out.println("Is Empty: " + list.isEmpty());
    }
}