/*
 * LeetCode: 744
 * Problem: Find Smallest Letter Greater Than Target
 * Difficulty: Easy
 *
 * Description:
 * Given a sorted array of characters and a target character,
 * return the smallest character that is lexicographically
 * greater than the target.
 *
 * The letters wrap around. For example:
 * letters = ['c','f','j'], target = 'j'
 * Answer = 'c'
 *
 * Approach:
 * - Apply Binary Search.
 * - Whenever a character greater than the target is found,
 *   store it as a possible answer and continue searching
 *   on the left for a smaller valid character.
 * - Initialize the answer with letters[0] to handle
 *   the wrap-around case.
 *
 * Pattern:
 * Binary Search (Upper Bound)
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length - 1;
        char ans = letters[0];

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (letters[mid] > target) {
                ans = letters[mid];
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}