/*
 * LeetCode: 169
 * Problem: Majority Element
 * Difficulty: Easy
 *
 * Description:
 * Given an integer array of size n,
 * return the majority element.
 *
 * The majority element appears more than
 * ⌊ n / 2 ⌋ times.
 *
 * Approach:
 * - Divide the array into two halves.
 * - Recursively find the majority element
 *   in each half.
 * - If both halves return the same element,
 *   it is the majority.
 * - Otherwise, count the occurrences of both
 *   candidates in the current range and
 *   return the one with the higher frequency.
 *
 * Pattern:
 * Divide and Conquer
 *
 * Time Complexity : O(n log n)
 * Space Complexity: O(log n)
 */

class Solution {
    public int majorityElement(int[] nums) {
        return majority(nums, 0, nums.length - 1);
    }

    private int majority(int[] nums, int left, int right) {
        if (left == right) {
            return nums[left];
        }

        int mid = left + (right - left) / 2;
        int leftMajor = majority(nums, left, mid);
        int rightMajor = majority(nums, mid + 1, right);

        if (leftMajor == rightMajor) {
            return leftMajor;
        }

        int leftCount = count(nums, leftMajor, left, right);
        int rightCount = count(nums, rightMajor, left, right);

        return (leftCount > rightCount) ? leftMajor : rightMajor;
    }

    private int count(int[] nums, int target, int left, int right) {
        int count = 0;

        for (int i = left; i <= right; i++) {
            if (nums[i] == target) {
                count++;
            }
        }
        return count;
    }
}