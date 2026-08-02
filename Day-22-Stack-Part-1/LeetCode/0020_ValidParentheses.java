/*
 * LeetCode: 20
 * Problem: Valid Parentheses
 * Difficulty: Easy
 *
 * Description:
 * Given a string containing the characters
 * '(', ')', '{', '}', '[' and ']',
 * determine whether the input string is valid.
 *
 * A string is valid if:
 * - Open brackets are closed by the same type.
 * - Open brackets are closed in the correct order.
 *
 * Approach:
 * - Traverse the string.
 * - Push every opening bracket onto the stack.
 * - For every closing bracket:
 *      - If the stack is empty → invalid.
 *      - Pop the top and check whether it matches.
 * - At the end, the stack must be empty.
 *
 * Pattern:
 * Stack
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}