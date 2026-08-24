/*
 * Practice: Kosaraju's Algorithm
 *
 * Pattern: Graph + DFS + Strongly Connected Components (SCC)
 *
 * Description:
 * Kosaraju's Algorithm finds all Strongly Connected Components (SCCs)
 * in a directed graph.
 *
 * Approach:
 * 1. Perform DFS on the original graph.
 * 2. After finishing each node, push it into a stack.
 * 3. Reverse all edges of the graph.
 * 4. Pop nodes from the stack.
 * 5. Perform DFS on the reversed graph.
 * 6. Every DFS traversal gives one Strongly Connected Component.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V + E)
 */

import java.util.*;
public class Kosaraju {

    // First DFS: store nodes by finishing time
    static void dfs1(
            int node,
            ArrayList<ArrayList<Integer>> graph,
            boolean[] visited,
            Stack<Integer> stack) {

        visited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs1(neighbor, graph, visited, stack);
            }
        }

        // Store after visiting all neighbors
        stack.push(node);
    }

    // Second DFS: find SCC in reversed graph
    static void dfs2(
            int node,
            ArrayList<ArrayList<Integer>> reverseGraph,
            boolean[] visited,
            ArrayList<Integer> component) {

        visited[node] = true;
        component.add(node);

        for (int neighbor : reverseGraph.get(node)) {
            if (!visited[neighbor]) {
                dfs2(neighbor, reverseGraph, visited, component);
            }
        }
    }

    static ArrayList<ArrayList<Integer>> kosaraju(
            int V,
            ArrayList<ArrayList<Integer>> graph) {

        /*
         * Step 1:
         * DFS on original graph and store finishing order.
         */
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs1(i, graph, visited, stack);
            }
        }

        /*
         * Step 2:
         * Reverse all edges.
         */
        ArrayList<ArrayList<Integer>> reverseGraph =
                new ArrayList<>();

        for (int i = 0; i < V; i++) {
            reverseGraph.add(new ArrayList<>());
        }

        for (int u = 0; u < V; u++) {
            for (int v : graph.get(u)) {
                reverseGraph.get(v).add(u);
            }
        }

        /*
         * Step 3:
         * DFS on reversed graph using finishing order.
         */
        Arrays.fill(visited, false);

        ArrayList<ArrayList<Integer>> sccs =
                new ArrayList<>();

        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited[node]) {
                ArrayList<Integer> component =
                        new ArrayList<>();

                dfs2(
                    node,
                    reverseGraph,
                    visited,
                    component
                );

                sccs.add(component);
            }
        }
        return sccs;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Integer>> graph =
                new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        /*
         * Directed graph:
         *
         * 0 -> 2
         * 2 -> 1
         * 1 -> 0
         *
         * 0 -> 3
         * 3 -> 4
         */
        graph.get(0).add(2);
        graph.get(2).add(1);
        graph.get(1).add(0);

        graph.get(0).add(3);
        graph.get(3).add(4);

        ArrayList<ArrayList<Integer>> sccs =
                kosaraju(V, graph);

        System.out.println("Strongly Connected Components:");

        for (ArrayList<Integer> component : sccs) {
            System.out.println(component);
        }
    }
}