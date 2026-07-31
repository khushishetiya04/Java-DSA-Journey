/*
 * LeetCode: 21
 * Problem: Merge Two Sorted Lists
 * Difficulty: Easy
 *
 * Description:
 * Merge two sorted linked lists and return
 * the merged sorted list.
 *
 * Approach:
 * - Use a dummy node.
 * - Compare nodes from both lists.
 * - Attach the smaller node to the result.
 * - Move the corresponding pointer.
 * - Append the remaining nodes.
 *
 * Pattern:
 * Linked List, Dummy Node
 *
 * Time Complexity : O(n + m)
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        // Append remaining nodes
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }
        return dummy.next;
    }
}