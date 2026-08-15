/*
 * LeetCode: 703
 * Problem: Kth Largest Element in a Stream
 * Difficulty: Easy
 *
 * Approach:
 * - Maintain a Min Heap containing only K elements.
 * - The smallest element in this heap is the Kth largest
 *   element in the entire stream.
 *
 * Pattern:
 * Kth Largest + Min Heap
 *
 * Time Complexity:
 * Constructor -> O(n log k)
 * add()       -> O(log k)
 *
 * Space Complexity: O(k)
 */

class KthLargest {
    private PriorityQueue<Integer> pq;
    private int k;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>();

        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {
        pq.offer(val);

        if (pq.size() > k) {
            pq.poll();
        }

        return pq.peek();
    }
}