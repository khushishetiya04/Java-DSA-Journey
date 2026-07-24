/*
 * Topic: Bit Operations
 *
 * Description:
 * Demonstrates common bit operations on integers.
 *
 * Operations Covered:
 * - Get ith Bit
 * - Set ith Bit
 * - Clear ith Bit
 * - Update ith Bit
 *
 * Time Complexity:
 * All Operations -> O(1)
 */

public class BitOperations {
    // Get ith Bit
    public static int getBit(int n, int i) {
        return (n >> i) & 1;
    }

    // Set ith Bit
    public static int setBit(int n, int i) {
        return n | (1 << i);
    }

    // Clear ith Bit
    public static int clearBit(int n, int i) {
        return n & ~(1 << i);
    }

    // Update ith Bit
    public static int updateBit(int n, int i, int newBit) {
        n = clearBit(n, i);

        if (newBit == 0) {
            return n;
        }
        return setBit(n, i);
    }

    public static void main(String[] args) {

        int n = 10; // Binary: 1010
        int i = 1;

        System.out.println("Number: " + n);

        System.out.println("\nGet " + i + "th Bit:");
        System.out.println(getBit(n, i));

        System.out.println("\nSet " + i + "th Bit:");
        System.out.println(setBit(n, i));

        System.out.println("\nClear " + i + "th Bit:");
        System.out.println(clearBit(n, i));

        System.out.println("\nUpdate " + i + "th Bit to 1:");
        System.out.println(updateBit(n, i, 1));

        System.out.println("\nUpdate " + i + "th Bit to 0:");
        System.out.println(updateBit(n, i, 0));
    }
}