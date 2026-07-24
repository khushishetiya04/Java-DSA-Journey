/*
 * LeetCode: 231
 * Problem: Power of Two
 * Difficulty: Easy
 *
 * Description:
 * Given an integer n, return true if it is
 * a power of two. Otherwise, return false.
 *
 * An integer n is a power of two if there exists
 * an integer x such that:
 *
 *      n = 2^x
 *
 * Approach:
 * - A power of two has exactly one set bit.
 * - For any power of two:
 *
 *      n & (n - 1) == 0
 *
 * - First check n > 0 because
 *   0 and negative numbers are not powers of two.
 *
 * Pattern:
 * Bit Manipulation
 *
 * Time Complexity : O(1)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}