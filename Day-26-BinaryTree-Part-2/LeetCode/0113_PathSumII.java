/*
 * LeetCode: 113
 * Problem: Path Sum II
 * Difficulty: Medium
 *
 * Approach:
 * - Use DFS + Backtracking.
 * - Maintain the current path.
 * - Subtract each node's value from targetSum.
 * - When a leaf is reached and the remaining sum
 *   becomes 0, add a copy of the current path.
 * - Remove the last node while backtracking.
 *
 * Pattern:
 * DFS + Backtracking
 *
 * Time Complexity : O(n²) in the worst case
 * Space Complexity: O(h)
 */

class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        dfs(root, targetSum, path, result);
        return result;
    }

    private void dfs(TreeNode root, int targetSum,
                     List<Integer> path,
                     List<List<Integer>> result) {

        if (root == null) {
            return;
        }

        path.add(root.val);
        targetSum -= root.val;

        if (root.left == null && root.right == null
                && targetSum == 0) {

            result.add(new ArrayList<>(path));
        }

        dfs(root.left, targetSum, path, result);
        dfs(root.right, targetSum, path, result);

        path.remove(path.size() - 1);
    }
}