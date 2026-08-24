/*
 * Practice: LeetCode 684 - Redundant Connection
 *
 * Pattern: Graph + DSU (Disjoint Set Union) + Cycle Detection
 *
 * Description:
 * Given a graph that started as a tree and then had one extra edge added,
 * find the edge that creates the cycle.
 *
 * Approach:
 * 1. Initially, every node belongs to its own component.
 * 2. For every edge (u, v):
 *      - Find the parent of u and v.
 *      - If both have the same parent, adding this edge creates a cycle.
 *      - Otherwise, union their components.
 * 3. Return the first edge whose endpoints are already connected.
 *
 * Time Complexity: O(E * alpha(V)) ≈ O(E)
 * Space Complexity: O(V)
 */

class Solution {
    int[] parent;
    int[] size;

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        parent = new int[n + 1];
        size = new int[n + 1];

        // Initially, every node is its own parent
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            size[i] = 1;
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            // If already connected, this edge creates a cycle
            if (find(u) == find(v)) {
                return edge;
            }
            union(u, v);
        }
        return new int[0];
    }

    // Find with path compression
    private int find(int node) {
        if (parent[node] == node) {
            return node;
        }
        return parent[node] = find(parent[node]);
    }

    // Union by size
    private void union(int u, int v) {
        int parentU = find(u);
        int parentV = find(v);

        if (parentU == parentV) {
            return;
        }

        if (size[parentU] < size[parentV]) {
            parent[parentU] = parentV;
            size[parentV] += size[parentU];

        } else {
            parent[parentV] = parentU;
            size[parentU] += size[parentV];
        }
    }
}