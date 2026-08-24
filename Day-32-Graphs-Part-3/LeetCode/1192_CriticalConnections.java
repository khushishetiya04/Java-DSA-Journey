/*
 * Practice: LeetCode 1192 - Critical Connections in a Network
 *
 * Pattern: Graph + DFS + Tarjan's Algorithm + Bridges
 *
 * Description:
 * Find all critical connections (bridges) in an undirected graph.
 *
 * A bridge is an edge whose removal increases the number of
 * connected components in the graph.
 *
 * Approach:
 * 1. Assign every node a discovery time (disc).
 * 2. Maintain low[node] = earliest discovery time reachable from
 *    the subtree of node using DFS tree edges and back edges.
 * 3. For an edge u -> v:
 *      - If v is unvisited, DFS(v).
 *      - Update low[u] using low[v].
 *      - If low[v] > disc[u], then u-v is a bridge.
 * 4. For an already visited neighbor, update low[u] using disc[v].
 *
 * Key Condition:
 *
 *      low[v] > disc[u]
 *
 * means there is no alternate path from v's subtree back to u
 * or any ancestor of u, so (u, v) is a critical connection.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V + E)
 */

class Solution {
    int timer = 0;

    public List<List<Integer>> criticalConnections(
            int n,
            List<List<Integer>> connections) {

        List<List<Integer>> graph =
                new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build undirected graph
        for (List<Integer> edge : connections) {
            int u = edge.get(0);
            int v = edge.get(1);

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int[] disc = new int[n];
        int[] low = new int[n];
        Arrays.fill(disc, -1);

        List<List<Integer>> bridges =
                new ArrayList<>();

        // Handle all components
        for (int i = 0; i < n; i++) {
            if (disc[i] == -1) {

                dfs(
                    i,
                    -1,
                    graph,
                    disc,
                    low,
                    bridges
                );
            }
        }
        return bridges;
    }

    private void dfs(
            int node,
            int parent,
            List<List<Integer>> graph,
            int[] disc,
            int[] low,
            List<List<Integer>> bridges) {

        // Discovery time
        disc[node] = low[node] = timer++;

        for (int neighbor : graph.get(node)) {
            // Ignore the edge back to parent
            if (neighbor == parent) {
                continue;
            }

            // Tree edge
            if (disc[neighbor] == -1) {

                dfs(
                    neighbor,
                    node,
                    graph,
                    disc,
                    low,
                    bridges
                );

                // Update low value
                low[node] = Math.min(
                    low[node],
                    low[neighbor]
                );

                /*
                 * Bridge condition:
                 *
                 * If neighbor cannot reach node or any
                 * ancestor of node, node-neighbor is a bridge.
                 */
                if (low[neighbor] > disc[node]) {

                    bridges.add(
                        Arrays.asList(
                            node,
                            neighbor
                        )
                    );
                }

            } else {
                // Back edge
                low[node] = Math.min(
                    low[node],
                    disc[neighbor]
                );
            }
        }
    }
}