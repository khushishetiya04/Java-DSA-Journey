/*
 * LeetCode: 739
 * Problem: Daily Temperatures
 * Difficulty: Medium
 *
 * Description:
 * Given an array of daily temperatures,
 * return an array such that answer[i] is the
 * number of days until a warmer temperature.
 * If there is no future warmer day, answer[i] = 0.
 *
 * Approach:
 * - Traverse the array from right to left.
 * - Use a Monotonic Decreasing Stack to store indices.
 * - Remove indices whose temperatures are
 *   less than or equal to the current temperature.
 * - The top of the stack gives the next warmer day.
 *
 * Pattern:
 * Monotonic Stack
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() &&
                   temperatures[stack.peek()] <= temperatures[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = 0;
            } else {
                ans[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return ans;
    }
}