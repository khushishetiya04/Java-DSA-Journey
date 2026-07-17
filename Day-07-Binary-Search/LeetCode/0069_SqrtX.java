/*
 * LeetCode: 69
 * Problem: Sqrt(x)
 * Difficulty: Easy
 *
 * Description:
 * Given a non-negative integer x, return the square root
 * of x rounded down to the nearest integer.
 *
 * Approach:
 * - Apply Binary Search on the range [0, x].
 * - If mid * mid equals x, return mid.
 * - If mid * mid is less than x, store mid as a possible answer
 *   and search in the right half.
 * - Otherwise, search in the left half.
 *
 * Pattern:
 * Binary Search on Answer
 *
 * Time Complexity : O(log x)
 * Space Complexity: O(1)
 */

class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            }
            if (square < x) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}