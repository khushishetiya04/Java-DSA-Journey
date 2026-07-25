/*
 * LeetCode: 1137
 * Problem: N-th Tribonacci Number
 * Difficulty: Easy
 *
 * Description:
 * The Tribonacci sequence is defined as:
 *
 * T0 = 0
 * T1 = 1
 * T2 = 1
 *
 * Tn = Tn-1 + Tn-2 + Tn-3  for n >= 3
 *
 * Return the value of Tn.
 *
 * Approach:
 * - Use simple recursion.
 * - Handle the first three base cases.
 * - Recursively compute the previous
 *   three Tribonacci numbers.
 *
 * Pattern:
 * Recursion
 *
 * Time Complexity : O(3^n)
 * Space Complexity: O(n)
 *
 * Note:
 * This recursive solution is for learning recursion.
 * An iterative or DP solution is optimal (O(n)).
 */

class Solution {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return tribonacci(n - 1)
             + tribonacci(n - 2)
             + tribonacci(n - 3);
    }
}