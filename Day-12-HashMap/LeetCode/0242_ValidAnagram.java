/*
 * LeetCode: 242
 * Problem: Valid Anagram
 * Difficulty: Easy
 *
 * Description:
 * Given two strings s and t,
 * return true if t is an anagram of s,
 * otherwise return false.
 *
 * An anagram is formed by rearranging
 * the characters of another string using
 * all the original characters exactly once.
 *
 * Approach:
 * - If the lengths are different,
 *   return false.
 * - Use a HashMap to store the frequency
 *   difference of characters.
 * - Increment the count for characters in s.
 * - Decrement the count for characters in t.
 * - If every frequency becomes zero,
 *   the strings are anagrams.
 *
 * Pattern:
 * Frequency Count
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),
                    map.getOrDefault(s.charAt(i), 0) + 1);

            map.put(t.charAt(i),
                    map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (int value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}