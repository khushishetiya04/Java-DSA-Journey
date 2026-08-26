/*
 * LeetCode: 452 - Minimum Number of Arrows to Burst Balloons
 *
 * Pattern: Greedy + Sorting
 *
 * Description:
 * Given balloons represented by intervals [xstart, xend],
 * find the minimum number of arrows needed to burst all balloons.
 *
 * Approach:
 * 1. Sort balloons by their ending position.
 * 2. Shoot the first arrow at the end of the first balloon.
 * 3. If the next balloon starts <= arrow position, the same arrow
 *    can burst it.
 * 4. Otherwise, shoot a new arrow at the end of the current balloon.
 *
 * Greedy Idea:
 * Always place the arrow at the earliest possible ending point.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1) auxiliary space
 */

class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) ->
            Integer.compare(a[1], b[1])
        );
        int arrows = 1;
        int arrowPosition = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > arrowPosition) {
                arrows++;
                arrowPosition = points[i][1];
            }
        }
        return arrows;
    }
}