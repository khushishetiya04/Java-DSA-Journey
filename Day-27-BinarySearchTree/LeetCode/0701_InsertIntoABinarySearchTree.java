/*
 * LeetCode: 701
 * Problem: Insert into a Binary Search Tree
 * Difficulty: Medium
 *
 * Approach:
 * - Use the BST property to find the correct position.
 * - If the root is null, create a new node.
 * - If val is smaller, insert into the left subtree.
 * - Otherwise, insert into the right subtree.
 *
 * Pattern:
 * BST + Recursion
 *
 * Time Complexity : O(h)
 * Space Complexity: O(h)
 */

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }
        
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }
}