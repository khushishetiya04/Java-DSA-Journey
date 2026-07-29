/*
 * LeetCode: 79
 * Problem: Word Search
 * Difficulty: Medium
 *
 * Description:
 * Given an m × n grid of characters and a string word,
 * return true if the word exists in the grid.
 *
 * A word can be constructed from sequentially adjacent
 * cells (up, down, left, right).
 *
 * A cell can be used only once in a path.
 *
 * Approach:
 * - Traverse every cell as a starting point.
 * - If the current character matches,
 *   explore all four directions.
 * - Mark the current cell as visited.
 * - Backtrack by restoring the original character.
 *
 * Pattern:
 * Grid Backtracking
 *
 * Time Complexity : O(m × n × 4^L)
 * Space Complexity: O(L)
 */

class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word,
                        int row, int col, int index) {

        // Word Found
        if (index == word.length()) {
            return true;
        }

        // Boundary & Character Check
        if (row < 0 || col < 0 ||
            row >= board.length ||
            col >= board[0].length ||
            board[row][col] != word.charAt(index)) {

            return false;
        }

        // Choose (Mark Visited)
        char temp = board[row][col];
        board[row][col] = '#';

        // Explore Four Directions
        boolean found =
                dfs(board, word, row - 1, col, index + 1) ||
                dfs(board, word, row + 1, col, index + 1) ||
                dfs(board, word, row, col - 1, index + 1) ||
                dfs(board, word, row, col + 1, index + 1);

        // Backtrack
        board[row][col] = temp;
        return found;
    }
}