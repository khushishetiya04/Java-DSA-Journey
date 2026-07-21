/*
 * LeetCode: 796
 * Problem: Rotate String
 * Difficulty: Easy
 *
 * Description:
 * Given two strings s and goal,
 * return true if and only if s can become goal
 * after some number of left rotations.
 *
 * Approach:
 * - If the lengths are different, return false.
 * - Concatenate the string with itself.
 * - If goal is a substring of (s + s),
 *   then goal is a valid rotation.
 *
 * Pattern:
 * String Concatenation
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        String doubled = s + s;
        return doubled.contains(goal);
    }
}