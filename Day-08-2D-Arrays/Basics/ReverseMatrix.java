/*
 * Topic: Reverse Matrix
 *
 * Description:
 * Reverse every row of a matrix in-place
 * using the Two Pointer approach.
 *
 * Time Complexity : O(m × n)
 * Space Complexity: O(1)
 */

public class ReverseMatrix {
    public static void reverseMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            int left = 0;
            int right = row.length - 1;

            while (left < right) {
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;

                left++;
                right--;
            }
        }
    }
    public static void printMatrix(int[][] matrix) {

        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
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

        reverseMatrix(matrix);
        printMatrix(matrix);
    }
}