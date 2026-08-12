/*
 * LeetCode: 938
 * Problem: Range Sum of BST
 * Difficulty: Easy
 *
 * Approach:
 * - Use DFS.
 * - Use BST property to skip unnecessary subtrees.
 *
 * If root.val < low:
 *     Only the right subtree can contain valid values.
 *
 * If root.val > high:
 *     Only the left subtree can contain valid values.
 *
 * Otherwise:
 *     Add root.val and search both subtrees.
 *
 * Pattern:
 * BST Property + DFS
 *
 * Time Complexity : O(n) worst case
 * Space Complexity: O(h)
 */

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }

        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }

        return root.val
                + rangeSumBST(root.left, low, high)
                + rangeSumBST(root.right, low, high);
    }
}