/*
 * Practice: Minimum Cost to Connect Ropes
 *
 * Pattern: Greedy Algorithm + Min Heap
 *
 * Description:
 * Given ropes of different lengths, connect all the ropes into one rope
 * with minimum total cost.
 *
 * The cost of connecting two ropes is equal to the sum of their lengths.
 *
 * Greedy Idea:
 * Always connect the two shortest ropes first.
 * This minimizes the total cost of all connections.
 *
 * Approach:
 * 1. Insert all rope lengths into a Min Heap.
 * 2. Remove the two smallest ropes.
 * 3. Add their lengths to get the connection cost.
 * 4. Add the connection cost to the total cost.
 * 5. Push the combined rope back into the Min Heap.
 * 6. Repeat until only one rope remains.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

import java.util.*;
public class MinimumCostToConnectRopes {
    public static int minCost(int[] ropes) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int rope : ropes) {
            pq.add(rope);
        }

        int totalCost = 0;

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            int combined = first + second;
            totalCost += combined;
            pq.add(combined);
        }
        return totalCost;
    }

    public static void main(String[] args) {
        int[] ropes = {4, 3, 2, 6};
        int result = minCost(ropes);

        System.out.println("Minimum Cost: " + result);
    }
}