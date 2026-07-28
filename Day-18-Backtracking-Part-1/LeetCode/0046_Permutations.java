/*
 * LeetCode: 46
 * Problem: Permutations
 * Difficulty: Medium
 *
 * Description:
 * Given an array of distinct integers,
 * return all possible permutations.
 *
 * Approach:
 * - Use backtracking with a visited array.
 * - Choose an unused element.
 * - Recursively build the permutation.
 * - Backtrack by removing the element and
 *   marking it as unused.
 *
 * Pattern:
 * Backtracking
 *
 * Time Complexity : O(n × n!)
 * Space Complexity: O(n)
 */

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new boolean[nums.length],
                new ArrayList<>(), result);

        return result;
    }

    private void backtrack(int[] nums, boolean[] visited,
                           List<Integer> current,
                           List<List<Integer>> result) {

        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Try every unused element
        for (int i = 0; i < nums.length; i++) {
            if (visited[i]) {
                continue;
            }

            // Choose
            visited[i] = true;
            current.add(nums[i]);

            // Explore
            backtrack(nums, visited, current, result);

            // Backtrack
            current.remove(current.size() - 1);
            visited[i] = false;
        }
    }
}