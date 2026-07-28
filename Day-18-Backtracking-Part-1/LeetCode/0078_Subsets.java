/*
 * LeetCode: 78
 * Problem: Subsets
 * Difficulty: Medium
 *
 * Description:
 * Given an integer array of unique elements,
 * return all possible subsets (the power set).
 *
 * The solution must not contain duplicate subsets.
 *
 * Approach:
 * - Use backtracking.
 * - Add the current subset to the answer.
 * - Try adding each remaining element.
 * - Backtrack by removing the last added element.
 *
 * Pattern:
 * Backtracking
 *
 * Time Complexity : O(n × 2^n)
 * Space Complexity: O(n)
 */

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int index,
                           List<Integer> current,
                           List<List<Integer>> result) {

        // Every current subset is a valid answer
        result.add(new ArrayList<>(current));

        // Try every possible choice
        for (int i = index; i < nums.length; i++) {

            // Choose
            current.add(nums[i]);

            // Explore
            backtrack(nums, i + 1, current, result);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}