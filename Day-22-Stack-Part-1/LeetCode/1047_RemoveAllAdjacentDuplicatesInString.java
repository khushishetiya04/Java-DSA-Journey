/*
 * LeetCode: 1047
 * Problem: Remove All Adjacent Duplicates In String
 * Difficulty: Easy
 *
 * Description:
 * Given a string, repeatedly remove adjacent
 * duplicate characters until no duplicates remain.
 *
 * Return the final string.
 *
 * Approach:
 * - Traverse the string.
 * - Push characters onto the stack.
 * - If the current character equals the stack's top,
 *   pop it (remove the duplicate pair).
 * - Otherwise, push the current character.
 * - Build the answer from the remaining stack.
 *
 * Pattern:
 * Stack, String
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }
}