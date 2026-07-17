/*
 * LeetCode: 35
 * Problem: Search Insert Position
 * Difficulty: Easy
 *
 * Description:
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found.
 * If not, return the index where it would be inserted
 * to maintain the sorted order.
 *
 * Approach:
 * - Apply Binary Search on the sorted array.
 * - If the target is found, return its index.
 * - If not found, the 'left' pointer will indicate the
 *   correct insertion position.
 *
 * Pattern:
 * Binary Search
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}