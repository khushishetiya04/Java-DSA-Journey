/*
 * Practice: Check Whether a Path Exists in an Undirected Graph
 *
 * Pattern:
 * DFS + Visited Array
 *
 * Description:
 * Determine whether a path exists between a source vertex and
 * a destination vertex in an undirected graph.
 *
 * Approach:
 * - Create an Adjacency List to represent the graph.
 * - Create a visited array to avoid visiting the same vertex again.
 * - Start DFS from the source vertex.
 * - If the current vertex is the destination, return true.
 * - Visit every unvisited neighbor recursively.
 * - If any recursive call reaches the destination, return true.
 * - If all possible paths are explored without reaching the destination,
 *   return false.
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
public class HasPath {
    private List<List<Integer>> graph;

    public HasPath(int vertices) {
        graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public boolean hasPath(int source, int destination) {
        boolean[] visited = new boolean[graph.size()];
        return dfs(source, destination, visited);
    }

    private boolean dfs(
            int current,
            int destination,
            boolean[] visited) {

        if (current == destination) {
            return true;
        }
        visited[current] = true;

        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, destination, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        HasPath graph = new HasPath(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 5);

        System.out.println(
                "Path Exists: " + graph.hasPath(0, 5)
        );
    }
}