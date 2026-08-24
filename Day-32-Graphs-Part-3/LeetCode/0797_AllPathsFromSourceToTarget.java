/*
 * Practice: LeetCode 797 - All Paths From Source to Target
 *
 * Pattern: Graph + DFS + Backtracking
 *
 * Description:
 * Given a Directed Acyclic Graph (DAG), return all possible paths
 * from node 0 to node n - 1.
 *
 * Approach:
 * 1. Start DFS from node 0.
 * 2. Add the current node to the current path.
 * 3. If the current node is the destination, store a copy of the path.
 * 4. Otherwise, recursively visit every neighbor.
 * 5. Remove the current node from the path while backtracking.
 *
 * Time Complexity: O(2^V * V)
 * Space Complexity: O(V) excluding the output
 */

class Solution {
    public List<List<Integer>> allPathsSourceTarget(
            int[][] graph) {

        List<List<Integer>> result =
                new ArrayList<>();

        List<Integer> path =
                new ArrayList<>();

        path.add(0);

        dfs(
            0,
            graph,
            path,
            result
        );
        return result;
    }

    private void dfs(
            int node,
            int[][] graph,
            List<Integer> path,
            List<List<Integer>> result) {

        // Destination reached
        if (node == graph.length - 1) {
            result.add(
                new ArrayList<>(path)
            );
            return;
        }

        // Explore all neighbors
        for (int neighbor : graph[node]) {
            path.add(neighbor);

            dfs(
                neighbor,
                graph,
                path,
                result
            );

            // Backtrack
            path.remove(
                path.size() - 1
            );
        }
    }
}