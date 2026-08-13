/*
 * LeetCode: 215
 * Problem: Kth Largest Element in an Array
 * Difficulty: Medium
 *
 * Approach:
 * - Use a Min Heap of size k.
 * - Add every element to the heap.
 * - If heap size becomes greater than k,
 *   remove the smallest element.
 * - At the end, the heap contains the k largest elements.
 * - The root is the kth largest element.
 *
 * Pattern:
 * Top K + Min Heap
 *
 * Time Complexity : O(n log k)
 * Space Complexity: O(k)
 */

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }
}