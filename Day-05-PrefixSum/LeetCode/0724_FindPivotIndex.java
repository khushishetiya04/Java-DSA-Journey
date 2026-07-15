/*
 * LeetCode: 724
 * Problem: Find Pivot Index
 * Difficulty: Easy
 *
 * Description:
 * Given an integer array nums, find the pivot index where
 * the sum of all elements to the left is equal to the sum
 * of all elements to the right.
 *
 * Approach:
 * - Calculate the total sum of the array.
 * - Maintain a running left sum.
 * - For each index:
 *      rightSum = totalSum - leftSum - nums[i]
 * - If leftSum == rightSum, return the current index.
 * - Otherwise, update leftSum and continue.
 *
 * Pattern:
 * Prefix Sum
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}