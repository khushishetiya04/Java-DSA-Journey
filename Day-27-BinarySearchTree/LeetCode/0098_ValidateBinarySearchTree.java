/*
 * LeetCode: 98
 * Problem: Validate Binary Search Tree
 * Difficulty: Medium
 *
 * Approach:
 * - Use DFS with a valid range for every node.
 * - Every node must satisfy:
 *
 *      min < node.val < max
 *
 * - For the left subtree:
 *      max becomes node.val
 *
 * - For the right subtree:
 *      min becomes node.val
 *
 * Pattern:
 * DFS + Range Validation
 *
 * Time Complexity : O(n)
 * Space Complexity: O(h)
 */

class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }

        // Current node must lie within valid range
        if (root.val <= min || root.val >= max) {
            return false;
        }

        // Left subtree: values must be smaller
        boolean left = validate(root.left, min, root.val);

        // Right subtree: values must be greater
        boolean right = validate(root.right, root.val, max);

        return left && right;
    }
}