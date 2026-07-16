/*
 * LeetCode: 1456
 * Problem: Maximum Number of Vowels in a Substring of Given Length
 * Difficulty: Medium
 *
 * Description:
 * Given a string s and an integer k, return the maximum
 * number of vowel letters in any substring of length k.
 *
 * Approach:
 * - Count the vowels in the first window of size k.
 * - Store it as the current maximum.
 * - Slide the window:
 *      - Remove the outgoing character.
 *      - Add the incoming character.
 * - Update the maximum vowel count.
 *
 * Pattern:
 * Fixed Sliding Window
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean isVowel(char ch) {
        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }

    public int maxVowels(String s, int k) {
        int windowCount = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                windowCount++;
            }
        }

        int maxCount = windowCount;

        for (int right = k; right < s.length(); right++) {

            char outgoing = s.charAt(right - k);
            char incoming = s.charAt(right);

            if (isVowel(outgoing)) {
                windowCount--;
            }

            if (isVowel(incoming)) {
                windowCount++;
            }
            maxCount = Math.max(maxCount, windowCount);
        }
        return maxCount;
    }
}