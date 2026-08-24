/*
 * Practice: Kahn's Algorithm
 *
 * Pattern: Graph + BFS + Topological Sort + Indegree
 *
 * Description:
 * Kahn's Algorithm is a BFS-based approach to find the topological
 * ordering of a Directed Acyclic Graph (DAG).
 *
 * Approach:
 * 1. Calculate indegree of every vertex.
 * 2. Add all vertices with indegree 0 to a Queue.
 * 3. Remove a vertex from the Queue and add it to the result.
 * 4. Reduce the indegree of all its neighbors.
 * 5. If a neighbor's indegree becomes 0, add it to the Queue.
 * 6. If the number of processed vertices is less than V,
 *    the graph contains a cycle.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V)
 */

import java.util.*;
public class KahnAlgo {
    static ArrayList<Integer> topologicalSort(
            int V,
            ArrayList<ArrayList<Integer>> graph) {

        int[] indegree = new int[V];

        // Calculate indegree of every vertex
        for (int u = 0; u < V; u++) {
            for (int v : graph.get(u)) {
                indegree[v]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();

        // Add vertices having indegree 0
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            int node = queue.poll();
            result.add(node);

            // Remove node and update neighbors
            for (int neighbor : graph.get(node)) {
                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // Cycle detection
        if (result.size() != V) {
            return new ArrayList<>();
        }

        return result;
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Directed edges
        graph.get(5).add(2);
        graph.get(5).add(0);

        graph.get(4).add(0);
        graph.get(4).add(1);

        graph.get(2).add(3);
        graph.get(3).add(1);

        ArrayList<Integer> result =
                topologicalSort(V, graph);

        if (result.isEmpty()) {
            System.out.println("Cycle detected. Topological sort not possible.");
        } else {
            System.out.println("Topological Order: " + result);
        }
    }
}