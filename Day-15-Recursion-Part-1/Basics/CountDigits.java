/*
 * Topic: Count Digits
 *
 * Description:
 * Counts the number of digits in a number
 * using recursion.
 *
 * Approach:
 * - Remove the last digit in each recursive call.
 * - Count 1 for each digit removed.
 * - Stop when the number becomes 0.
 *
 * Time Complexity : O(d)
 * Space Complexity: O(d)
 * where d = number of digits.
 */

public class CountDigits {
    public static int countDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        int n = 12345;

        System.out.println("Number of Digits: " + countDigits(n));
    }
}