/*
 * LeetCode: 199
 * Problem: Binary Tree Right Side View
 * Difficulty: Medium
 *
 * Approach:
 * - Use BFS (Level Order Traversal).
 * - Process the tree level by level.
 * - The last node processed at each level
 *   is the rightmost node.
 * - Add that node's value to the result.
 *
 * Pattern:
 * BFS + Queue + Level Order
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();

                // Last node of this level
                if (i == levelSize - 1) {
                    result.add(current.val);
                }

                if (current.left != null) {
                    queue.offer(current.left);
                }

                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
        }
        return result;
    }
}