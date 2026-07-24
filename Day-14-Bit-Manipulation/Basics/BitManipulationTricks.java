/*
 * Topic: Bit Manipulation Tricks
 *
 * Description:
 * Demonstrates some common bit manipulation
 * tricks frequently used in coding interviews.
 *
 * Tricks Covered:
 * - Check Odd / Even
 * - Multiply by 2
 * - Divide by 2
 * - Swap using XOR
 * - Toggle ith Bit
 * - Remove Last Set Bit
 * - Get Lowest Set Bit
 * - Check Power of Two
 *
 * Time Complexity:
 * All Operations -> O(1)
 */

public class BitManipulationTricks {
    public static void main(String[] args) {
        int n = 10;

        // Check Odd or Even
        System.out.println("Odd or Even:");
        if ((n & 1) == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }

        // Multiply by 2
        System.out.println("\nMultiply by 2:");
        System.out.println(n << 1);

        // Divide by 2
        System.out.println("\nDivide by 2:");
        System.out.println(n >> 1);

        // Swap using XOR
        int a = 5;
        int b = 8;

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("\nSwap using XOR:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Toggle ith Bit
        int i = 2;
        System.out.println("\nToggle " + i + "th Bit:");
        System.out.println(n ^ (1 << i));

        // Remove Last Set Bit
        System.out.println("\nRemove Last Set Bit:");
        System.out.println(n & (n - 1));

        // Get Lowest Set Bit
        System.out.println("\nLowest Set Bit:");
        System.out.println(n & (-n));

        // Check Power of Two
        int num = 16;

        System.out.println("\nPower of Two:");

        if (num > 0 && (num & (num - 1)) == 0) {
            System.out.println(num + " is Power of Two");
        } else {
            System.out.println(num + " is Not Power of Two");
        }
    }
}