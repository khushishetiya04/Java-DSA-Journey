/*
 * LeetCode: 543
 * Problem: Diameter of Binary Tree
 * Difficulty: Easy
 *
 * Approach:
 * - Use DFS to calculate the height of every node.
 * - At each node, the diameter passing through that
 *   node is:
 *
 *      leftHeight + rightHeight
 *
 * - Keep track of the maximum diameter.
 *
 * Pattern:
 * DFS + Height Calculation
 *
 * Time Complexity : O(n)
 * Space Complexity: O(h)
 */

class Solution {

    int diameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Diameter passing through current node
        diameter = Math.max(
                diameter,
                leftHeight + rightHeight
        );

        return 1 + Math.max(leftHeight, rightHeight);
    }
}