/*
 * LeetCode: 27
 * Problem: Remove Element
 * Difficulty: Easy
 *
 * Description:
 * Given an integer array nums and an integer val,
 * remove all occurrences of val in-place.
 *
 * Return the number of elements that are not equal to val.
 *
 * Approach:
 * - Use two pointers:
 *   - fast scans every element.
 *   - slow keeps track of the next position for a valid element.
 * - If nums[fast] is not equal to val,
 *   copy it to nums[slow] and move both pointers.
 * - If nums[fast] equals val,
 *   simply move fast.
 * - Return slow as the count of remaining elements.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int removeElement(int[] nums, int val) {
        int fast = 0;
        int slow = 0;

        while (fast < nums.length) {
            if (nums[fast] == val) {
                fast++;
            } else {
                nums[slow] = nums[fast];
                fast++;
                slow++;
            }
        }
        return slow;
    }
}