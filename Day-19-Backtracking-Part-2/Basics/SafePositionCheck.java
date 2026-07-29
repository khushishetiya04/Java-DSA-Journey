/*
 * Topic: Safe Position Check
 *
 * Description:
 * Before placing a queen on the chessboard,
 * we must check whether the position is safe.
 *
 * A position is safe if:
 * 1. No queen exists in the same column.
 * 2. No queen exists on the left diagonal.
 * 3. No queen exists on the right diagonal.
 *
 * Used In:
 * - N-Queens
 * - Sudoku Solver (constraint checking)
 * - Other Constraint Satisfaction Problems
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class SafePositionCheck {
    public static boolean isSafe(char[][] board, int row, int col) {
        // Check same column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Check upper-left diagonal
        for (int i = row - 1, j = col - 1;
             i >= 0 && j >= 0;
             i--, j--) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Check upper-right diagonal
        for (int i = row - 1, j = col + 1;
             i >= 0 && j < board.length;
             i--, j++) {

            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'.', 'Q', '.', '.'},
                {'.', '.', '.', '.'},
                {'.', '.', '.', '.'},
                {'.', '.', '.', '.'}
        };

        System.out.println(isSafe(board, 1, 3)); // true
        System.out.println(isSafe(board, 1, 1)); // false
    }
}