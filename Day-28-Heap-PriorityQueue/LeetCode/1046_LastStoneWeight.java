/*
 * LeetCode: 1046
 * Problem: Last Stone Weight
 * Difficulty: Easy
 *
 * Approach:
 * - Use a Max Heap because we always need the two
 *   heaviest stones.
 * - Remove the two largest stones.
 * - If they are different, add their difference back.
 * - Continue until at most one stone remains.
 *
 * Pattern:
 * Max Heap + Simulation
 *
 * Time Complexity : O(n log n)
 * Space Complexity: O(n)
 */

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq =
                new PriorityQueue<>((a, b) -> b - a);

        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1) {
            int first = pq.poll();e
            int second = pq.poll();

            if (first != second) {
                pq.offer(first - second);
            }
        }

        if (pq.isEmpty()) {
            return 0;
        }
        return pq.peek();
    }
}