/*
 * LeetCode: 863
 * Problem: All Nodes Distance K in Binary Tree
 * Difficulty: Medium
 *
 * Approach:
 * - A Binary Tree normally allows movement only from
 *   parent to child.
 * - For this problem, we need to move in BOTH directions.
 *
 * Steps:
 * 1. Build a parent map using DFS.
 * 2. Start BFS from the target node.
 * 3. From each node, we can move to:
 *      - left child
 *      - right child
 *      - parent
 * 4. Stop when distance becomes K.
 *
 * Pattern:
 * DFS + Parent Mapping + BFS
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public List<Integer> distanceK(
            TreeNode root,
            TreeNode target,
            int k) {

        List<Integer> result = new ArrayList<>();

        // Map each node to its parent
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();

        buildParentMap(root, null, parentMap);

        // BFS from target
        Queue<TreeNode> queue = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();

        queue.offer(target);
        visited.add(target);

        int distance = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            // Reached distance K
            if (distance == k) {
                for (TreeNode node : queue) {
                    result.add(node.val);
                }
                return result;
            }

            for (int i = 0; i < size; i++) {
                TreeNode current = queue.poll();

                // Left child
                if (current.left != null
                        && !visited.contains(current.left)) {

                    visited.add(current.left);
                    queue.offer(current.left);
                }

                // Right child
                if (current.right != null
                        && !visited.contains(current.right)) {

                    visited.add(current.right);
                    queue.offer(current.right);
                }

                // Parent
                TreeNode parent = parentMap.get(current);

                if (parent != null
                        && !visited.contains(parent)) {

                    visited.add(parent);
                    queue.offer(parent);
                }
            }

            distance++;
        }
        return result;
    }

    private void buildParentMap(
            TreeNode node,
            TreeNode parent,
            Map<TreeNode, TreeNode> parentMap) {

        if (node == null) {
            return;
        }

        if (parent != null) {
            parentMap.put(node, parent);
        }

        buildParentMap(node.left, node, parentMap);
        buildParentMap(node.right, node, parentMap);
    }
}