/*
 * LeetCode: 104
 * Problem: Maximum Depth of Binary Tree
 * Difficulty: Easy
 *
 * Approach:
 * - Use recursive DFS.
 * - If root is null, depth is 0.
 * - Find the depth of the left subtree.
 * - Find the depth of the right subtree.
 * - Take the maximum of both and add 1
 *   for the current node.
 *
 * Pattern:
 * DFS + Recursion
 *
 * Time Complexity : O(n)
 * Space Complexity: O(h)
 */

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        return 1 + Math.max(leftDepth, rightDepth);
    }
}