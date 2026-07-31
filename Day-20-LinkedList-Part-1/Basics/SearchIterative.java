/*
 * Topic: Iterative Search in Linked List
 *
 * Description:
 * Search for a given key by traversing
 * the linked list iteratively.
 *
 * Returns the index of the key if found,
 * otherwise returns -1.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class SearchIterative {
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

    // Iterative Search
    public int search(int key) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == key) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1;
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
        SearchIterative list = new SearchIterative();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.printList();

        System.out.println("Index of 30 : " + list.search(30));
        System.out.println("Index of 50 : " + list.search(50));
    }
}