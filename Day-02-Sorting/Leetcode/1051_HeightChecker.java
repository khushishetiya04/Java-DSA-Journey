/*
 * LeetCode: 1051
 * Problem: Height Checker
 * Difficulty: Easy
 *
 * Description:
 * A school wants to take an annual photo of all the students.
 * Return the number of indices where the heights array differs
 * from the expected sorted order.
 *
 * Approach:
 * - Create a copy of the original heights array.
 * - Sort the copied array.
 * - Compare the original array with the sorted array.
 * - Count the positions where the elements differ.
 * - Return the count.
 *
 * Time Complexity : O(n log n)
 * Space Complexity: O(n)
 */

import java.util.Arrays;
class Solution {
    public int heightChecker(int[] heights) {

        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);
        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
}