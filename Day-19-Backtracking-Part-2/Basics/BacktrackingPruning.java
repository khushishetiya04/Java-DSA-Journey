/*
 * Topic: Backtracking Pruning
 *
 * Description:
 * Pruning is an optimization technique used in
 * backtracking to stop exploring a path that
 * cannot produce a valid solution.
 *
 * Instead of checking every possibility,
 * we return immediately when a condition
 * becomes invalid.
 *
 * Example:
 * Find all combinations whose sum equals a target.
 *
 * Time Complexity : Exponential (Reduced by pruning)
 * Space Complexity: O(n)
 */

import java.util.*;
public class BacktrackingPruning {
    public static void backtrack(int[] nums, int target, int index,
                                 List<Integer> current) {

        // Pruning Condition
        if (target < 0) {
            return;
        }

        // Valid Solution
        if (target == 0) {
            System.out.println(current);
            return;
        }

        for (int i = index; i < nums.length; i++) {

            // Choose
            current.add(nums[i]);

            // Explore
            backtrack(nums, target - nums[i], i + 1, current);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 6};
        int target = 8;
        backtrack(nums, target, 0, new ArrayList<>());
    }
}