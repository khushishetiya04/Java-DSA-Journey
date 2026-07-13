/*
 * LeetCode: 11
 * Problem: Container With Most Water
 * Difficulty: Medium
 *
 * Description:
 * Given an integer array height, where each element represents
 * the height of a vertical line, find two lines that together
 * with the x-axis form a container that holds the maximum amount
 * of water.
 *
 * Approach:
 * - Initialize two pointers:
 *   - left at the beginning.
 *   - right at the end.
 * - Calculate the area formed by the two lines.
 * - Update the maximum area if needed.
 * - Move the pointer with the smaller height inward,
 *   because moving the taller one cannot increase the area.
 * - Continue until both pointers meet.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int maxArea = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int area = minHeight * width;

            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}