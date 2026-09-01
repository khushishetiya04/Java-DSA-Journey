/*
 * LeetCode: 134. Gas Station
 *
 * Pattern: Greedy Algorithm + Feasibility
 *
 * Description:
 * There are n gas stations arranged in a circle.
 * gas[i] represents the amount of gas available at station i.
 * cost[i] represents the gas required to travel from station i
 * to the next station.
 *
 * Return the starting gas station index from which we can travel
 * around the complete circuit exactly once.
 *
 * Greedy Idea:
 * If the current starting point cannot reach station i because the
 * running gas becomes negative, none of the stations between the
 * current start and i can be a valid starting point.
 * Therefore, we can directly move the starting point to i + 1.
 *
 * Approach:
 * 1. Calculate the total gas and total cost.
 * 2. If total gas < total cost, completing the circuit is impossible.
 * 3. Maintain the current gas balance.
 * 4. If current balance becomes negative:
 *      - Reset the balance to 0.
 *      - Set the next station as the new starting point.
 * 5. Return the final starting index.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int currentGas = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            currentGas += gas[i] - cost[i];

            if (currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }
        if (totalGas < totalCost) {
            return -1;
        }
        return start;
    }
}