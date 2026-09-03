/*
 * LeetCode: 91. Decode Ways
 *
 * Pattern: Dynamic Programming + 1D DP + Space Optimization
 *
 * Description:
 * A message containing digits can be decoded using:
 * 1 -> A, 2 -> B, ..., 26 -> Z.
 * Find the number of ways to decode the given string.
 *
 * Approach:
 * 1. Keep only the previous two DP values.
 * 2. prev2 represents dp[i - 2].
 * 3. prev1 represents dp[i - 1].
 * 4. Check whether the current digit can be decoded alone.
 * 5. Check whether the current two digits form a number from 10 to 26.
 * 6. Calculate current and shift the previous values.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }

        int prev2 = 1;
        int prev1 = 1;

        for (int i = 1; i < s.length(); i++) {
            int current = 0;
            int oneDigit = s.charAt(i) - '0';

            if (oneDigit >= 1 && oneDigit <= 9) {
                current += prev1;
            }

            int twoDigit = (s.charAt(i - 1) - '0') * 10
                    + (s.charAt(i) - '0');

            if (twoDigit >= 10 && twoDigit <= 26) {
                current += prev2;
            }

            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}