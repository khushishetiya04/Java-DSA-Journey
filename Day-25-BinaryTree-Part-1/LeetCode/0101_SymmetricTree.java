/*
 * LeetCode: 101
 * Problem: Symmetric Tree
 * Difficulty: Easy
 *
 * Approach:
 * - A tree is symmetric if its left and right
 *   subtrees are mirror images.
 * - Compare:
 *      left.left  with right.right
 *      left.right with right.left
 *
 * Pattern:
 * Recursive DFS
 *
 * Time Complexity : O(n)
 * Space Complexity: O(h)
 */

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return isMirror(left.left, right.right)
                && isMirror(left.right, right.left);
    }
}