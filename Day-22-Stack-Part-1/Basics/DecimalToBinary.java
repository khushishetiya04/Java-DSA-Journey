/*
 * Topic: Decimal to Binary using Stack
 *
 * Description:
 * Convert a decimal number into its binary
 * representation using a Stack.
 *
 * Algorithm:
 * 1. Repeatedly divide the number by 2.
 * 2. Push the remainder onto the stack.
 * 3. Pop all elements to obtain the binary number.
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(log n)
 */

import java.util.Stack;
public class DecimalToBinary {
    public static void decimalToBinary(int n) {
        if (n == 0) {
            System.out.println("Binary: 0");
            return;
        }
        Stack<Integer> stack = new Stack<>();

        while (n > 0) {
            stack.push(n % 2);
            n /= 2;
        }
        System.out.print("Binary: ");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int number = 25;

        System.out.println("Decimal: " + number);
        decimalToBinary(number);
    }
}