/*
 * Practice: LeetCode 547 - Number of Provinces
 *
 * Pattern: Graph + DFS + Connected Components
 *
 * Description:
 * Given an n x n matrix where isConnected[i][j] = 1 means city i
 * and city j are directly connected, return the number of provinces.
 *
 * A province is a group of directly or indirectly connected cities.
 *
 * Approach:
 * 1. Treat every city as a graph node.
 * 2. Use DFS to visit all cities connected to the current city.
 * 3. Every time we find an unvisited city, start a new DFS.
 * 4. Each DFS represents one connected component (province).
 *
 * Time Complexity: O(V^2)
 * Space Complexity: O(V)
 */

class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for (int city = 0; city < n; city++) {
            if (!visited[city]) {
                provinces++;
                dfs(city, isConnected, visited);
            }
        }
        return provinces;
    }

    private void dfs(
            int city,
            int[][] isConnected,
            boolean[] visited) {

        visited[city] = true;

        for (int neighbor = 0;
             neighbor < isConnected.length;
             neighbor++) {

            if (isConnected[city][neighbor] == 1 &&
                !visited[neighbor]) {

                dfs(
                    neighbor,
                    isConnected,
                    visited
                );
            }
        }
    }
}