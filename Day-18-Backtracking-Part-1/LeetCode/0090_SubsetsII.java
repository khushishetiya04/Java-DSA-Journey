/*
 * LeetCode: 90
 * Problem: Subsets II
 * Difficulty: Medium
 *
 * Description:
 * Given an integer array that may contain duplicates,
 * return all possible unique subsets.
 *
 * The solution must not contain duplicate subsets.
 *
 * Approach:
 * - Sort the array to group duplicate elements.
 * - Use backtracking to generate subsets.
 * - Skip duplicate elements at the same recursion level.
 * - Add every current subset to the result.
 *
 * Pattern:
 * Backtracking
 *
 * Time Complexity : O(n × 2^n)
 * Space Complexity: O(n)
 */

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, int index,
                           List<Integer> current,
                           List<List<Integer>> result) {

        // Every current subset is a valid answer
        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {
            // Skip duplicates
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            // Choose
            current.add(nums[i]);

            // Explore
            backtrack(nums, i + 1, current, result);

            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}