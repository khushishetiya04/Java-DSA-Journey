/*
 * LeetCode: 844
 * Problem: Backspace String Compare
 * Difficulty: Easy
 *
 * Description:
 * Given two strings s and t, return true if they
 * are equal after applying backspace ('#') operations.
 *
 * Approach:
 * - Simulate typing using a stack.
 * - Push normal characters.
 * - Pop when '#' is encountered.
 * - Compare the final processed strings.
 *
 * Pattern:
 * Stack + String
 *
 * Time Complexity : O(n + m)
 * Space Complexity: O(n + m)
 */

class Solution {
    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private String build(String str) {
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                stack.push(ch);
            } else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}