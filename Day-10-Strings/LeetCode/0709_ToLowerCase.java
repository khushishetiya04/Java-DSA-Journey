/*
 * LeetCode: 709
 * Problem: To Lower Case
 * Difficulty: Easy
 *
 * Description:
 * Given a string, return the string after
 * replacing every uppercase letter with its
 * lowercase equivalent.
 *
 * Approach:
 * - Traverse the string character by character.
 * - If the character is between 'A' and 'Z',
 *   convert it to lowercase using ASCII.
 * - Append each character to a StringBuilder.
 *
 * Pattern:
 * String Traversal + Character Manipulation
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}