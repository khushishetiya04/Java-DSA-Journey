/*
 * LeetCode: 779
 * Problem: K-th Symbol in Grammar
 * Difficulty: Medium
 *
 * Description:
 * Given n and k, return the kth symbol in
 * the nth row of the grammar sequence.
 *
 * Approach:
 * - Find the middle position of the current row.
 * - If k lies in the first half,
 *   recursively search in the previous row.
 * - Otherwise, search in the second half and
 *   flip the obtained answer.
 *
 * Pattern:
 * Recursion
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int kthGrammar(int n, int k) {
        if (n == 1) {
            return 0;
        }
        int mid = 1 << (n - 2);
        if (k <= mid) {
            return kthGrammar(n - 1, k);
        }
        int ans = kthGrammar(n - 1, k - mid);

        return (ans == 0) ? 1 : 0;
    }
}