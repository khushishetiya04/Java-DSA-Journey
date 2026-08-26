/*
 * LeetCode: 57 - Insert Interval
 *
 * Pattern: Greedy + Intervals
 *
 * Description:
 * Given non-overlapping intervals sorted by start time and a new interval,
 * insert the new interval and merge overlapping intervals.
 *
 * Approach:
 * 1. Add all intervals that end before the new interval starts.
 * 2. Merge all intervals that overlap with the new interval.
 * 3. Add the merged new interval.
 * 4. Add all remaining intervals.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;

        while (i < intervals.length &&
               intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        while (i < intervals.length &&
               intervals[i][0] <= newInterval[1]) {

            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        result.add(newInterval);

        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][]);
    }
}