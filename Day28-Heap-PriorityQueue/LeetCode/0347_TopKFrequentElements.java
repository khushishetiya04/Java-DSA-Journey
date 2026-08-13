/*
 * LeetCode: 347
 * Problem: Top K Frequent Elements
 * Difficulty: Medium
 *
 * Approach:
 * 1. Count frequency of every number using HashMap.
 * 2. Use a Min Heap based on frequency.
 * 3. Keep only K elements in the heap.
 * 4. The heap contains the K most frequent elements.
 *
 * Pattern:
 * HashMap + Min Heap + Top K
 *
 * Time Complexity : O(n log k)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(
                    (a, b) -> map.get(a) - map.get(b)
                );

        for (int num : map.keySet()) {
            pq.offer(num);

            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] ans = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            ans[i] = pq.poll();
        }
        return ans;
    }
}