/*
 * Problem: Check Palindrome
 *
 * Description:
 * Check whether a given string is a palindrome using the
 * Two Pointer technique.
 *
 * Approach:
 * - Initialize two pointers:
 *   - left at the beginning of the string.
 *   - right at the end of the string.
 * - Compare characters at both pointers.
 * - If they are different, the string is not a palindrome.
 * - Otherwise, move both pointers toward each other.
 * - Continue until left crosses right.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class IsPalindrome {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";

        if (isPalindrome(str)) {
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is not a Palindrome.");
        }
    }
}