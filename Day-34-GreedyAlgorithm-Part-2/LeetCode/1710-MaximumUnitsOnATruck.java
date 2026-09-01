/*
 * LeetCode: 1710. Maximum Units on a Truck
 *
 * Pattern: Greedy Algorithm + Sorting
 *
 * Description:
 * Given different types of boxes, where each type has a certain
 * number of boxes and units per box, load boxes onto a truck with
 * limited capacity to maximize the total number of units.
 *
 * Greedy Idea:
 * Always choose boxes with the highest units per box first.
 * This gives the maximum number of units for every available space.
 *
 * Approach:
 * 1. Sort the box types by units per box in decreasing order.
 * 2. Traverse the sorted box types.
 * 3. Take as many boxes as possible from the current type.
 * 4. Add their units to the total.
 * 5. Reduce the remaining truck capacity.
 * 6. Stop when the truck is full.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1) apart from sorting.
 */

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
        int totalUnits = 0;

        for (int[] box : boxTypes) {
            int boxes = Math.min(box[0], truckSize);
            totalUnits += boxes * box[1];
            truckSize -= boxes;

            if (truckSize == 0) {
                break;
            }
        }
        return totalUnits;
    }
}