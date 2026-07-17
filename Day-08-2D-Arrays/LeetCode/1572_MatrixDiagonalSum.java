/*
 * LeetCode: 1572
 * Problem: Matrix Diagonal Sum
 * Difficulty: Easy
 *
 * Description:
 * Given a square matrix, return the sum of the
 * primary and secondary diagonals.
 *
 * The center element should be counted only once
 * if the matrix has an odd dimension.
 *
 * Approach:
 * - Add the primary diagonal element.
 * - Add the secondary diagonal element.
 * - Skip adding the secondary element if it is
 *   the same as the primary diagonal element.
 *
 * Pattern:
 * Matrix Traversal
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {

            // Primary Diagonal
            sum += mat[i][i];

            // Secondary Diagonal
            if (i != n - i - 1) {
                sum += mat[i][n - i - 1];
            }
        }
        return sum;
    }
}