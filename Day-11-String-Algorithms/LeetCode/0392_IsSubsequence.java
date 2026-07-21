/*
 * LeetCode: 392
 * Problem: Is Subsequence
 * Difficulty: Easy
 *
 * Description:
 * Given two strings s and t, return true if
 * s is a subsequence of t, otherwise return false.
 *
 * A subsequence is formed by deleting some
 * (or no) characters from another string
 * without changing the order of the remaining characters.
 *
 * Approach:
 * - Use two pointers.
 * - One pointer traverses s.
 * - The other pointer traverses t.
 * - If characters match, move both pointers.
 * - Otherwise, move only the pointer of t.
 * - If all characters of s are matched,
 *   return true.
 *
 * Pattern:
 * Two Pointers
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 *
 * where,
 * n = t.length()
 */

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}