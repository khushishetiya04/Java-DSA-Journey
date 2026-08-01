/*
 * LeetCode: 138
 * Problem: Copy List with Random Pointer
 * Difficulty: Medium
 *
 * Description:
 * Create a deep copy of a linked list where
 * each node has an additional random pointer.
 *
 * Approach:
 * 1. Insert copied nodes between original nodes.
 * 2. Assign random pointers for copied nodes.
 * 3. Separate the original and copied lists.
 *
 * Pattern:
 * Linked List, Deep Copy
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        // Step 1: Insert copied nodes
        Node curr = head;

        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        // Step 2: Copy random pointers
        curr = head;

        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate both lists
        Node dummy = new Node(0);
        Node copyCurr = dummy;
        curr = head;

        while (curr != null) {
            Node copy = curr.next;
            curr.next = copy.next;
            copyCurr.next = copy;
            copyCurr = copy;
            curr = curr.next;
        }
        return dummy.next;
    }
}