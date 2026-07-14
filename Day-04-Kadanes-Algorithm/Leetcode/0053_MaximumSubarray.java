/*
 * LeetCode: 53
 * Problem: Maximum Subarray
 * Difficulty: Medium
 *
 * Description:
 * Given an integer array nums, find the contiguous subarray
 * with the largest sum and return its sum.
 *
 * Approach:
 * - Use Kadane's Algorithm.
 * - Maintain:
 *      1. currentSum -> Maximum sum ending at the current index.
 *      2. maxSum -> Maximum subarray sum found so far.
 * - For each element:
 *      - Either start a new subarray from the current element.
 *      - Or extend the previous subarray.
 * - Update maxSum after each iteration.
 *
 * Pattern:
 * Kadane's Algorithm
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}