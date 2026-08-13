/*
 * LeetCode: 373
 * Problem: Find K Pairs with Smallest Sums
 * Difficulty: Medium
 *
 * Approach:
 * - Both arrays are sorted.
 * - Treat every possible pair as a candidate.
 * - Use a Min Heap to always get the pair with
 *   the smallest sum.
 *
 * Instead of adding all n*m pairs:
 * - Initially add pairs (nums1[i], nums2[0])
 *   for the first min(k, nums1.length) elements.
 * - After removing (i, j), add (i, j + 1).
 *
 * Pattern:
 * Min Heap + Sorted Arrays
 *
 * Time Complexity : O(k log k)
 * Space Complexity: O(k)
 */

class Solution {
    public List<List<Integer>> kSmallestPairs(
            int[] nums1,
            int[] nums2,
            int k) {

        List<List<Integer>> result = new ArrayList<>();

        PriorityQueue<int[]> pq =
                new PriorityQueue<>(
                    (a, b) ->
                        Integer.compare(
                            nums1[a[0]] + nums2[a[1]],
                            nums1[b[0]] + nums2[b[1]]
                        )
                );

        for (int i = 0; i < Math.min(k, nums1.length); i++) {
            pq.offer(new int[]{i, 0});
        }

        while (!pq.isEmpty() && result.size() < k) {
            int[] current = pq.poll();
            int i = current[0];
            int j = current[1];

            result.add(
                Arrays.asList(nums1[i], nums2[j])
            );

            if (j + 1 < nums2.length) {
                pq.offer(new int[]{i, j + 1});
            }
        }
        return result;
    }
}