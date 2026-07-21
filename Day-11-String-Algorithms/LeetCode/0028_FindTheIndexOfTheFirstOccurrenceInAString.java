/*
 * LeetCode: 28
 * Problem: Find the Index of the First Occurrence in a String
 * Difficulty: Easy
 *
 * Description:
 * Given two strings needle and haystack,
 * return the index of the first occurrence
 * of needle in haystack.
 * If needle is not part of haystack,
 * return -1.
 *
 * Approach:
 * - Traverse every possible starting position.
 * - Compare characters of needle with haystack.
 * - If all characters match, return the index.
 * - Otherwise continue searching.
 *
 * Pattern:
 * String Matching (Naive)
 *
 * Time Complexity : O((n - m + 1) × m)
 * Worst Case      : O(n × m)
 * Space Complexity: O(1)
 *
 * where,
 * n = haystack.length()
 * m = needle.length()
 */

class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m == 0) {
            return 0;
        }

        for (int i = 0; i <= n - m; i++) {
            int j = 0;

            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
}