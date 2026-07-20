/*
 * LeetCode: 344
 * Problem: Reverse String
 * Difficulty: Easy
 *
 * Description:
 * Write a function that reverses a character array
 * in-place without using extra space.
 *
 * Approach:
 * - Use two pointers.
 * - One pointer starts from the beginning.
 * - The other pointer starts from the end.
 * - Swap the characters and move both pointers
 *   towards the center.
 *
 * Pattern:
 * Two Pointers
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}