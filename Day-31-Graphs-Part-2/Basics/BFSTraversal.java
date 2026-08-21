/*
 * Practice: BFS Traversal of a Graph
 *
 * Pattern:
 * Breadth First Search (BFS)
 *
 * Description:
 * Traverse all vertices of a graph using Breadth First Search.
 * BFS visits vertices level by level using a Queue.
 *
 * Approach:
 * - Create a visited array to keep track of visited vertices.
 * - Create a Queue and add the starting vertex.
 * - Mark the starting vertex as visited.
 * - Remove a vertex from the queue.
 * - Visit all its unvisited neighbors.
 * - Mark each neighbor as visited and add it to the queue.
 * - Continue until the queue becomes empty.
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
public class BFSTraversal {
    private List<List<Integer>> graph;

    // Create graph
    public BFSTraversal(int vertices) {
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

    // BFS traversal
    public void bfs(int start) {
        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> queue = new LinkedList<>();

        // Start BFS from the given vertex
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            // Visit all unvisited neighbors
            for (int neighbor : graph.get(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BFSTraversal graph = new BFSTraversal(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        System.out.print("BFS Traversal: ");

        graph.bfs(0);
    }
}