/*
 * LeetCode: 189
 * Problem: Rotate Array
 * Difficulty: Medium
 *
 * Description:
 * Given an integer array nums, rotate the array to the right
 * by k steps, where k is non-negative.
 *
 * Approach:
 * - Find the effective rotation using k % nums.length.
 * - Reverse the entire array.
 * - Reverse the first k elements.
 * - Reverse the remaining elements.
 *
 * Pattern:
 * Opposite Direction Two Pointers (Reverse Technique)
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
}