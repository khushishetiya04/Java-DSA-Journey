/*
 * LeetCode: 112
 * Problem: Path Sum
 * Difficulty: Easy
 *
 * Approach:
 * - Use recursive DFS.
 * - We need to check whether there exists a
 *   root-to-leaf path whose sum equals targetSum.
 * - Subtract the current node's value from targetSum.
 * - At a leaf, check whether the remaining sum
 *   equals the current node's value.
 *
 * Pattern:
 * DFS + Root-to-Leaf Path
 *
 * Time Complexity : O(n)
 * Space Complexity: O(h)
 */

class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        targetSum -= root.val;

        return hasPathSum(root.left, targetSum)
                || hasPathSum(root.right, targetSum);
    }
}