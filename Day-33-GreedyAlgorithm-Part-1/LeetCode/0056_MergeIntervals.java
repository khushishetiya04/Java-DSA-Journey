/*
 * LeetCode: 56 - Merge Intervals
 *
 * Pattern: Greedy + Sorting
 *
 * Description:
 * Given an array of intervals, merge all overlapping intervals.
 *
 * Approach:
 * 1. Sort intervals by start time.
 * 2. Keep the current interval.
 * 3. If the next interval overlaps, merge them.
 * 4. Otherwise, add the current interval to the result.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= end) {
                end = Math.max(end, intervals[i][1]);
            } else {
                result.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        result.add(new int[]{start, end});
        return result.toArray(new int[result.size()][]);
    }
}