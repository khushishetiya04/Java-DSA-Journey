/*
 * Practice: Minimum Platforms
 *
 * Pattern: Greedy Algorithm + Sorting + Two Pointers
 *
 * Description:
 * Given arrival and departure times of trains, find the minimum
 * number of platforms required so that no train has to wait.
 *
 * Greedy Idea:
 * Process trains in chronological order.
 * If a train arrives before or at the departure of another train,
 * we need another platform.
 * Otherwise, a platform becomes free.
 *
 * Approach:
 * 1. Sort arrival times.
 * 2. Sort departure times.
 * 3. Use two pointers:
 *      - If arrival[i] <= departure[j], a new platform is needed.
 *      - Otherwise, a platform is freed.
 * 4. Track the maximum platforms required.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */

import java.util.*;
public class MinimumPlatforms {
    public static int findMinimumPlatforms(int[] arrival, int[] departure) {
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i = 0;
        int j = 0;
        int platforms = 0;
        int maxPlatforms = 0;

        while (i < arrival.length && j < departure.length) {
            if (arrival[i] <= departure[j]) {
                platforms++;
                maxPlatforms = Math.max(maxPlatforms, platforms);
                i++;
            } else {
                platforms--;
                j++;
            }
        }
        return maxPlatforms;
    }

    public static void main(String[] args) {
        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

        int result = findMinimumPlatforms(arrival, departure);

        System.out.println("Minimum Platforms Required: " + result);
    }
}