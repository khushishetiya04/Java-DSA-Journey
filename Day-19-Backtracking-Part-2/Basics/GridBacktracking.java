/*
 * Topic: Grid Backtracking
 *
 * Description:
 * Grid Backtracking is used to explore paths
 * in a 2D grid by moving in different directions.
 *
 * Common Applications:
 * - Word Search
 * - Rat in a Maze
 * - Flood Fill
 * - Path Finding
 *
 * Approach:
 * 1. Check boundaries.
 * 2. Mark current cell as visited.
 * 3. Explore all directions.
 * 4. Backtrack by unmarking the cell.
 *
 * Time Complexity : O(4^(m*n))
 * Space Complexity: O(m*n)
 */

public class GridBacktracking {
    static int[][] directions = {
            {-1, 0}, // Up
            {1, 0},  // Down
            {0, -1}, // Left
            {0, 1}   // Right
    };

    public static void dfs(int row, int col,
                           int[][] grid,
                           boolean[][] visited) {

        // Boundary Check
        if (row < 0 || col < 0 ||
            row >= grid.length ||
            col >= grid[0].length ||
            visited[row][col]) {
            return;
        }

        // Choose
        visited[row][col] = true;
        System.out.println("(" + row + ", " + col + ")");

        // Explore
        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            dfs(newRow, newCol, grid, visited);
        }

        // Backtrack
        visited[row][col] = false;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };

        boolean[][] visited =
                new boolean[grid.length][grid[0].length];

        dfs(0, 0, grid, visited);
    }
}