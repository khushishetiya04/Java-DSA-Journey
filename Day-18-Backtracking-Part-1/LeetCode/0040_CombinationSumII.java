/*
 * LeetCode: 40
 * Problem: Combination Sum II
 * Difficulty: Medium
 *
 * Description:
 * Given a collection of candidate numbers
 * (may contain duplicates) and a target,
 * return all unique combinations where the
 * chosen numbers sum to the target.
 *
 * Each number may be used only once.
 *
 * Approach:
 * - Sort the array to group duplicates.
 * - Use backtracking to generate combinations.
 * - Skip duplicate elements at the same level.
 * - Move to the next index after choosing an element
 *   since each number can be used only once.
 *
 * Pattern:
 * Backtracking
 *
 * Time Complexity : O(2^n)
 * Space Complexity: O(n)
 */

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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

        for (int i = index; i < candidates.length; i++) {
            // Skip duplicates
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Choose
            current.add(candidates[i]);

            // Explore
            backtrack(candidates, target - candidates[i], i + 1, current, result);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}