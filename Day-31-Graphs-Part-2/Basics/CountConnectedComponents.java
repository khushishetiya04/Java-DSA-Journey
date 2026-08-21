/*
 * Practice: Count Connected Components in an Undirected Graph
 *
 * Pattern:
 * Connected Components using DFS
 *
 * Description:
 * Count the number of connected components in an undirected graph.
 * A connected component is a group of vertices where every vertex
 * is reachable from another vertex in the same group.
 *
 * Approach:
 * - Create an Adjacency List to represent the graph.
 * - Create a visited array to keep track of visited vertices.
 * - Traverse every vertex of the graph.
 * - If a vertex is not visited, it belongs to a new component.
 * - Increment the component count.
 * - Run DFS from that vertex to visit all vertices in that component.
 * - Continue until all vertices are visited.
 *
 * Time Complexity:
 * O(V + E)
 *
 * Space Complexity:
 * O(V)
 *
 * where:
 * V = number of vertices
 * E = number of edges
 */

import java.util.*;
public class CountConnectedComponents {
    private List<List<Integer>> graph;

    public CountConnectedComponents(int vertices) {
        graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
    }
    public void addEdge(int u, int v) {

        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    public int countComponents() {
        boolean[] visited = new boolean[graph.size()];
        int components = 0;

        for (int i = 0; i < graph.size(); i++) {

            if (!visited[i]) {
                components++;
                dfs(i, visited);
            }
        }
        return components;
    }

    private void dfs(int current, boolean[] visited) {
        visited[current] = true;

        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                dfs(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        CountConnectedComponents graph =
                new CountConnectedComponents(7);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);
        graph.addEdge(5, 6);

        System.out.println(
                "Connected Components: " + graph.countComponents()
        );
    }
}