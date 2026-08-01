/*
 * Topic: Two Pointer Technique
 *
 * Description:
 * Two Pointer Technique uses two pointers
 * moving through the linked list to solve
 * problems efficiently.
 *
 * Unlike Fast & Slow Pointer, both pointers
 * usually move one step at a time, but they
 * start from different positions or follow
 * different traversal strategies.
 *
 * Applications:
 * - Remove Nth Node From End
 * - Find Intersection of Two Linked Lists
 * - Merge Two Sorted Lists
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class TwoPointerTechnique {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Find intersection of two linked lists
    public static Node getIntersection(Node headA, Node headB) {
        Node p1 = headA;
        Node p2 = headB;

        while (p1 != p2) {
            p1 = (p1 == null) ? headB : p1.next;
            p2 = (p2 == null) ? headA : p2.next;
        }
        return p1;
    }

    public static void main(String[] args) {
        Node common = new Node(8);
        common.next = new Node(10);

        Node headA = new Node(3);
        headA.next = new Node(7);
        headA.next.next = common;

        Node headB = new Node(99);
        headB.next = common;

        Node intersection = getIntersection(headA, headB);

        if (intersection != null) {
            System.out.println("Intersection Node: " + intersection.data);
        } else {
            System.out.println("No Intersection");
        }
    }
}