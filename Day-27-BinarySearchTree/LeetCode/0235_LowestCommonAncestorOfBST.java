/*
 * LeetCode: 235
 * Problem: Lowest Common Ancestor of a Binary Search Tree
 * Difficulty: Medium
 *
 * Approach:
 * - Use the BST property.
 * - If both p and q are smaller than root,
 *   move to the left subtree.
 * - If both p and q are greater than root,
 *   move to the right subtree.
 * - Otherwise, the current root is the LCA.
 *
 * Pattern:
 * BST Property + DFS
 *
 * Time Complexity : O(h)
 * Space Complexity: O(h)
 */

class Solution {
    public TreeNode lowestCommonAncestor(
            TreeNode root,
            TreeNode p,
            TreeNode q) {

        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } 
        else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        else {
            return root;
        }
    }
}