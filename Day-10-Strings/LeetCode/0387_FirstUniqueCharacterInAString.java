/*
 * LeetCode: 387
 * Problem: First Unique Character in a String
 * Difficulty: Easy
 *
 * Description:
 * Given a string s, find the first non-repeating
 * character in it and return its index.
 * If it does not exist, return -1.
 *
 * Approach:
 * - Count the frequency of each character
 *   using an integer array of size 26.
 * - Traverse the string again.
 * - Return the index of the first character
 *   whose frequency is 1.
 *
 * Pattern:
 * Character Frequency
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (freq[ch - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}