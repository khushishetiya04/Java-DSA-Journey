/*
 * Practice: 797 - All Paths From Source to Target
 *
 * Pattern:
 * DFS + Backtracking
 *
 * Description:
 * Find all possible paths from node 0 to node n - 1 in a directed
 * acyclic graph.
 *
 * Approach:
 * - Start DFS from node 0.
 * - Add the current node to the current path.
 * - If the current node is the target node, add a copy of the path
 *   to the result.
 * - Otherwise, recursively explore every neighbor.
 * - Remove the current node from the path while backtracking.
 *
 * Time Complexity:
 * O(2^V × V)
 *
 * Space Complexity:
 * O(V)
 *
 * where:
 * V = number of vertices
 */

class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);

        dfs(graph, 0, path, result);

        return result;
    }

    private void dfs(
            int[][] graph,
            int current,
            List<Integer> path,
            List<List<Integer>> result) {

        int target = graph.length - 1;

        if (current == target) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int neighbor : graph[current]) {
            path.add(neighbor);
            dfs(graph, neighbor, path, result);
            path.remove(path.size() - 1);
        }
    }
}