/*
 * LeetCode: 110
 * Problem: Balanced Binary Tree
 * Difficulty: Easy
 *
 * Approach:
 * - Use DFS to calculate the height of each subtree.
 * - A tree is balanced if the height difference between
 *   the left and right subtrees is at most 1 for every node.
 * - Return -1 whenever an unbalanced subtree is found.
 *
 * Pattern:
 * DFS + Height Calculation
 *
 * Time Complexity : O(n)
 * Space Complexity: O(h)
 */

class Solution {
    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
    }

    private int checkHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = checkHeight(root.left);

        if (leftHeight == -1) {
            return -1;
        }
        int rightHeight = checkHeight(root.right);

        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }
}