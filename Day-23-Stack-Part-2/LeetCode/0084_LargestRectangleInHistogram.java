/*
 * LeetCode: 84
 * Problem: Largest Rectangle in Histogram
 * Difficulty: Hard
 *
 * Description:
 * Given an array of integers representing
 * the heights of histogram bars,
 * return the area of the largest rectangle.
 *
 * Approach:
 * - Use a Monotonic Increasing Stack to store indices.
 * - When the current bar is smaller than the top,
 *   calculate areas for popped bars.
 * - Push current index.
 * - After traversal, process remaining bars.
 *
 * Pattern:
 * Monotonic Increasing Stack
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            while (!stack.isEmpty() &&
                  (i == n || heights[stack.peek()] >= heights[i])) {

                int height = heights[stack.pop()];
                int width;

                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
}