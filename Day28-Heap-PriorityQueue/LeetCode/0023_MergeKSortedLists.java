/*
 * LeetCode: 23
 * Problem: Merge k Sorted Lists
 * Difficulty: Hard
 *
 * Approach:
 * - Use a Min Heap.
 * - Put the first node of every non-empty list into the heap.
 * - The smallest node is always at the top.
 * - Remove it and add its next node.
 * - Continue until the heap becomes empty.
 *
 * Pattern:
 * Min Heap + Linked List
 *
 * Time Complexity : O(N log k)
 * Space Complexity: O(k)
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq =
                new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode head : lists) {

            if (head != null) {
                pq.offer(head);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (!pq.isEmpty()) {
            ListNode current = pq.poll();
            tail.next = current;
            tail = tail.next;

            if (current.next != null) {
                pq.offer(current.next);
            }
        }
        return dummy.next;
    }
}