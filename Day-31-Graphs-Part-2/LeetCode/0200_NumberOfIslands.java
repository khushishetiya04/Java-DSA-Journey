/*
 * Practice: 200 - Number of Islands
 *
 * Pattern:
 * DFS + Grid Traversal
 *
 * Description:
 * Count the number of islands in a 2D grid.
 * An island is a group of connected '1' cells surrounded by water '0'.
 * Cells are connected only in four directions:
 * up, down, left, and right.
 *
 * Approach:
 * - Traverse every cell in the grid.
 * - When an unvisited land cell '1' is found, increment the island count.
 * - Run DFS from that cell to visit the complete island.
 * - Mark visited land cells as '0' to avoid visiting them again.
 * - Continue until the entire grid is traversed.
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
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int islands = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    dfs(grid, i, j);
                }
            }
        }
        return islands;
    }

    private void dfs(char[][] grid, int row, int col) {
        int m = grid.length;
        int n = grid[0].length;

        if (row < 0 || row >= m ||
            col < 0 || col >= n ||
            grid[row][col] != '1') {

            return;
        }

        grid[row][col] = '0';

        dfs(grid, row - 1, col);
        dfs(grid, row + 1, col);
        dfs(grid, row, col - 1);
        dfs(grid, row, col + 1);
    }
}