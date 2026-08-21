/*
 * Practice: 542 - 01 Matrix
 *
 * Pattern:
 * Multi-Source BFS
 *
 * Description:
 * Find the distance of every cell containing 1 to its nearest cell
 * containing 0.
 *
 * Approach:
 * - Add all cells containing 0 to the queue initially.
 * - Set their distance as 0.
 * - Treat all 0 cells as BFS sources at the same time.
 * - Process the queue level by level.
 * - For every unvisited neighboring cell, assign its distance as
 *   the current cell's distance + 1.
 * - Add the neighboring cell to the queue.
 * - Continue until all cells are processed.
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
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    mat[i][j] = -1;
                }
            }
        }

        int[][] directions = {
            {-1, 0},
            {1, 0},
            {0, -1},
            {0, 1}
        };

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];

            for (int[] direction : directions) {
                int newRow = row + direction[0];
                int newCol = col + direction[1];

                if (newRow < 0 || newRow >= m ||
                    newCol < 0 || newCol >= n ||
                    mat[newRow][newCol] != -1) {

                    continue;
                }
                mat[newRow][newCol] = mat[row][col] + 1;
                queue.offer(new int[]{newRow, newCol});
            }
        }
        return mat;
    }
}