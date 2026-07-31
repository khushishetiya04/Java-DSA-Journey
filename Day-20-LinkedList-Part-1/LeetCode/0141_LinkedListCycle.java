/*
 * LeetCode: 141
 * Problem: Linked List Cycle
 * Difficulty: Easy
 *
 * Description:
 * Given the head of a linked list,
 * determine if the linked list has a cycle.
 *
 * Return true if there is a cycle,
 * otherwise return false.
 *
 * Approach:
 * - Use Floyd's Cycle Detection Algorithm.
 * - Maintain two pointers:
 *      Slow -> moves one step.
 *      Fast -> moves two steps.
 * - If they ever meet, a cycle exists.
 * - If fast reaches null, no cycle exists.
 *
 * Pattern:
 * Fast & Slow Pointer
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
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}