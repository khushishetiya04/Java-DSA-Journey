/*
 * LeetCode: 191
 * Problem: Number of 1 Bits
 * Difficulty: Easy
 *
 * Description:
 * Write a function that takes an unsigned integer
 * and returns the number of '1' bits it has
 * (also known as the Hamming Weight).
 *
 * Approach:
 * - Check the last bit using (n & 1).
 * - If it is 1, increment the count.
 * - Right shift the number by one bit.
 * - Repeat until all bits are processed.
 *
 * Pattern:
 * Bit Manipulation
 *
 * Time Complexity : O(32) ≈ O(1)
 * Space Complexity: O(1)
 */

public class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count += (n & 1);
            n >>>= 1;
        }
        return count;
    }
}