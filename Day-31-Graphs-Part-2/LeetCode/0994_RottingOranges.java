/*
 * Practice: 994 - Rotting Oranges
 *
 * Pattern:
 * Multi-Source BFS
 *
 * Description:
 * Find the minimum number of minutes required for all fresh oranges
 * to become rotten.
 *
 * Approach:
 * - Add all initially rotten oranges to the queue.
 * - Process all rotten oranges level by level.
 * - For every rotten orange, check its four neighboring cells.
 * - If a neighboring cell contains a fresh orange, make it rotten
 *   and add it to the queue.
 * - Increase the time after processing each BFS level.
 * - Count fresh oranges to determine whether all oranges became rotten.
 * - Return the elapsed time if all fresh oranges become rotten;
 *   otherwise return -1.
 *
 * Time Complexity:
 * O(m × n)
 *
 * Space Complexity:
 * O(m × n)
 *
 * where:
 * m = number of rows
 * n = number of columns
 */

class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        int minutes = 0;
        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int row = current[0];
                int col = current[1];

                for (int[] direction : directions) {
                    int newRow = row + direction[0];
                    int newCol = col + direction[1];

                    if (newRow < 0 || newRow >= m ||
                        newCol < 0 || newCol >= n ||
                        grid[newRow][newCol] != 1) {

                        continue;
                    }
                    grid[newRow][newCol] = 2;
                    fresh--;
                    queue.offer(new int[]{newRow, newCol});
                }
            }
            minutes++;
        }
        return fresh == 0 ? minutes : -1;
    }
}