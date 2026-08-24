/*
 * Practice: Bridges in an Undirected Graph
 *
 * Pattern:
 * DFS + Tarjan's Algorithm
 *
 * Description:
 * A bridge is an edge whose removal increases the number
 * of connected components in an undirected graph.
 *
 * For an edge u -> v:
 *
 *     low[v] > discoveryTime[u]
 *
 * means the edge (u, v) is a bridge.
 *
 * Approach:
 * - Perform DFS on every unvisited vertex.
 * - Maintain:
 *      discoveryTime[u] = time when u is visited.
 *      low[u] = earliest discovery time reachable from u
 *              using tree edges and at most one back edge.
 *
 * - For every unvisited neighbor v:
 *      DFS(v)
 *      low[u] = min(low[u], low[v])
 *
 * - If:
 *      low[v] > discoveryTime[u]
 *
 *   then there is no back edge from v's subtree to u or
 *   any ancestor of u, so (u, v) is a bridge.
 *
 * - For an already visited neighbor that is not the parent:
 *      low[u] = min(low[u], discoveryTime[v])
 *
 * Time Complexity : O(V + E)
 * Space Complexity: O(V + E)
 *
 * where:
 * V = number of vertices
 * E = number of edges
 */

import java.util.*;
public class Bridge {
    private int time;
    private boolean[] visited;
    private int[] discoveryTime;
    private int[] low;
    private List<List<Integer>> bridges;

    public List<List<Integer>> findBridges(
            int vertices,
            List<List<Integer>> graph) {

        time = 0;

        visited = new boolean[vertices];
        discoveryTime = new int[vertices];
        low = new int[vertices];
        bridges = new ArrayList<>();

        // Graph may be disconnected
        for (int vertex = 0; vertex < vertices; vertex++) {

            if (!visited[vertex]) {

                dfs(
                    vertex,
                    -1,
                    graph
                );
            }
        }
        return bridges;
    }

    private void dfs(
            int u,
            int parent,
            List<List<Integer>> graph) {

        visited[u] = true;
        discoveryTime[u] = low[u] = ++time;

        for (int v : graph.get(u)) {

            // Ignore the edge back to parent
            if (v == parent) {
                continue;
            }

            // Back edge
            if (visited[v]) {

                low[u] = Math.min(
                    low[u],
                    discoveryTime[v]
                );
            }

            // Tree edge
            else {

                dfs(
                    v,
                    u,
                    graph
                );

                low[u] = Math.min(
                    low[u],
                    low[v]
                );

                // Bridge condition
                if (low[v] > discoveryTime[u]) {

                    bridges.add(
                        Arrays.asList(u, v)
                    );
                }
            }
        }
    }

    private static void addEdge(
            List<List<Integer>> graph,
            int u,
            int v) {

        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public static void main(String[] args) {
        int vertices = 5;
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        /*
         * Graph:
         *
         * 0 ----- 1
         *         |
         *         2
         *        / \
         *       3   4
         *
         * Bridges:
         * (0,1), (1,2), (2,3), (2,4)
         */

        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 3);
        addEdge(graph, 2, 4);

        Bridge solution = new Bridge();

        List<List<Integer>> result =
            solution.findBridges(
                vertices,
                graph
            );

        System.out.println(
            "Bridges: " + result
        );
    }
}