/*
 * Topic: Power(x, n)
 *
 * Description:
 * Calculates x raised to the power n
 * using recursion.
 *
 * Formula:
 * xⁿ = x × xⁿ⁻¹
 *
 * Approach:
 * - Base Case:
 *      n == 0 → return 1
 * - Multiply x with the result of
 *   power(x, n - 1).
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

public class Power {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        System.out.println("Power: " + power(x, n));
    }
}