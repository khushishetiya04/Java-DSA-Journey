/*
 * Practice: 547 - Number of Provinces
 *
 * Pattern:
 * DFS + Connected Components
 *
 * Description:
 * Count the number of provinces in a group of cities.
 * A province is a group of directly or indirectly connected cities.
 *
 * Approach:
 * - Use the given adjacency matrix to represent the graph.
 * - Create a visited array to track visited cities.
 * - Traverse every city.
 * - If a city is not visited, a new province is found.
 * - Increment the province count.
 * - Run DFS to visit all cities connected to that province.
 * - Continue until all cities are visited.
 *
 * Time Complexity:
 * O(V²)
 *
 * Space Complexity:
 * O(V)
 *
 * where:
 * V = number of cities
 */

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                provinces++;
                dfs(isConnected, visited, i);
            }
        }
        return provinces;
    }

    private void dfs(
            int[][] isConnected,
            boolean[] visited,
            int city) {

        visited[city] = true;

        for (int neighbor = 0;
             neighbor < isConnected.length;
             neighbor++) {

            if (isConnected[city][neighbor] == 1 &&
                !visited[neighbor]) {

                dfs(isConnected, visited, neighbor);
            }
        }
    }
}