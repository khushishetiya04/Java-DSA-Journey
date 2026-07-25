/*
 * Topic: Print Numbers in Descending Order
 *
 * Description:
 * Prints numbers from n to 1 using recursion.
 *
 * Approach:
 * - Print the current number.
 * - Recursively call the function with n - 1.
 * - Stop when n becomes 1.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

public class DescendingOrder {
    public static void printDescending(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        printDescending(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Descending Order:");
        printDescending(n);
    }
}