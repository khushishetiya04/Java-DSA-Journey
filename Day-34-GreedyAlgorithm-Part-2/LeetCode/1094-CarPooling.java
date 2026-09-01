/*
 * LeetCode: 1094. Car Pooling
 *
 * Pattern: Greedy Algorithm + Difference Array
 *
 * Description:
 * Given trips where each trip contains the number of passengers,
 * pickup location, and drop-off location, determine whether all
 * passengers can be transported without exceeding the vehicle capacity.
 *
 * Greedy Idea:
 * Track how the number of passengers changes at every location.
 * Add passengers at their pickup location and remove them at their
 * drop-off location.
 *
 * Approach:
 * 1. Create a difference array to store passenger changes.
 * 2. At the pickup location:
 *      - Add the number of passengers.
 * 3. At the drop-off location:
 *      - Subtract the number of passengers.
 * 4. Traverse all locations from left to right.
 * 5. Maintain the current number of passengers.
 * 6. If current passengers exceed the capacity, return false.
 * 7. If the capacity is never exceeded, return true.
 *
 * Time Complexity: O(n + 1000)
 * Space Complexity: O(1000)
 */

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] change = new int[1001];

        for (int[] trip : trips) {
            int passenger = trip[0];
            int from = trip[1];
            int to = trip[2];

            change[from] += passenger;
            change[to] -= passenger;
        }

        int current = 0;

        for (int i = 0; i <= 1000; i++) {
            current += change[i];
            if (current > capacity) {
                return false;
            }
        }
        return true;
    }
}