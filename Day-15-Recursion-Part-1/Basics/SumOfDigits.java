/*
 * Topic: Sum of Digits
 *
 * Description:
 * Finds the sum of all digits of a number
 * using recursion.
 *
 * Formula:
 * Sum(n) = Last Digit + Sum(Remaining Digits)
 *
 * Approach:
 * - Base Case:
 *      n == 0 → return 0
 * - Add the last digit (n % 10)
 *   and recursively process the remaining digits.
 *
 * Time Complexity : O(d)
 * Space Complexity: O(d)
 * where d = number of digits.
 */

public class SumOfDigits {
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 12345;

        System.out.println("Sum of Digits: " + sumOfDigits(n));
    }
}