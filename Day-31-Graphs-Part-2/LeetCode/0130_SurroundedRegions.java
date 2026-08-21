/*
 * Practice: 130 - Surrounded Regions
 *
 * Pattern:
 * DFS + Boundary Traversal
 *
 * Description:
 * Capture all regions of 'O' that are completely surrounded by 'X'.
 * Any 'O' connected to the boundary cannot be captured.
 *
 * Approach:
 * - Traverse all boundary cells.
 * - Run DFS from every boundary cell containing 'O'.
 * - Mark all connected boundary-safe 'O' cells with '#'.
 * - Traverse the entire board.
 * - Convert remaining 'O' cells to 'X'.
 * - Convert '#' cells back to 'O'.
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
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') {
                dfs(board, 0, j);
            }

            if (board[m - 1][j] == 'O') {
                dfs(board, m - 1, j);
            }
        }

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 0);
            }

            if (board[i][n - 1] == 'O') {
                dfs(board, i, n - 1);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == 'O') {
                    board[i][j] = 'X';

                } else if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    private void dfs(char[][] board, int row, int col) {
        int m = board.length;
        int n = board[0].length;

        if (row < 0 || row >= m ||
            col < 0 || col >= n ||
            board[row][col] != 'O') {

            return;
        }
        board[row][col] = '#';

        dfs(board, row - 1, col);
        dfs(board, row + 1, col);
        dfs(board, row, col - 1);
        dfs(board, row, col + 1);
    }
}