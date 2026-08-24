/*
 * Practice: Minimum Cost Path in a Grid
 *
 * Pattern: Graph + Dijkstra + Priority Queue
 *
 * Description:
 * Find the minimum cost required to travel from the top-left cell
 * to the bottom-right cell of a grid.
 *
 * Each cell contains the cost of entering that cell.
 * Movement is allowed in 4 directions:
 *      Up, Down, Left, Right
 *
 * Approach:
 * 1. Treat every cell as a graph node.
 * 2. Use Dijkstra's Algorithm because cell costs are non-negative.
 * 3. Start from (0, 0).
 * 4. Always process the cell having the minimum current cost.
 * 5. Relax its four neighboring cells.
 *
 * Time Complexity: O(R * C * log(R * C))
 * Space Complexity: O(R * C)
 */

import java.util.*;
public class MinimumCostPath {

    // {cost, row, column}
    static class Cell {
        int cost;
        int row;
        int col;

        Cell(int cost, int row, int col) {
            this.cost = cost;
            this.row = row;
            this.col = col;
        }
    }

    static int minimumCostPath(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dist = new int[rows][cols];

        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        PriorityQueue<Cell> pq =
                new PriorityQueue<>(
                    (a, b) -> a.cost - b.cost
                );

        dist[0][0] = grid[0][0];
        pq.offer(new Cell(
            grid[0][0],
            0,
            0
        ));

        // Four possible directions
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!pq.isEmpty()) {
            Cell current = pq.poll();
            int cost = current.cost;
            int row = current.row;
            int col = current.col;

            // Ignore outdated entry
            if (cost > dist[row][col]) {
                continue;
            }

            // Destination reached
            if (row == rows - 1 &&
                col == cols - 1) {

                return cost;
            }

            // Explore four neighbors
            for (int i = 0; i < 4; i++) {
                int newRow = row + dr[i];
                int newCol = col + dc[i];

                // Check boundaries
                if (newRow < 0 ||
                    newRow >= rows ||
                    newCol < 0 ||
                    newCol >= cols) {

                    continue;
                }

                int newCost =
                        cost + grid[newRow][newCol];

                // Relaxation
                if (newCost < dist[newRow][newCol]) {

                    dist[newRow][newCol] = newCost;

                    pq.offer(
                        new Cell(
                            newCost,
                            newRow,
                            newCol
                        )
                    );
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 3, 1},
            {2, 1, 2},
            {4, 2, 1}
        };

        int result = minimumCostPath(grid);

        System.out.println(
            "Minimum Cost Path: " + result
        );
    }
}