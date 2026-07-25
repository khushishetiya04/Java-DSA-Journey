/*
 * Topic: Factorial of a Number
 *
 * Description:
 * Finds the factorial of a number using recursion.
 *
 * Formula:
 * n! = n × (n - 1)!
 *
 * Example:
 * 5! = 5 × 4 × 3 × 2 × 1 = 120
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

public class Factorial {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Factorial of " + n + " = " + factorial(n));
    }
}