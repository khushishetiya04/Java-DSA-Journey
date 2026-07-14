/*
 * LeetCode: 918
 * Problem: Maximum Sum Circular Subarray
 * Difficulty: Medium
 *
 * Description:
 * Given a circular integer array nums, find the maximum possible
 * sum of a non-empty subarray.
 *
 * Approach:
 * - Use Kadane's Algorithm twice:
 *   1. Find the maximum subarray sum.
 *   2. Find the minimum subarray sum.
 * - Compute the total sum of the array.
 * - The answer is:
 *      max(maxSubarraySum, totalSum - minSubarraySum)
 * - If all elements are negative, return maxSubarraySum.
 *
 * Pattern:
 * Kadane's Algorithm
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;

        int maxSum = nums[0];
        int currMax = 0;

        int minSum = nums[0];
        int currMin = 0;

        for (int num : nums) {
            total += num;

            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);
        }
        if (maxSum < 0) {
            return maxSum;
        }
        return Math.max(maxSum, total - minSum);
    }
}