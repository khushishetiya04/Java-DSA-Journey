/*
 * LeetCode: 142
 * Problem: Linked List Cycle II
 * Difficulty: Medium
 *
 * Description:
 * Given the head of a linked list,
 * return the node where the cycle begins.
 * If there is no cycle, return null.
 *
 * Approach:
 * - Use Floyd's Cycle Detection Algorithm.
 * - First detect whether a cycle exists.
 * - If slow and fast meet, move one pointer
 *   to the head.
 * - Move both pointers one step at a time.
 * - Their meeting point is the cycle entry.
 *
 * Pattern:
 * Fast & Slow Pointer (Floyd's Algorithm)
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Find cycle entry
                slow = head;

                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}