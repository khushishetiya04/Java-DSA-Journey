/*
 * LeetCode: 700
 * Problem: Search in a Binary Search Tree
 * Difficulty: Easy
 *
 * Approach:
 * - Use the BST property.
 * - If val == root.val, return root.
 * - If val < root.val, search the left subtree.
 * - If val > root.val, search the right subtree.
 *
 * Pattern:
 * BST Search
 *
 * Time Complexity : O(h)
 * Space Complexity: O(h)
 */

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        
        if (val < root.val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }
}