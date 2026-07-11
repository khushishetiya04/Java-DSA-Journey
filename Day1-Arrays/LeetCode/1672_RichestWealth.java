/*
 * LeetCode: 1672
 * Problem: Richest Customer Wealth
 * Difficulty: Easy
 *
 * Description:
 * You are given an m × n integer matrix 'accounts', where each row
 * represents a customer and each column represents the amount of money
 * that customer has in a particular bank.
 *
 * Return the wealth of the richest customer.
 *
 * Approach:
 * - Traverse each row of the matrix.
 * - Calculate the sum of each customer's wealth.
 * - Compare it with the current maximum wealth.
 * - Update the maximum if a richer customer is found.
 *
 * Time Complexity : O(m × n)
 * Space Complexity: O(1)
 */

class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int richest = 0;

        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += accounts[i][j];
            }
            if (sum > richest) {
                richest = sum;
            }
        }

        return richest;
    }
}