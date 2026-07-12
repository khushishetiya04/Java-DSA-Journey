/*
 * LeetCode: 977
 * Problem: Squares of a Sorted Array
 * Difficulty: Easy
 *
 * Description:
 * Given an integer array nums sorted in non-decreasing order,
 * return an array of the squares of each number sorted in
 * non-decreasing order.
 *
 * Approach:
 * - Use two pointers:
 *   - One at the beginning of the array.
 *   - One at the end of the array.
 * - Compare the squares of both elements.
 * - Place the larger square at the current last position
 *   in the result array.
 * - Move the corresponding pointer.
 * - Continue until all elements are processed.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int[] square = new int[n];
        int pos = n - 1;

        while (left <= right) {
            int leftsq = nums[left] * nums[left];
            int rightsq = nums[right] * nums[right];

            if (rightsq > leftsq) {
                square[pos] = rightsq;
                right--;
            } else {
                square[pos] = leftsq;
                left++;
            }
            pos--;
        }
        return square;
    }
}