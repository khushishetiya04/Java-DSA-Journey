/*
 * Practice: LeetCode 802 - Find Eventual Safe States
 *
 * Pattern: Graph + Topological Sort + Kahn's Algorithm
 *
 * Description:
 * A node is called a safe node if every possible path starting from
 * that node eventually reaches a terminal node.
 *
 * A node that is part of a cycle, or can reach a cycle, is unsafe.
 *
 * Approach:
 * 1. Reverse all edges.
 * 2. Calculate the outdegree of every original node.
 * 3. Terminal nodes have outdegree 0, so add them to the queue.
 * 4. Process the queue using Kahn's Algorithm.
 * 5. For every processed node, reduce the outdegree of its
 *    predecessors in the reversed graph.
 * 6. When a predecessor's outdegree becomes 0, it is also safe.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V + E)
 */

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;

        // Reverse graph
        ArrayList<ArrayList<Integer>> reverseGraph =
                new ArrayList<>();

        for (int i = 0; i < n; i++) {
            reverseGraph.add(new ArrayList<>());
        }

        // outdegree of each original node
        int[] outdegree = new int[n];

        for (int u = 0; u < n; u++) {
            outdegree[u] = graph[u].length;

            for (int v : graph[u]) {
                // Original: u -> v
                // Reverse:  v -> u
                reverseGraph.get(v).add(u);
            }
        }

        Queue<Integer> queue =
                new LinkedList<>();

        // Terminal nodes are initially safe
        for (int i = 0; i < n; i++) {
            if (outdegree[i] == 0) {
                queue.offer(i);
            }
        }

        boolean[] safe = new boolean[n];

        // Kahn's Algorithm
        while (!queue.isEmpty()) {
            int node = queue.poll();
            safe[node] = true;

            // Process predecessors
            for (int previous : reverseGraph.get(node)) {
                outdegree[previous]--;

                if (outdegree[previous] == 0) {
                    queue.offer(previous);
                }
            }
        }

        // Return safe nodes in sorted order
        List<Integer> result =
                new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (safe[i]) {
                result.add(i);
            }
        }
        return result;
    }
}