/*
 * LeetCode: 236
 * Problem: Lowest Common Ancestor of a Binary Tree
 * Difficulty: Medium
 *
 * Approach:
 * - Use recursive DFS.
 * - If root is null, return null.
 * - If root is p or q, return root.
 * - Search for p and q in the left and right subtrees.
 * - If both sides return a node, current root is the LCA.
 * - Otherwise, return the non-null side.
 *
 * Pattern:
 * DFS + Recursion
 *
 * Time Complexity : O(n)
 * Space Complexity: O(h)
 */

class Solution {
    public TreeNode lowestCommonAncestor(
            TreeNode root, TreeNode p, TreeNode q) {

        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }
}