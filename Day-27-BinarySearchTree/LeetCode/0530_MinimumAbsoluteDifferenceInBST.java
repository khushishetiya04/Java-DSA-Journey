/*
 * LeetCode: 530
 * Problem: Minimum Absolute Difference in BST
 * Difficulty: Easy
 *
 * Approach:
 * - Inorder traversal of a BST gives values in sorted order.
 * - Therefore, the minimum difference will always be
 *   between two adjacent values in inorder traversal.
 *
 * Pattern:
 * BST + Inorder Traversal
 *
 * Time Complexity : O(n)
 * Space Complexity: O(h)
 */

class Solution {
    int prev = -1;
    int minDiff = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        // Left
        inorder(root.left);

        // Current
        if (prev != -1) {
            minDiff = Math.min(minDiff, root.val - prev);
        }
        prev = root.val;

        // Right
        inorder(root.right);
    }
}