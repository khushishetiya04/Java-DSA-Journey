/*
 * LeetCode: 100
 * Problem: Same Tree
 * Difficulty: Easy
 *
 * Approach:
 * - Compare the two trees recursively.
 * - If both nodes are null, they are equal.
 * - If one node is null, trees are different.
 * - If values are different, trees are different.
 * - Recursively compare left and right subtrees.
 *
 * Pattern:
 * Recursive DFS
 *
 * Time Complexity : O(n)
 * Space Complexity: O(h)
 */

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        
        return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}