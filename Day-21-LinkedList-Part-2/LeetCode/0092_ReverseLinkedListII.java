/*
 * LeetCode: 92
 * Problem: Reverse Linked List II
 * Difficulty: Medium
 *
 * Description:
 * Reverse a linked list from position
 * left to right and return the modified list.
 *
 * Positions are 1-indexed.
 *
 * Approach:
 * - Use a dummy node before the head.
 * - Move prev to the node before 'left'.
 * - Reverse the sublist using head insertion.
 * - Connect the reversed sublist back.
 *
 * Pattern:
 * Linked List, Dummy Node, In-place Reversal
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        // Move prev to the node before 'left'
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }
        ListNode curr = prev.next;

        // Reverse the sublist
        for (int i = 0; i < right - left; i++) {
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
        }
        return dummy.next;
    }
}