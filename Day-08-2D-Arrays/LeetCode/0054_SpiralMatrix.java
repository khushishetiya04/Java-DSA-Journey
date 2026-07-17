/*
 * LeetCode: 54
 * Problem: Spiral Matrix
 * Difficulty: Medium
 *
 * Description:
 * Given an m x n matrix, return all elements
 * of the matrix in spiral order.
 *
 * Approach:
 * Maintain four boundaries:
 * - startRow
 * - endRow
 * - startCol
 * - endCol
 *
 * Traverse:
 * 1. Left → Right
 * 2. Top → Bottom
 * 3. Right → Left
 * 4. Bottom → Top
 *
 * After each traversal, shrink the corresponding boundary.
 *
 * Pattern:
 * Matrix Boundary Traversal
 *
 * Time Complexity : O(m × n)
 * Space Complexity: O(1)
 * (Ignoring the output list)
 */

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Left → Right
            for (int j = startCol; j <= endCol; j++) {
                ans.add(matrix[startRow][j]);
            }

            // Top → Bottom
            for (int i = startRow + 1; i <= endRow; i++) {
                ans.add(matrix[i][endCol]);
            }

            // Right → Left
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    ans.add(matrix[endRow][j]);
                }
            }

            // Bottom → Top
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    ans.add(matrix[i][startCol]);
                }
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return ans;
    }
}