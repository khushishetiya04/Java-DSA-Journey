/*
 * Practice: Disjoint Set Union (DSU) / Union-Find
 *
 * Pattern: Graph + DSU + Connected Components
 *
 * Description:
 * DSU is used to efficiently manage a collection of disjoint sets.
 * It supports two main operations:
 * 1. Find  -> Find the ultimate parent (representative) of a node.
 * 2. Union -> Merge two different sets.
 *
 * Optimizations:
 * 1. Path Compression
 * 2. Union by Size
 *
 * Approach:
 * - Initially, every node is its own parent.
 * - During find(), path compression makes future searches faster.
 * - During union(), attach the smaller tree under the larger tree.
 *
 * Time Complexity:
 * - Find: O(alpha(V)) ≈ O(1) amortized
 * - Union: O(alpha(V)) ≈ O(1) amortized
 *
 * Space Complexity: O(V)
 */

import java.util.*;
public class DSU {
    private int[] parent;
    private int[] size;

    // Initialize DSU
    public DSU(int n) {
        parent = new int[n];
        size = new int[n];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    // Find ultimate parent with path compression
    public int find(int node) {
        if (parent[node] == node) {
            return node;
        }

        parent[node] = find(parent[node]);

        return parent[node];
    }

    // Union by size
    public void union(int u, int v) {
        int parentU = find(u);
        int parentV = find(v);

        // Already in the same component
        if (parentU == parentV) {
            return;
        }

        // Attach smaller component to larger component
        if (size[parentU] < size[parentV]) {
            parent[parentU] = parentV;
            size[parentV] += size[parentU];

        } else {
            parent[parentV] = parentU;
            size[parentU] += size[parentV];
        }
    }

    public static void main(String[] args) {
        DSU dsu = new DSU(7);

        // Create components
        dsu.union(0, 1);
        dsu.union(1, 2);

        dsu.union(3, 4);

        dsu.union(5, 6);

        // Merge components
        dsu.union(2, 4);

        System.out.println("Parent of 0: " + dsu.find(0));
        System.out.println("Parent of 1: " + dsu.find(1));
        System.out.println("Parent of 2: " + dsu.find(2));
        System.out.println("Parent of 3: " + dsu.find(3));
        System.out.println("Parent of 4: " + dsu.find(4));
        System.out.println("Parent of 5: " + dsu.find(5));
        System.out.println("Parent of 6: " + dsu.find(6));

        System.out.println("\nAre 0 and 4 connected? "
                + (dsu.find(0) == dsu.find(4)));

        System.out.println("Are 0 and 6 connected? "
                + (dsu.find(0) == dsu.find(6)));
    }
}