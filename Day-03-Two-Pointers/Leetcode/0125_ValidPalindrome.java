/*
 * LeetCode: 125
 * Problem: Valid Palindrome
 * Difficulty: Easy
 *
 * Description:
 * A phrase is a palindrome if, after converting all uppercase letters
 * into lowercase letters and removing all non-alphanumeric characters,
 * it reads the same forward and backward.
 *
 * Approach:
 * - Initialize two pointers:
 *   - left at the beginning.
 *   - right at the end.
 * - Skip non-alphanumeric characters.
 * - Convert both characters to lowercase.
 * - Compare the characters.
 * - If they are different, return false.
 * - Otherwise, move both pointers toward each other.
 * - If the entire string is traversed, return true.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));

            if (leftChar != rightChar) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}