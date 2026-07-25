/*
 * Topic: Sum of First N Numbers
 *
 * Description:
 * Finds the sum of the first n natural numbers
 * using recursion.
 *
 * Formula:
 * Sum(n) = n + Sum(n - 1)
 *
 * Approach:
 * - Base Case:
 *      n == 1 → return 1
 * - Add the current number to the
 *   sum of the remaining numbers.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

public class SumOfNNumbers {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Sum of First " + n + " Numbers: " + sum(n));
    }
}