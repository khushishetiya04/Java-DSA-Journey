/*
 * LeetCode: 1732
 * Problem: Find the Highest Altitude
 * Difficulty: Easy
 *
 * Description:
 * A biker starts at altitude 0 and is given an array gain,
 * where gain[i] is the net gain in altitude between points.
 *
 * Return the highest altitude reached.
 *
 * Approach:
 * - Start from altitude 0.
 * - Traverse the gain array.
 * - Update the current altitude by adding gain[i].
 * - Keep track of the maximum altitude reached.
 *
 * Pattern:
 * Running Prefix Sum
 *
 * Time Complexity : O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int largestAltitude(int[] gain) {
        int highest = 0;
        int altitude = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];
            highest = Math.max(highest, altitude);
        }
        return highest;
    }
}