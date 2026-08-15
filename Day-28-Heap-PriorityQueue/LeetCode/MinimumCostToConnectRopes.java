/*
 * Problem: Minimum Cost to Connect Ropes
 *
 * Approach:
 * - Always connect the two smallest ropes.
 * - Add their sum to the total cost.
 * - Put the combined rope back into the Min Heap.
 *
 * Pattern:
 * Min Heap + Greedy
 *
 * Time Complexity : O(n log n)
 * Space Complexity: O(n)
 */

public class MinimumCostToConnectRopes {
    public static int minCost(int[] ropes) {
        if (ropes == null || ropes.length <= 1) {
            return 0;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int rope : ropes) {
            pq.offer(rope);
        }
        int totalCost = 0;

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int cost = first + second;

            totalCost += cost;
            pq.offer(cost);
        }
        return totalCost;
    }

    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};
        System.out.println(minCost(ropes));
    }
}