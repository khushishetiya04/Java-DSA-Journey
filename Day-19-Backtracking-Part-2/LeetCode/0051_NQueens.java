/*
 * LeetCode: 51
 * Problem: N-Queens
 * Difficulty: Hard
 *
 * Description:
 * Place n queens on an n × n chessboard so that
 * no two queens attack each other.
 *
 * Return all distinct solutions.
 *
 * Rules:
 * - Only one queen per row.
 * - No two queens can be in the same column.
 * - No two queens can be be on the same diagonal.
 *
 * Approach:
 * - Place one queen in each row.
 * - Check if the current position is safe.
 * - If safe, place the queen.
 * - Recursively solve the next row.
 * - If no solution exists, backtrack.
 *
 * Pattern:
 * Backtracking
 *
 * Time Complexity : O(N!)
 * Space Complexity: O(N)
 */

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        backtrack(board, 0, result);
        return result;
    }

    private void backtrack(char[][] board, int row,
                           List<List<String>> result) {

        // Base Case
        if (row == board.length) {
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (!isSafe(board, row, col)) {
                continue;
            }

            // Choose
            board[row][col] = 'Q';

            // Explore
            backtrack(board, row + 1, result);

            // Backtrack
            board[row][col] = '.';
        }
    }

    private boolean isSafe(char[][] board, int row, int col) {
        // Check Column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check Upper Left Diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check Upper Right Diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    private List<String> construct(char[][] board) {
        List<String> solution = new ArrayList<>();
        for (char[] row : board) {
            solution.add(new String(row));
        }
        return solution;
    }
}