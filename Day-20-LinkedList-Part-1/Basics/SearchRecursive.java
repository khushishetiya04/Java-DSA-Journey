/*
 * Topic: Recursive Search in Linked List
 *
 * Description:
 * Search for a given key recursively.
 *
 * Returns the index of the key if found,
 * otherwise returns -1.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n) (Recursion Stack)
 */

public class SearchRecursive {
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

    // Recursive Search Helper
    private int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }
        int index = helper(head.next, key);

        if (index == -1) {
            return -1;
        }
        return index + 1;
    }

    // Recursive Search
    public int search(int key) {
        return helper(head, key);
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
        SearchRecursive list = new SearchRecursive();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.printList();

        System.out.println("Index of 30 : " + list.search(30));
        System.out.println("Index of 50 : " + list.search(50));
    }
}