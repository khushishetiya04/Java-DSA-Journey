/*
 * LeetCode: 24
 * Problem: Swap Nodes in Pairs
 * Difficulty: Medium
 *
 * Description:
 * Given the head of a linked list,
 * swap every two adjacent nodes and
 * return the modified list.
 *
 * You must swap the nodes themselves,
 * not just their values.
 *
 * Approach:
 * - Use a dummy node before the head.
 * - Let first and second be the pair to swap.
 * - Update pointers to swap the pair.
 * - Move to the next pair.
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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            ListNode first = prev.next;
            ListNode second = first.next;

            // Swap
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move to next pair
            prev = first;
        }
        return dummy.next;
    }
}