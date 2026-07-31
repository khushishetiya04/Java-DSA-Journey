/*
 * LeetCode: 83
 * Problem: Remove Duplicates from Sorted List
 * Difficulty: Easy
 *
 * Description:
 * Given the head of a sorted linked list,
 * delete all duplicates such that each
 * element appears only once.
 *
 * Return the linked list sorted as well.
 *
 * Approach:
 * - Traverse the linked list.
 * - Compare the current node with the next node.
 * - If both values are equal, skip the next node.
 * - Otherwise, move to the next node.
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}