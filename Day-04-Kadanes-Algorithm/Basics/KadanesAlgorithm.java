/*
 * Problem: Kadane's Algorithm
 *
 * Description:
 * Find the maximum sum of any contiguous subarray
 * using Kadane's Algorithm.
 *
 * Approach:
 * - Initialize currentSum and maxSum with the first element.
 * - Traverse the array from the second element.
 * - At each element:
 *      1. Start a new subarray from the current element.
 *      2. Extend the previous subarray.
 * - Choose the option with the larger sum.
 * - Update the maximum sum found so far.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

public class KadanesAlgorithm {
    public static int maxSubarraySum(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubarraySum(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}