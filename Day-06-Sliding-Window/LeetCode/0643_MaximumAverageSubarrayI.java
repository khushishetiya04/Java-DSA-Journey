/*
 * LeetCode: 643
 * Problem: Maximum Average Subarray I
 * Difficulty: Easy
 *
 * Description:
 * Given an integer array nums and an integer k,
 * find the contiguous subarray of length k that
 * has the maximum average.
 *
 * Approach:
 * - Calculate the sum of the first window of size k.
 * - Store it as the maximum sum.
 * - Slide the window by removing the leftmost element
 *   and adding the next element.
 * - Return maxSum / k.
 *
 * Pattern:
 * Fixed Sliding Window
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        int maxSum = windowSum;

        for (int right = k; right < nums.length; right++) {
            windowSum = windowSum - nums[right - k] + nums[right];
            maxSum = Math.max(maxSum, windowSum);
        }
        return (double) maxSum / k;
    }
}