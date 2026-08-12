/*
 * LeetCode: 450
 * Problem: Delete Node in a BST
 * Difficulty: Medium
 *
 * Approach:
 * - Use the BST property to find the node.
 * - There are 3 deletion cases:
 *
 *   1. Node has no child
 *   2. Node has one child
 *   3. Node has two children
 *
 * - For two children:
 *   Find the inorder successor
 *   (smallest value in the right subtree).
 *
 * Pattern:
 * BST + Recursion
 *
 * Time Complexity : O(h)
 * Space Complexity: O(h)
 */

class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        // Search in left subtree
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        }

        // Search in right subtree
        else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        }

        // Node found
        else {

            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: Only right child
            if (root.left == null) {
                return root.right;
            }

            // Case 2: Only left child
            if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            TreeNode successor = findMin(root.right);
            root.val = successor.val;
            root.right = deleteNode(root.right, successor.val);
        }
        return root;
    }

    // Find smallest node in a BST
    private TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}