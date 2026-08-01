/*
 * LeetCode: 160
 * Problem: Intersection of Two Linked Lists
 * Difficulty: Easy
 *
 * Description:
 * Given the heads of two singly linked lists,
 * return the node at which the two lists intersect.
 * If the two linked lists have no intersection,
 * return null.
 *
 * Approach:
 * - Use two pointers.
 * - Traverse both lists.
 * - When a pointer reaches the end,
 *   redirect it to the head of the other list.
 * - They will either meet at the intersection
 *   or both become null.
 *
 * Pattern:
 * Two Pointer
 *
 * Time Complexity : O(n + m)
 * Space Complexity: O(1)
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {
            p1 = (p1 == null) ? headB : p1.next;
            p2 = (p2 == null) ? headA : p2.next;
        }
        return p1;
    }
}