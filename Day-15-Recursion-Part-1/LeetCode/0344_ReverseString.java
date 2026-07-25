/*
 * LeetCode: 344
 * Problem: Reverse String
 * Difficulty: Easy
 *
 * Description:
 * Write a function that reverses a character array.
 * The input array must be modified in-place with O(1) extra memory.
 *
 * Approach:
 * - Use recursion with two pointers.
 * - Swap the left and right characters.
 * - Move both pointers toward the center.
 * - Stop when left >= right.
 *
 * Pattern:
 * Recursion + Two Pointers
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)   // Recursive call stack
 */

class Solution {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }

    private void reverse(char[] s, int left, int right) {
        if (left >= right) {
            return;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        
        reverse(s, left + 1, right - 1);
    }
}