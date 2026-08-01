/*
 * LeetCode: 19
 * Problem: Remove Nth Node From End of List
 * Difficulty: Medium
 *
 * Description:
 * Given the head of a linked list,
 * remove the nth node from the end
 * and return the head.
 *
 * Approach:
 * - Use a dummy node before the head.
 * - Maintain two pointers: fast and slow.
 * - Move fast n+1 steps ahead.
 * - Move both pointers until fast reaches null.
 * - slow.next is the node to remove.
 *
 * Pattern:
 * Two Pointer, Dummy Node
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove nth node
        slow.next = slow.next.next;
        return dummy.next;
    }
}