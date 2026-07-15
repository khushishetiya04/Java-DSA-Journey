/*
 * LeetCode: 1480
 * Problem: Running Sum of 1D Array
 * Difficulty: Easy
 *
 * Description:
 * Given an array nums, return the running sum of nums.
 *
 * The running sum at index i is the sum of all elements
 * from index 0 to i.
 *
 * Approach:
 * - Traverse the array from index 1.
 * - Add the previous running sum to the current element.
 * - Store the result back in the same array.
 *
 * Pattern:
 * Prefix Sum (Running Prefix Sum)
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}