/*
 * LeetCode: 108
 * Problem: Convert Sorted Array to Binary Search Tree
 * Difficulty: Easy
 *
 * Approach:
 * - The array is already sorted.
 * - Choose the middle element as the root.
 * - Recursively build the left subtree from the left half.
 * - Recursively build the right subtree from the right half.
 * - Choosing the middle keeps the BST height balanced.
 *
 * Pattern:
 * Divide and Conquer + Recursion
 *
 * Time Complexity : O(n)
 * Space Complexity: O(log n)
 */

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = left + (right - left) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = buildTree(nums, left, mid - 1);
        root.right = buildTree(nums, mid + 1, right);

        return root;
    }
}