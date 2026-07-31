/*
 * LeetCode: 876
 * Problem: Middle of the Linked List
 * Difficulty: Easy
 *
 * Description:
 * Given the head of a singly linked list,
 * return the middle node.
 *
 * If there are two middle nodes,
 * return the second middle node.
 *
 * Approach:
 * - Use two pointers:
 *      Slow -> moves one step.
 *      Fast -> moves two steps.
 * - When fast reaches the end,
 *   slow will be at the middle.
 *
 * Pattern:
 * Fast & Slow Pointer
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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}