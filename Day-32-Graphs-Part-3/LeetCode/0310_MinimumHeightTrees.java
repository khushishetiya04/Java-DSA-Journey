/*
 * Practice: LeetCode 310 - Minimum Height Trees
 *
 * Pattern: Graph + BFS + Topological Trimming
 *
 * Description:
 * Given an undirected tree, find all root nodes that produce the
 * minimum possible height.
 *
 * Approach:
 * 1. Build an adjacency list.
 * 2. Calculate the degree of every node.
 * 3. Add all leaf nodes (degree = 1) to a queue.
 * 4. Remove leaves level by level.
 * 5. Continue until at most 2 nodes remain.
 * 6. The remaining nodes are the roots of the Minimum Height Trees.
 *
 * Key Idea:
 * Instead of trying every node as a root, repeatedly remove the
 * outermost leaves. The last 1 or 2 nodes are the center(s) of the tree.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V + E)
 */

class Solution {
    public List<Integer> findMinHeightTrees(
            int n,
            int[][] edges) {

        // Special case
        if (n == 1) {
            return new ArrayList<>(
                    Collections.singletonList(0)
            );
        }

        ArrayList<ArrayList<Integer>> graph =
                new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        int[] degree = new int[n];

        // Build undirected graph
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);

            degree[u]++;
            degree[v]++;
        }

        Queue<Integer> queue =
                new LinkedList<>();

        // Add all leaf nodes
        for (int i = 0; i < n; i++) {

            if (degree[i] == 1) {
                queue.offer(i);
            }
        }

        int remainingNodes = n;

        // Remove leaves layer by layer
        while (remainingNodes > 2) {
            int leaves = queue.size();
            remainingNodes -= leaves;

            for (int i = 0; i < leaves; i++) {
                int leaf = queue.poll();

                for (int neighbor : graph.get(leaf)) {
                    degree[neighbor]--;

                    if (degree[neighbor] == 1) {
                        queue.offer(neighbor);
                    }
                }
            }
        }

        // Remaining nodes are the centers
        List<Integer> result =
                new ArrayList<>();

        while (!queue.isEmpty()) {
            result.add(queue.poll());
        }
        return result;
    }
}