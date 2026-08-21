/*
 * Practice: Cycle Detection in an Undirected Graph using BFS
 *
 * Pattern:
 * BFS + Parent Tracking
 *
 * Description:
 * Detect whether an undirected graph contains a cycle.
 * In an undirected graph, a cycle exists when we visit an already
 * visited neighbor that is not the parent of the current vertex.
 *
 * Approach:
 * - Create an Adjacency List to represent the graph.
 * - Create a visited array to track visited vertices.
 * - Use a Queue to perform BFS.
 * - Store each vertex along with its parent.
 * - If an unvisited neighbor is found, mark it visited and add it
 *   to the queue with the current vertex as its parent.
 * - If a visited neighbor is not the parent of the current vertex,
 *   a cycle exists.
 * - Start BFS from every unvisited vertex to handle disconnected graphs.
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
public class CycleDetectionUndirectedBFS {
    private List<List<Integer>> graph;
    public CycleDetectionUndirectedBFS(int vertices) {
        graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    public boolean hasCycle() {
        boolean[] visited = new boolean[graph.size()];

        for (int i = 0; i < graph.size(); i++) {
            if (!visited[i]) {
                if (bfs(i, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean bfs(int start, boolean[] visited) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start, -1});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int vertex = current[0];
            int parent = current[1];

            for (int neighbor : graph.get(vertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(new int[]{neighbor, vertex});

                } else if (neighbor != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CycleDetectionUndirectedBFS graph =
                new CycleDetectionUndirectedBFS(5);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        graph.addEdge(3, 4);

        System.out.println(
                "Cycle Present: " + graph.hasCycle()
        );
    }
}