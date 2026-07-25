/*
 * Topic: Fibonacci Number
 *
 * Description:
 * Finds the nth Fibonacci number using recursion.
 *
 * Fibonacci Series:
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *
 * Formula:
 * F(n) = F(n-1) + F(n-2)
 *
 * Approach:
 * - Base Case:
 *      F(0) = 0
 *      F(1) = 1
 * - Recursively calculate the previous two
 *   Fibonacci numbers.
 *
 * Time Complexity : O(2^n)
 * Space Complexity: O(n)
 */

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;

        System.out.println("Fibonacci Number: " + fibonacci(n));
    }
}