/*
 * LeetCode: 61
 * Problem: Rotate List
 * Difficulty: Medium
 *
 * Description:
 * Given the head of a linked list,
 * rotate the list to the right by k places.
 *
 * Approach:
 * - Find the length of the list.
 * - Connect the last node to the head
 *   to form a circular linked list.
 * - Compute the effective rotations:
 *      k = k % length
 * - Find the new tail.
 * - Break the circle and return the new head.
 *
 * Pattern:
 * Linked List, Two Pointer
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k %= length;

        if (k == 0) {
            return head;
        }

        // Make circular list
        tail.next = head;

        int steps = length - k;
        ListNode newTail = tail;

        while (steps-- > 0) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}