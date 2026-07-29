/*
 * LeetCode: 37
 * Problem: Sudoku Solver
 * Difficulty: Hard
 *
 * Description:
 * Write a program to solve a Sudoku puzzle
 * by filling the empty cells.
 *
 * Rules:
 * - Each row must contain digits 1-9 exactly once.
 * - Each column must contain digits 1-9 exactly once.
 * - Each 3×3 sub-box must contain digits 1-9 exactly once.
 *
 * Approach:
 * - Find the first empty cell.
 * - Try placing digits from '1' to '9'.
 * - If a digit is safe, place it.
 * - Recursively solve the remaining board.
 * - If no digit works, backtrack.
 *
 * Pattern:
 * Backtracking
 *
 * Time Complexity : O(9^(n*n)) (Worst Case)
 * Space Complexity: O(n*n) (Recursion Stack)
 */

class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    private boolean solve(char[][] board) {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {

                // Empty Cell
                if (board[row][col] == '.') {

                    // Try digits 1 to 9
                    for (char num = '1'; num <= '9'; num++) {
                        if (isSafe(board, row, col, num)) {

                            // Choose
                            board[row][col] = num;

                            // Explore
                            if (solve(board)) {
                                return true;
                            }

                            // Backtrack
                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isSafe(char[][] board, int row, int col, char num) {

        // Check Row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num) {
                return false;
            }
        }

        // Check Column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check 3×3 Box
        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
}