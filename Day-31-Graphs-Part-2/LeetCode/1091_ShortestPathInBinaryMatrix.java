/*
 * Practice: 1091 - Shortest Path in Binary Matrix
 *
 * Pattern:
 * BFS + Shortest Path
 *
 * Description:
 * Find the shortest path from the top-left cell to the bottom-right
 * cell in a binary matrix.
 * A path can move in all 8 directions and can only pass through cells
 * containing 0.
 *
 * Approach:
 * - If the starting or ending cell contains 1, return -1.
 * - Use BFS because every move has the same cost.
 * - Start from the top-left cell with distance 1.
 * - Explore all 8 possible directions.
 * - Mark visited cells by changing them from 0 to 1.
 * - Store the distance along with each cell in the queue.
 * - Return the distance when the bottom-right cell is reached.
 * - If the destination cannot be reached, return -1.
 *
 * Time Complexity:
 * O(n²)
 *
 * Space Complexity:
 * O(n²)
 *
 * where:
 * n = size of the matrix
 */

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
            return -1;
        }
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0, 0, 1});
        grid[0][0] = 1;

        int[][] directions = {
            {-1, -1},
            {-1, 0},
            {-1, 1},
            {0, -1},
            {0, 1},
            {1, -1},
            {1, 0},
            {1, 1}
        };

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int distance = current[2];

            if (row == n - 1 && col == n - 1) {
                return distance;
            }

            for (int[] direction : directions) {
                int newRow = row + direction[0];
                int newCol = col + direction[1];

                if (newRow < 0 || newRow >= n ||
                    newCol < 0 || newCol >= n ||
                    grid[newRow][newCol] != 0) {

                    continue;
                }

                grid[newRow][newCol] = 1;
                queue.offer(
                    new int[]{newRow, newCol, distance + 1}
                );
            }
        }
        return -1;
    }
}