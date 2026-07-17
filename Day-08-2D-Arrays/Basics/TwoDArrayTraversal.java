/*
 * Topic: 2D Array Traversal
 *
 * Description:
 * Traverse a 2D array row by row
 * using nested loops.
 *
 * Time Complexity : O(m × n)
 * Space Complexity: O(1)
 */

public class TwoDArrayTraversal {
    public static void traverse(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        traverse(matrix);
    }
}