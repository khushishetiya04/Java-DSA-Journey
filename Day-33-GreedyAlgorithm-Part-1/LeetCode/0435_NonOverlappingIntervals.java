/*
 * LeetCode: 435 - Non-overlapping Intervals
 *
 * Pattern: Greedy + Sorting
 *
 * Description:
 * Given intervals, find the minimum number of intervals that must be
 * removed so that the remaining intervals do not overlap.
 *
 * Approach:
 * 1. Sort intervals by their end time.
 * 2. Keep the interval that finishes earliest.
 * 3. If the next interval starts before the current interval ends,
 *    remove the overlapping interval.
 * 4. Otherwise, keep the interval and update the end time.
 *
 * Greedy Idea:
 * Keep the interval with the earliest finish time because it leaves
 * the maximum possible space for future intervals.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1) auxiliary space
 */

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) ->
            Integer.compare(a[1], b[1])
        );

        int removed = 0;
        int lastEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < lastEnd) {
                removed++;
            } else {
                lastEnd = intervals[i][1];
            }
        }

        return removed;
    }
}