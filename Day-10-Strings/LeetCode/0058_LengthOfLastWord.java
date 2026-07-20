/*
 * LeetCode: 58
 * Problem: Length of Last Word
 * Difficulty: Easy
 *
 * Description:
 * Given a string consisting of words and spaces,
 * return the length of the last word.
 *
 * Approach:
 * - Start from the end of the string.
 * - Skip trailing spaces.
 * - Count characters until a space or the
 *   beginning of the string is reached.
 *
 * Pattern:
 * String Traversal
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

        while (s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
}