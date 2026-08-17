/*
 * LeetCode: 1791
 * Problem: Find Center of Star Graph
 * Difficulty: Easy
 *
 * Pattern:
 * Graph Degree / Star Graph
 *
 * Description:
 * Given a star graph with n nodes, find the center node.
 *
 * A star graph has one center node that is directly connected
 * to every other node.
 *
 * Approach:
 * - The center of a star graph appears in every edge.
 * - Check the first two edges.
 * - The common vertex between them is the center.
 *
 * Time Complexity : O(1)
 * Space Complexity: O(1)
 */

class Solution {
    public int findCenter(int[][] edges) {
        int a = edges[0][0];
        int b = edges[0][1];

        int c = edges[1][0];
        int d = edges[1][1];

        // Common vertex of the first two edges
        if (a == c || a == d) {
            return a;
        }
        return b;
    }
}