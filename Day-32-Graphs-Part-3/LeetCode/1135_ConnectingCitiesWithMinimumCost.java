/*
 * Practice: LeetCode 1135 - Connecting Cities With Minimum Cost
 *
 * Pattern: Graph + Minimum Spanning Tree + Kruskal + DSU
 *
 * Description:
 * Given n cities and connections where each connection contains
 * [city1, city2, cost], find the minimum cost to connect all cities.
 *
 * Approach:
 * 1. Sort all connections by increasing cost.
 * 2. Initialize DSU for all cities.
 * 3. For every connection:
 *      - If the cities belong to different components,
 *        add the edge to the MST.
 *      - Union the two components.
 * 4. A valid MST must contain n - 1 edges.
 * 5. If fewer than n - 1 edges are selected, the graph is disconnected.
 *
 * Time Complexity: O(E log E)
 * Space Complexity: O(V)
 */

class Solution {
    int[] parent;
    int[] size;

    public int minimumCost(
            int n,
            int[][] connections) {

        parent = new int[n + 1];
        size = new int[n + 1];

        // Initialize DSU
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        // Sort by cost
        Arrays.sort(
            connections,
            (a, b) -> a[2] - b[2]
        );

        int totalCost = 0;
        int edgesUsed = 0;

        // Kruskal's Algorithm
        for (int[] connection : connections) {
            int city1 = connection[0];
            int city2 = connection[1];
            int cost = connection[2];

            // Add edge only if it does not create a cycle
            if (union(city1, city2)) {
                totalCost += cost;
                edgesUsed++;

                // MST complete
                if (edgesUsed == n - 1) {
                    return totalCost;
                }
            }
        }
        // Graph is disconnected
        return -1;
    }

    // Find with path compression
    private int find(int node) {
        if (parent[node] == node) {
            return node;
        }

        return parent[node] =
                find(parent[node]);
    }

    // Union by size
    private boolean union(int u, int v) {
        int parentU = find(u);
        int parentV = find(v);

        // Already connected
        if (parentU == parentV) {
            return false;
        }

        if (size[parentU] < size[parentV]) {
            parent[parentU] = parentV;
            size[parentV] += size[parentU];

        } else {
            parent[parentV] = parentU;
            size[parentU] += size[parentV];
        }
        return true;
    }
}