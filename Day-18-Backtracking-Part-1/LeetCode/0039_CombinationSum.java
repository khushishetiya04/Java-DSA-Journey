/*
 * LeetCode: 39
 * Problem: Combination Sum
 * Difficulty: Medium
 *
 * Description:
 * Given an array of distinct integers (candidates)
 * and a target value, return all unique combinations
 * where the chosen numbers sum to the target.
 *
 * A number may be chosen unlimited times.
 *
 * Approach:
 * - Use backtracking to explore all combinations.
 * - At each step:
 *      1. Choose the current number.
 *      2. Recur with reduced target.
 *      3. Backtrack by removing the number.
 * - Skip to the next index when exploring new choices.
 *
 * Pattern:
 * Backtracking
 *
 * Time Complexity : O(2^target) (Exponential)
 * Space Complexity: O(target)
 */

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int target, int index,
                           List<Integer> current,
                           List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) {
            return;
        }

        // Try every possible choice
        for (int i = index; i < candidates.length; i++) {

            // Choose
            current.add(candidates[i]);

            // Explore
            backtrack(candidates, target - candidates[i], i, current, result);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}