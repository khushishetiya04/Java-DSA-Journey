/*
 * LeetCode: 867
 * Problem: Transpose Matrix
 * Difficulty: Easy
 *
 * Description:
 * Given a 2D integer matrix, return its transpose.
 *
 * The transpose of a matrix is obtained by
 * swapping rows with columns.
 *
 * Approach:
 * - Create a new matrix of size (columns × rows).
 * - Copy each element using:
 *      transpose[j][i] = matrix[i][j]
 *
 * Pattern:
 * Matrix Manipulation
 *
 * Time Complexity : O(m × n)
 * Space Complexity: O(m × n)
 */

class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }
}