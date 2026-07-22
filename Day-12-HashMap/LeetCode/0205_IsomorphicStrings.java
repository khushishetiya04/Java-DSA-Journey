/*
 * LeetCode: 205
 * Problem: Isomorphic Strings
 * Difficulty: Easy
 *
 * Description:
 * Given two strings s and t,
 * determine if they are isomorphic.
 *
 * Two strings are isomorphic if the characters
 * in s can be replaced to get t while preserving
 * the order of characters.
 *
 * No two characters may map to the same character,
 * but a character may map to itself.
 *
 * Approach:
 * - Use two HashMaps.
 * - One maps characters from s to t.
 * - Another maps characters from t to s.
 * - If an existing mapping conflicts,
 *   return false.
 * - Otherwise, store the mapping.
 *
 * Pattern:
 * Character Mapping
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

import java.util.HashMap;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if (mapST.containsKey(ch1)) {
                if (mapST.get(ch1) != ch2) {
                    return false;
                }
            } else {
                mapST.put(ch1, ch2);
            }

            if (mapTS.containsKey(ch2)) {
                if (mapTS.get(ch2) != ch1) {
                    return false;
                }
            } else {
                mapTS.put(ch2, ch1);
            }
        }
        return true;
    }
}