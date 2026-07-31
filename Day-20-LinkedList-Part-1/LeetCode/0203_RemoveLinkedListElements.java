/*
 * LeetCode: 203
 * Problem: Remove Linked List Elements
 * Difficulty: Easy
 *
 * Description:
 * Remove all nodes from the linked list
 * whose value equals the given value.
 *
 * Approach:
 * - Use a dummy node before the head.
 * - Traverse the list using a pointer.
 * - If the next node has the target value,
 *   skip it.
 * - Otherwise, move to the next node.
 *
 * Pattern:
 * Linked List, Dummy Node
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null) {

            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;
    }
}