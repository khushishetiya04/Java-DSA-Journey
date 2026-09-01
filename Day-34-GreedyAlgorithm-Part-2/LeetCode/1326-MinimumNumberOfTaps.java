/*
 * LeetCode: 1326. Minimum Number of Taps to Open to Water a Garden
 *
 * Pattern: Greedy Algorithm + Range Expansion
 *
 * Description:
 * Given a garden from 0 to n and an array where ranges[i] represents
 * how far the tap at position i can water, find the minimum number
 * of taps needed to water the entire garden.
 *
 * Greedy Idea:
 * Treat every tap as an interval and always choose the tap that
 * extends the current reachable range the farthest.
 *
 * Approach:
 * 1. Convert every tap into its coverage interval.
 * 2. Store the farthest right endpoint for every possible left endpoint.
 * 3. Traverse the garden from left to right.
 * 4. Track the farthest position that can be reached.
 * 5. When the current range ends, open another tap and extend the range.
 * 6. If the range cannot be extended, return -1.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int minTaps(int n, int[] ranges) {
        int[] maxReach = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int left = Math.max(0, i - ranges[i]);
            int right = Math.min(n, i + ranges[i]);
            maxReach[left] = Math.max(maxReach[left], right);
        }

        int taps = 0;
        int currentEnd = 0;
        int farthest = 0;

        for (int i = 0; i < n; i++) {
            farthest = Math.max(farthest, maxReach[i]);

            if (i == currentEnd) {
                if (farthest <= currentEnd) {
                    return -1;
                }
                taps++;
                currentEnd = farthest;
            }
        }
        return taps;
    }
}