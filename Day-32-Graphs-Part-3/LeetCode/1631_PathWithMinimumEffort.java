/*
 * Practice: LeetCode 1631 - Path With Minimum Effort
 *
 * Pattern: Graph + Dijkstra's Algorithm + Priority Queue
 *
 * Description:
 * Find a path from the top-left cell to the bottom-right cell such that
 * the maximum absolute height difference between adjacent cells is
 * minimized.
 *
 * Approach:
 * 1. Treat every grid cell as a graph node.
 * 2. The edge cost between two adjacent cells is:
 *
 *      abs(heights[r][c] - heights[nr][nc])
 *
 * 3. Use Dijkstra's Algorithm.
 * 4. The path cost is the maximum edge cost encountered so far:
 *
 *      newEffort = max(currentEffort, edgeEffort)
 *
 * 5. Always process the cell with the minimum current effort.
 *
 * Time Complexity: O(R * C * log(R * C))
 * Space Complexity: O(R * C)
 */

class Solution {
    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length;
        int cols = heights[0].length;
        int[][] effort = new int[rows][cols];

        for (int[] row : effort) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        // {effort, row, column}
        PriorityQueue<int[]> pq =
                new PriorityQueue<>(
                    (a, b) -> a[0] - b[0]
                );

        effort[0][0] = 0;

        pq.offer(
            new int[]{0, 0, 0}
        );

        // Four directions
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentEffort = current[0];
            int row = current[1];
            int col = current[2];

            // Destination reached
            if (row == rows - 1 &&
                col == cols - 1) {

                return currentEffort;
            }

            // Ignore outdated entry
            if (currentEffort > effort[row][col]) {
                continue;
            }

            // Explore four neighbors
            for (int i = 0; i < 4; i++) {
                int newRow = row + dr[i];
                int newCol = col + dc[i];

                if (newRow < 0 ||
                    newRow >= rows ||
                    newCol < 0 ||
                    newCol >= cols) {

                    continue;
                }

                int edgeEffort =
                        Math.abs(
                            heights[row][col]
                            -
                            heights[newRow][newCol]
                        );

                int newEffort =
                        Math.max(
                            currentEffort,
                            edgeEffort
                        );

                // Relaxation
                if (newEffort < effort[newRow][newCol]) {

                    effort[newRow][newCol] =
                            newEffort;

                    pq.offer(
                        new int[]{
                            newEffort,
                            newRow,
                            newCol
                        }
                    );
                }
            }
        }
        return 0;
    }
}