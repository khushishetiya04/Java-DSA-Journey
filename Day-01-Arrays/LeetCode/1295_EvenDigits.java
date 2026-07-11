/*
 * LeetCode: 1295
 * Problem: Find Numbers with Even Number of Digits
 * Difficulty: Easy
 *
 * Description:
 * Given an array of integers, return the number of integers
 * that contain an even number of digits.
 *
 * Approach:
 * - Traverse each element in the array.
 * - Count the number of digits in the current number.
 * - If the digit count is even, increment the counter.
 * - Return the final count.
 *
 * Time Complexity : O(n × d)
 * where n = number of elements and d = number of digits.
 *
 * Space Complexity: O(1)
 */

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int digits = 0;

            while (n > 0) {
                digits++;
                n /= 10;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}