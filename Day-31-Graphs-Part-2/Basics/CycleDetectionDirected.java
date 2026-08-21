/*
 * Practice: Cycle Detection in a Directed Graph
 *
 * Pattern:
 * DFS + Recursion Stack
 *
 * Description:
 * Detect whether a directed graph contains a cycle.
 * A cycle exists when DFS reaches a vertex that is already
 * present in the current DFS path.
 *
 * Approach:
 * - Create a visited array to track visited vertices.
 * - Create a recursion stack array to track the current DFS path.
 * - Start DFS from every unvisited vertex.
 * - Mark the current vertex as visited and add it to the recursion stack.
 * - If an unvisited neighbor is found, continue DFS.
 * - If a neighbor is already in the recursion stack, a cycle exists.
 * - Remove the current vertex from the recursion stack while backtracking.
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
public class CycleDetectionDirected {
    private List<List<Integer>> graph;
    public CycleDetectionDirected(int vertices) {
        graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        graph.get(u).add(v);
    }

    public boolean hasCycle() {
        boolean[] visited = new boolean[graph.size()];
        boolean[] recursionStack = new boolean[graph.size()];

        for (int i = 0; i < graph.size(); i++) {
            if (!visited[i]) {
                if (dfs(i, visited, recursionStack)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(
            int current,
            boolean[] visited,
            boolean[] recursionStack) {

        visited[current] = true;
        recursionStack[current] = true;

        for (int neighbor : graph.get(current)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, visited, recursionStack)) {
                    return true;
                }
            } else if (recursionStack[neighbor]) {
                return true;
            }
        }
        recursionStack[current] = false;
        return false;
    }

    public static void main(String[] args) {
        CycleDetectionDirected graph =
                new CycleDetectionDirected(4);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);

        System.out.println(
                "Cycle Present: " + graph.hasCycle()
        );
    }
}