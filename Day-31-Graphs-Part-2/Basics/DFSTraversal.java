/*
 * Practice: DFS Traversal of a Graph
 *
 * Pattern:
 * Depth First Search (DFS)
 *
 * Description:
 * Traverse all vertices of a graph using Depth First Search.
 * DFS explores as far as possible along one branch before
 * backtracking.
 *
 * Approach:
 * - Create a visited array to keep track of visited vertices.
 * - Start DFS from the given vertex.
 * - Mark the current vertex as visited.
 * - Process the current vertex.
 * - Recursively visit all unvisited neighbors.
 * - Continue until all reachable vertices are visited.
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
public class DFSTraversal {
    private List<List<Integer>> graph;

    // Create graph
    public DFSTraversal(int vertices) {
        graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
    }

    // Add edge for undirected graph
    public void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    // DFS traversal
    public void dfs(int start) {
        boolean[] visited = new boolean[graph.size()];
        dfsRecursive(start, visited);
        System.out.println();
    }

    // Recursive DFS
    private void dfsRecursive(int current, boolean[] visited) {
        // Mark current vertex as visited
        visited[current] = true;

        // Process current vertex
        System.out.print(current + " ");

        // Visit all unvisited neighbors
        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                dfsRecursive(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFSTraversal graph = new DFSTraversal(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        System.out.print("DFS Traversal: ");

        graph.dfs(0);
    }
}