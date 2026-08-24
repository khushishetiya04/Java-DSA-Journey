/*
 * Practice: LeetCode 778 - Swim in Rising Water
 *
 * Pattern: Graph + Dijkstra's Algorithm + Priority Queue
 *
 * Description:
 * You start at (0, 0) and need to reach (n - 1, n - 1).
 * grid[r][c] represents the time at which that cell becomes available.
 *
 * The cost of a path is the maximum grid value encountered on that path.
 *
 * Approach:
 * 1. Treat every cell as a graph node.
 * 2. Use Dijkstra's Algorithm.
 * 3. PriorityQueue always processes the cell with the smallest
 *    current maximum elevation.
 * 4. For each neighbor:
 *      newCost = max(currentCost, grid[newRow][newCol])
 * 5. If newCost is smaller than the previously known cost,
 *    update the distance and add the cell to the PriorityQueue.
 *
 * Time Complexity: O(N^2 log N^2)
 * Space Complexity: O(N^2)
 */

class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int[][] dist = new int[n][n];

        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        // {maximum elevation, row, column}
        PriorityQueue<int[]> pq =
                new PriorityQueue<>(
                    (a, b) -> a[0] - b[0]
                );

        dist[0][0] = grid[0][0];

        pq.offer(
            new int[]{
                grid[0][0],
                0,
                0
            }
        );

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int time = current[0];
            int row = current[1];
            int col = current[2];

            // Destination reached
            if (row == n - 1 && col == n - 1) {
                return time;
            }

            // Ignore outdated entry
            if (time > dist[row][col]) {
                continue;
            }

            // Explore four directions
            for (int i = 0; i < 4; i++) {
                int newRow = row + dr[i];
                int newCol = col + dc[i];

                if (newRow < 0 ||
                    newRow >= n ||
                    newCol < 0 ||
                    newCol >= n) {
                    continue;
                }

                int newTime =
                        Math.max(
                            time,
                            grid[newRow][newCol]
                        );

                if (newTime < dist[newRow][newCol]) {
                    dist[newRow][newCol] = newTime;

                    pq.offer(
                        new int[]{
                            newTime,
                            newRow,
                            newCol
                        }
                    );
                }
            }
        }
        return -1;
    }
}