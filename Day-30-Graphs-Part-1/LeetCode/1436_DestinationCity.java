/*
 * LeetCode: 1436
 * Problem: Destination City
 * Difficulty: Easy
 *
 * Pattern:
 * Directed Graph + HashSet
 *
 * Description:
 * Given paths where paths[i] = [fromCity, toCity],
 * find the destination city.
 *
 * The destination city is the city that has no outgoing path.
 *
 * Approach:
 * - Store every city that appears as a starting point
 *   in a HashSet.
 * - Traverse all destination cities.
 * - The city that never appears as a starting point is
 *   the destination city.
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 *
 * where:
 * n = number of paths
 */

class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> startCities = new HashSet<>();

        for (List<String> path : paths) {
            String from = path.get(0);
            startCities.add(from);
        }

        for (List<String> path : paths) {
            String destination = path.get(1);

            if (!startCities.contains(destination)) {
                return destination;
            }
        }
        return "";
    }
}