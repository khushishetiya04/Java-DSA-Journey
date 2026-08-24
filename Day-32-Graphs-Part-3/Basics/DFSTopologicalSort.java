/*
 * Practice: Topological Sort using DFS
 *
 * Pattern: Graph + DFS + Cycle Detection
 *
 * Description:
 * Topological sorting is a linear ordering of vertices in a Directed Acyclic Graph (DAG)
 * such that for every directed edge u -> v, u appears before v.
 *
 * Approach:
 * 1. Perform DFS for every unvisited vertex.
 * 2. After visiting all neighbors of a vertex, push it into a stack.
 * 3. Pop the stack to get the topological ordering.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V)
 */

import java.util.*;
public class DFSTopological {
    static void dfs(
            int node,
            ArrayList<ArrayList<Integer>> graph,
            boolean[] visited,
            Stack<Integer> stack) {

        visited[node] = true;

        // Visit all adjacent nodes
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited, stack);
            }
        }

        // Add node after all dependencies are processed
        stack.push(node);
    }

    // Topological Sort using DFS
    static ArrayList<Integer> topologicalSort(
            int V,
            ArrayList<ArrayList<Integer>> graph) {

        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        // DFS for every component
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, graph, visited, stack);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        // Reverse finishing order
        while (!stack.isEmpty()) {
            result.add(stack.pop());
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

        ArrayList<Integer> result = topologicalSort(V, graph);

        System.out.println("Topological Order: " + result);
    }
}