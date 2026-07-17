/*
 * LeetCode: 704
 * Problem: Binary Search
 * Difficulty: Easy
 *
 * Description:
 * Given a sorted array of integers and a target value,
 * return the index of the target if it exists.
 * Otherwise, return -1.
 *
 * Approach:
 * - Apply Binary Search on the sorted array.
 * - Compare the middle element with the target.
 * - Search the appropriate half until the target is found
 *   or the search space becomes empty.
 *
 * Pattern:
 * Binary Search
 *
 * Time Complexity : O(log n)
 * Space Complexity: O(1)
 */

class Solution {
    public int search(int[] nums, int target) {
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
        return -1;
    }
}