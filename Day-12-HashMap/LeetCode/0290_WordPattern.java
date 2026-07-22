/*
 * LeetCode: 290
 * Problem: Word Pattern
 * Difficulty: Easy
 *
 * Description:
 * Given a pattern and a string s,
 * determine if s follows the same pattern.
 *
 * Each letter in the pattern must map to
 * exactly one word, and each word must map
 * to exactly one letter.
 *
 * Approach:
 * - Split the string into words.
 * - If the number of words and pattern
 *   length are different, return false.
 * - Use two HashMaps:
 *      1. Character -> Word
 *      2. Word -> Character
 * - Verify mappings while traversing.
 *
 * Pattern:
 * Two-Way Mapping
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

import java.util.HashMap;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = words[i];

            if (charToWord.containsKey(ch)) {
                if (!charToWord.get(ch).equals(word)) {
                    return false;
                }
            } else {
                charToWord.put(ch, word);
            }

            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != ch) {
                    return false;
                }
            } else {
                wordToChar.put(word, ch);
            }
        }
        return true;
    }
}