/*
 * LeetCode: 212
 * Problem: Word Search II
 * Difficulty: Hard
 *
 * Pattern:
 * Trie + DFS + Backtracking + Matrix
 *
 * Description:
 * Given a 2D board and a list of words, find all words that
 * can be formed in the board.
 *
 * A word can be formed by moving horizontally or vertically
 * to adjacent cells. The same cell cannot be used more than once
 * for the same word.
 *
 * Approach:
 * - Insert all words into a Trie.
 * - Start DFS from every cell of the board.
 * - Check whether the current character exists in the Trie.
 * - If it does not exist, stop exploring that path.
 * - Move in four directions using DFS.
 * - Mark the current cell as visited during backtracking.
 * - When a Trie node contains a complete word, add it to
 *   the result.
 * - Remove the stored word after finding it to avoid duplicates.
 *
 * Time Complexity:
 * O(M × N × 4^L)
 *
 * where:
 * M = number of rows
 * N = number of columns
 * L = maximum word length
 *
 * Space Complexity:
 * O(W × L + L)
 *
 * where:
 * W = number of words
 * L = maximum word length
 */

class Solution {
    static class Node {
        Node[] children = new Node[26];
        String word;
    }

    private Node root = new Node();
    private List<String> result = new ArrayList<>();
    private int rows;
    private int cols;

    // Four possible directions
    private int[][] directions = {
        {1, 0},
        {-1, 0},
        {0, 1},
        {0, -1}
    };

    public List<String> findWords(
            char[][] board,
            String[] words) {

        rows = board.length;
        cols = board[0].length;

        // Build Trie
        for (String word : words) {
            insert(word);
        }

        // Start DFS from every cell
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                dfs(board, i, j, root);
            }
        }

        return result;
    }

    // Insert word into Trie
    private void insert(String word) {

        Node current = root;

        for (char ch : word.toCharArray()) {

            int index = ch - 'a';

            if (current.children[index] == null) {
                current.children[index] = new Node();
            }

            current = current.children[index];
        }

        // Store complete word
        current.word = word;
    }

    // DFS + Backtracking
    private void dfs(
            char[][] board,
            int row,
            int col,
            Node parent) {

        // Boundary check
        if (row < 0 || row >= rows ||
            col < 0 || col >= cols) {
            return;
        }

        char ch = board[row][col];

        // Already visited
        if (ch == '#') {
            return;
        }

        int index = ch - 'a';

        // Character doesn't exist in Trie
        if (parent.children[index] == null) {
            return;
        }

        Node current = parent.children[index];

        // Complete word found
        if (current.word != null) {

            result.add(current.word);

            // Prevent duplicate result
            current.word = null;
        }

        // Mark current cell as visited
        board[row][col] = '#';

        // Explore four directions
        for (int[] direction : directions) {

            int newRow = row + direction[0];
            int newCol = col + direction[1];

            dfs(board, newRow, newCol, current);
        }

        // Backtrack
        board[row][col] = ch;
    }
}