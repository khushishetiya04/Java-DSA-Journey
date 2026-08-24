/*
 * Practice: LeetCode 787 - Cheapest Flights Within K Stops
 *
 * Pattern: Graph + Bellman-Ford / BFS-style Relaxation
 *
 * Description:
 * Find the cheapest price from src to dst using at most k stops.
 *
 * Approach:
 * 1. There can be at most k + 1 flights.
 * 2. Relax all edges exactly k + 1 times.
 * 3. Use a temporary array for each round so that one round represents
 *    exactly one additional flight.
 * 4. After k + 1 rounds, dist[dst] is the cheapest valid price.
 *
 * Time Complexity: O(K * E)
 * Space Complexity: O(V)
 */

class Solution {
    public int findCheapestPrice(
            int n,
            int[][] flights,
            int src,
            int dst,
            int k) {

        int INF = Integer.MAX_VALUE;
        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        dist[src] = 0;

        /*
         * At most k stops means at most k + 1 flights.
         */
        for (int stops = 0; stops <= k; stops++) {
            int[] temp = dist.clone();

            for (int[] flight : flights) {
                int from = flight[0];
                int to = flight[1];
                int price = flight[2];

                // Source must already be reachable
                if (dist[from] == INF) {
                    continue;
                }

                int newCost =
                        dist[from] + price;

                if (newCost < temp[to]) {
                    temp[to] = newCost;
                }
            }
            dist = temp;
        }
        return dist[dst] == INF ? -1 : dist[dst];
    }
}