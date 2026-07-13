/*
 * Problem: Reverse String
 *
 * Description:
 * Reverse a character array in-place using the
 * Two Pointer technique.
 *
 * Approach:
 * - Initialize two pointers:
 *   - left at the beginning of the array.
 *   - right at the end of the array.
 * - Swap the characters at both pointers.
 * - Move left forward and right backward.
 * - Continue until both pointers meet.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

import java.util.Arrays;
public class ReverseString {
    public static void reverse(char[] str) {
        int left = 0;
        int right = str.length - 1;

        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        char[] str = {'H', 'e', 'l', 'l', 'o'};

        reverse(str);
        System.out.println("Reversed String: " + Arrays.toString(str));
    }
}