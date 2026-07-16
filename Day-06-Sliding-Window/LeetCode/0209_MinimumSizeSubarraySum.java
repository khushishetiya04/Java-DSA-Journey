/*
 * LeetCode: 209
 * Problem: Minimum Size Subarray Sum
 * Difficulty: Medium
 *
 * Description:
 * Given an array of positive integers nums and a positive
 * integer target, return the minimal length of a subarray
 * whose sum is greater than or equal to target.
 *
 * Approach:
 * - Expand the window by moving the right pointer.
 * - Add each element to the current window sum.
 * - While the window sum is greater than or equal to target:
 *      - Update the minimum length.
 *      - Shrink the window from the left.
 *
 * Pattern:
 * Variable Sliding Window
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}