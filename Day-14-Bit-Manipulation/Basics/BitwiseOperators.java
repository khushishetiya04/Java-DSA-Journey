/*
 * Topic: Bitwise Operators
 *
 * Description:
 * Demonstrates the basic bitwise operators in Java.
 *
 * Operators Covered:
 * - AND (&)
 * - OR (|)
 * - XOR (^)
 * - NOT (~)
 * - Left Shift (<<)
 * - Right Shift (>>)
 * - Unsigned Right Shift (>>>)
 *
 * Time Complexity:
 * All Operations -> O(1)
 */

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5; // Binary: 0101
        int b = 3; // Binary: 0011

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // AND
        System.out.println("\nAND (&):");
        System.out.println(a & b);

        // OR
        System.out.println("\nOR (|):");
        System.out.println(a | b);

        // XOR
        System.out.println("\nXOR (^):");
        System.out.println(a ^ b);

        // NOT
        System.out.println("\nNOT (~a):");
        System.out.println(~a);

        // Left Shift
        System.out.println("\nLeft Shift (a << 1):");
        System.out.println(a << 1);

        // Right Shift
        System.out.println("\nRight Shift (a >> 1):");
        System.out.println(a >> 1);

        // Unsigned Right Shift
        System.out.println("\nUnsigned Right Shift (a >>> 1):");
        System.out.println(a >>> 1);
    }
}