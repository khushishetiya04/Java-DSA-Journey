/*
 * LeetCode: 206
 * Problem: Reverse Linked List
 * Difficulty: Easy
 *
 * Description:
 * Reverse a singly linked list and
 * return the new head.
 *
 * Approach:
 * - Maintain three pointers:
 *      prev, curr, next
 * - Reverse the link of the current node.
 * - Move all pointers one step ahead.
 * - When traversal ends, prev becomes
 *   the new head.
 *
 * Pattern:
 * Linked List
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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}