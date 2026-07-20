/*
 * LeetCode: 125
 * Problem: Valid Palindrome
 * Difficulty: Easy
 *
 * Description:
 * Given a string, determine if it is a palindrome,
 * considering only alphanumeric characters and
 * ignoring letter case.
 *
 * Approach:
 * - Use two pointers: one from the beginning and
 *   one from the end.
 * - Skip non-alphanumeric characters.
 * - Compare characters after converting them
 *   to lowercase.
 *
 * Pattern:
 * Two Pointers + String
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