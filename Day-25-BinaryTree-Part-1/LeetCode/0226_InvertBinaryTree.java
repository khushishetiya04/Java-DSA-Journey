/*
 * LeetCode: 226
 * Problem: Invert Binary Tree
 * Difficulty: Easy
 *
 * Approach:
 * - Use recursive DFS.
 * - For every node, swap its left and right children.
 * - Recursively invert the left and right subtrees.
 *
 * Pattern:
 * DFS + Recursion
 *
 * Time Complexity : O(n)
 * Space Complexity: O(h)
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}