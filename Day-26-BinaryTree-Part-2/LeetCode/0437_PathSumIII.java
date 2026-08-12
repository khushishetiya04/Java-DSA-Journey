/*
 * LeetCode: 437
 * Problem: Path Sum III
 * Difficulty: Medium
 *
 * Approach:
 * - Use DFS + Prefix Sum + HashMap.
 * - The path can start and end at any node.
 * - prefixSum stores the number of times each
 *   prefix sum has occurred.
 * - If currentSum - targetSum exists in the map,
 *   a valid path ending at the current node exists.
 *
 * Pattern:
 * Prefix Sum + HashMap + DFS
 *
 * Time Complexity : O(n)
 * Space Complexity: O(h)
 */

class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        Map<Long, Integer> prefixSum = new HashMap<>();

        // Empty path with sum 0
        prefixSum.put(0L, 1);

        return dfs(root, 0L, targetSum, prefixSum);
    }

    private int dfs(TreeNode root,
                    long currentSum,
                    int targetSum,
                    Map<Long, Integer> prefixSum) {

        if (root == null) {
            return 0;
        }

        currentSum += root.val;

        // Number of valid paths ending at current node
        int count = prefixSum.getOrDefault(
                currentSum - targetSum, 0);

        // Add current prefix sum
        prefixSum.put(
                currentSum,
                prefixSum.getOrDefault(currentSum, 0) + 1
        );

        // Explore left and right
        count += dfs(root.left, currentSum, targetSum, prefixSum);
        count += dfs(root.right, currentSum, targetSum, prefixSum);

        // Backtrack: remove current prefix sum
        prefixSum.put(
                currentSum,
                prefixSum.get(currentSum) - 1
        );
        return count;
    }
}