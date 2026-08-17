/*
 * LeetCode: 1466
 * Problem: Reorder Routes to Make All Paths Lead to the City Zero
 * Difficulty: Medium
 *
 * Pattern:
 * Graph + DFS + Directed Edge Tracking
 *
 * Description:
 * There are n cities connected by n - 1 directed roads.
 * Each road connects two cities.
 *
 * We need to reorder the minimum number of roads so that
 * every city can reach city 0.
 *
 * Approach:
 * - Treat every road as an undirected connection for traversal.
 * - Store whether the original direction is correct or needs
 *   to be reversed.
 * - Start DFS from city 0.
 * - For every unvisited neighbor:
 *      - If the original edge is from current city to neighbor,
 *        it must be reversed.
 *      - If the original edge is from neighbor to current city,
 *        it already points toward city 0.
 * - Count all edges that need to be reversed.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 *
 * where:
 * n = number of cities
 */

class Solution {
    static class Edge {
        int city;
        int cost;

        Edge(int city, int cost) {
            this.city = city;
            this.cost = cost;
        }
    }

    public int minReorder(int n, int[][] connections) {
        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] connection : connections) {
            int from = connection[0];
            int to = connection[1];

            // Original direction: from -> to
            // Starting from 0, this edge may need reversal
            graph.get(from).add(new Edge(to, 1));

            // Reverse traversal direction:
            // to -> from already points toward 0
            graph.get(to).add(new Edge(from, 0));
        }
        boolean[] visited = new boolean[n];
        return dfs(0, graph, visited);
    }

    private int dfs(
            int city,
            List<List<Edge>> graph,
            boolean[] visited) {

        visited[city] = true;
        int changes = 0;

        for (Edge edge : graph.get(city)) {
            if (visited[edge.city]) {
                continue;
            }

            // cost = 1 means the original road
            // is directed away from city 0
            changes += edge.cost;

            changes += dfs(
                edge.city,
                graph,
                visited
            );
        }
        return changes;
    }
}