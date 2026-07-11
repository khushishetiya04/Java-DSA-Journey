/*
 * LeetCode: 1480
 * Problem: Running Sum of 1D Array
 * Difficulty: Easy
 *
 * Description:
 * Given an array 'nums', return the running sum of the array.
 * The running sum at index i is the sum of all elements from
 * index 0 to i.
 *
 * Approach:
 * - Create a new array 'runningSum' of the same size as the input.
 * - Initialize the first element with nums[0].
 * - Traverse the array from index 1.
 * - Add the current element to the previous running sum.
 * - Return the resulting array.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = nums[i] + runningSum[i - 1];
        }
        return runningSum;
    }
}