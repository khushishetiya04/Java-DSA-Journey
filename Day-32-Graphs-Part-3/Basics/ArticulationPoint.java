/*
 * Practice: Articulation Points in an Undirected Graph
 *
 * Pattern:
 * DFS + Tarjan's Algorithm
 *
 * Description:
 * An articulation point (cut vertex) is a vertex whose removal
 * increases the number of connected components in the graph.
 *
 * Approach:
 * - Use DFS to create a DFS tree.
 * - Maintain:
 *      discoveryTime[u] = time when u is first visited.
 *      low[u] = earliest discovery time reachable from u
 *              using tree edges and at most one back edge.
 *
 * - For every DFS child v of u:
 *      low[u] = min(low[u], low[v])
 *
 * - If v cannot reach an ancestor of u:
 *      low[v] >= discoveryTime[u]
 *   then u is an articulation point.
 *
 * - Special case:
 *      The DFS root is an articulation point only if it has
 *      more than one DFS child.
 *
 * Time Complexity : O(V + E)
 * Space Complexity: O(V + E)
 *
 * where:
 * V = number of vertices
 * E = number of edges
 */

import java.util.*;
public class ArticulationPoint {
    private int time;
    private boolean[] visited;
    private int[] discoveryTime;
    private int[] low;
    private boolean[] articulation;

    public List<Integer> findArticulationPoints(
            int vertices,
            List<List<Integer>> graph) {

        time = 0;
        visited = new boolean[vertices];
        discoveryTime = new int[vertices];
        low = new int[vertices];
        articulation = new boolean[vertices];

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

        List<Integer> result = new ArrayList<>();
        for (int vertex = 0; vertex < vertices; vertex++) {
            if (articulation[vertex]) {
                result.add(vertex);
            }
        }
        return result;
    }

    private void dfs(
            int u,
            int parent,
            List<List<Integer>> graph) {

        visited[u] = true;
        discoveryTime[u] = low[u] = ++time;
        int children = 0;

        for (int v : graph.get(u)) {

            // Ignore the edge going back to parent
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
                children++;

                dfs(
                    v,
                    u,
                    graph
                );

                low[u] = Math.min(
                    low[u],
                    low[v]
                );

                // Non-root articulation point
                if (parent != -1 &&
                    low[v] >= discoveryTime[u]) {
                    articulation[u] = true;
                }
            }
        }

        // Root articulation point
        if (parent == -1 && children > 1) {
            articulation[u] = true;
        }
    }

    public static void main(String[] args) {
        int vertices = 5;

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // 0 - 1 - 2
        //     |
        //     3 - 4

        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 3, 4);

        ArticulationPoint solution = new ArticulationPoint();

        List<Integer> result =
            solution.findArticulationPoints(
                vertices,
                graph
            );

        System.out.println("Articulation Points: " + result);
    }

    private static void addEdge(
            List<List<Integer>> graph,
            int u,
            int v) {

        graph.get(u).add(v);
        graph.get(v).add(u);
    }
}