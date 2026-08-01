/*
 * LeetCode: 25
 * Problem: Reverse Nodes in k-Group
 * Difficulty: Hard
 *
 * Description:
 * Given the head of a linked list,
 * reverse the nodes of the list k at a time
 * and return the modified list.
 *
 * If the number of nodes is not a multiple
 * of k, leave the remaining nodes as they are.
 *
 * Approach:
 * - Use a dummy node before the head.
 * - Count the total number of nodes.
 * - Reverse every group of k nodes in-place.
 * - Connect the reversed group with the
 *   remaining list.
 *
 * Pattern:
 * Linked List, Dummy Node, Pointer Manipulation
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Count nodes
        int count = 0;
        ListNode curr = head;

        while (curr != null) {
            count++;
            curr = curr.next;
        }
        ListNode prev = dummy;
        curr = head;

        while (count >= k) {
            ListNode next = curr.next;

            for (int i = 1; i < k; i++) {
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }
            prev = curr;
            curr = curr.next;
            count -= k;
        }
        return dummy.next;
    }
}