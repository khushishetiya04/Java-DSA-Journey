/*
 * LeetCode: 86
 * Problem: Partition List
 * Difficulty: Medium
 *
 * Description:
 * Given the head of a linked list and an
 * integer x, partition the list such that
 * all nodes with values less than x come
 * before nodes with values greater than or
 * equal to x.
 *
 * The relative order of the nodes in each
 * partition should be preserved.
 *
 * Approach:
 * - Create two dummy lists:
 *      1. Nodes < x
 *      2. Nodes >= x
 * - Traverse the original list and append
 *   each node to the appropriate list.
 * - Connect both lists.
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
    public ListNode partition(ListNode head, int x) {
        ListNode smallerDummy = new ListNode(0);
        ListNode greaterDummy = new ListNode(0);

        ListNode smaller = smallerDummy;
        ListNode greater = greaterDummy;

        while (head != null) {
            if (head.val < x) {
                smaller.next = head;
                smaller = smaller.next;
            } else {
                greater.next = head;
                greater = greater.next;
            }
            head = head.next;
        }

        greater.next = null;
        smaller.next = greaterDummy.next;
        return smallerDummy.next;
    }
}