/*
 * Practice: Tarjan's Algorithm
 *
 * Pattern: Graph + DFS + Strongly Connected Components (SCC)
 *
 * Description:
 * Tarjan's Algorithm finds all Strongly Connected Components (SCCs)
 * in a directed graph using a single DFS traversal.
 *
 * Approach:
 * 1. Assign every node a discovery time (disc).
 * 2. Maintain the lowest discovery time reachable from each node (low).
 * 3. Keep currently active nodes inside a stack.
 * 4. If low[node] == disc[node], the node is the root of an SCC.
 * 5. Pop nodes from the stack until the current node is reached.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V)
 */

import java.util.*;
public class Tarjan {
    static int timer = 0;

    static void dfs(
            int node,
            ArrayList<ArrayList<Integer>> graph,
            int[] disc,
            int[] low,
            boolean[] inStack,
            Stack<Integer> stack,
            ArrayList<ArrayList<Integer>> sccs) {

        // Discovery time and low value
        disc[node] = low[node] = timer++;

        stack.push(node);
        inStack[node] = true;

        // Visit neighbors
        for (int neighbor : graph.get(node)) {
            // Neighbor not visited
            if (disc[neighbor] == -1) {

                dfs(
                    neighbor,
                    graph,
                    disc,
                    low,
                    inStack,
                    stack,
                    sccs
                );

                low[node] = Math.min(
                    low[node],
                    low[neighbor]
                );
            }

            // Back edge to a node currently in stack
            else if (inStack[neighbor]) {
                low[node] = Math.min(
                    low[node],
                    disc[neighbor]
                );
            }
        }

        // node is the root of an SCC
        if (low[node] == disc[node]) {
            ArrayList<Integer> component =
                    new ArrayList<>();

            while (true) {
                int current = stack.pop();
                inStack[current] = false;
                component.add(current);

                if (current == node) {
                    break;
                }
            }
            sccs.add(component);
        }
    }

    static ArrayList<ArrayList<Integer>> tarjan(
            int V,
            ArrayList<ArrayList<Integer>> graph) {

        int[] disc = new int[V];
        int[] low = new int[V];

        Arrays.fill(disc, -1);
        Arrays.fill(low, -1);

        boolean[] inStack = new boolean[V];

        Stack<Integer> stack = new Stack<>();

        ArrayList<ArrayList<Integer>> sccs =
                new ArrayList<>();

        timer = 0;

        // Handle disconnected graph
        for (int i = 0; i < V; i++) {

            if (disc[i] == -1) {

                dfs(
                    i,
                    graph,
                    disc,
                    low,
                    inStack,
                    stack,
                    sccs
                );
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
         * 0 -> 1
         * 1 -> 2
         * 2 -> 0
         *
         * 1 -> 3
         * 3 -> 4
         * 4 -> 3
         */

        graph.get(0).add(1);

        graph.get(1).add(2);
        graph.get(1).add(3);

        graph.get(2).add(0);

        graph.get(3).add(4);

        graph.get(4).add(3);

        ArrayList<ArrayList<Integer>> sccs =
                tarjan(V, graph);

        System.out.println(
            "Strongly Connected Components:"
        );

        for (ArrayList<Integer> component : sccs) {
            System.out.println(component);
        }
    }
}