/*
 * Topic: Print Numbers in Ascending Order
 *
 * Description:
 * Prints numbers from 1 to n using recursion.
 *
 * Approach:
 * - Recursively reach 1.
 * - Print numbers while returning from recursion.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

public class AscendingOrder {
    public static void printAscending(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }

        printAscending(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Ascending Order:");
        printAscending(n);
    }
}