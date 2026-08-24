/*
 * Practice: LeetCode 1334 - Find the City With the Smallest Number of Neighbors
 *           at a Threshold Distance
 *
 * Pattern: Graph + Floyd-Warshall + All-Pairs Shortest Path
 *
 * Description:
 * Given n cities and weighted edges, find the city that can reach the
 * smallest number of other cities with a shortest-path distance <= threshold.
 *
 * If multiple cities have the same count, return the city with the
 * greatest index.
 *
 * Approach:
 * 1. Initialize a distance matrix.
 * 2. Set dist[i][i] = 0.
 * 3. Store the edge weights.
 * 4. Apply Floyd-Warshall to find shortest distances between every pair.
 * 5. For each city, count how many other cities are within threshold.
 * 6. Choose the city with the smallest count.
 * 7. In case of a tie, choose the city with the greater index.
 *
 * Time Complexity: O(V^3)
 * Space Complexity: O(V^2)
 */

class Solution {
    public int findTheCity(
            int n,
            int[][] edges,
            int distanceThreshold) {

        int INF = Integer.MAX_VALUE / 2;
        int[][] dist = new int[n][n];

        // Initialize distances
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
            dist[i][i] = 0;
        }

        // Build distance matrix
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            dist[u][v] =
                    Math.min(dist[u][v], weight);

            dist[v][u] =
                    Math.min(dist[v][u], weight);
        }

        /*
         * Floyd-Warshall:
         * Try every city as an intermediate city.
         */
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    dist[i][j] = Math.min(
                        dist[i][j],
                        dist[i][k] + dist[k][j]
                    );
                }
            }
        }

        int resultCity = -1;
        int minimumCount = Integer.MAX_VALUE;

        // Count reachable cities for every city
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i != j &&
                    dist[i][j] <= distanceThreshold) {

                    count++;
                }
            }

            /*
             * Use <= so that in a tie we choose the
             * city with the greater index.
             */
            if (count <= minimumCount) {

                minimumCount = count;
                resultCity = i;
            }
        }
        return resultCity;
    }
}