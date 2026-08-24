/*
 * Practice: Kruskal's Algorithm
 *
 * Pattern: Graph + Greedy + Minimum Spanning Tree + DSU
 *
 * Description:
 * Kruskal's Algorithm finds the Minimum Spanning Tree (MST) of a
 * connected, weighted, undirected graph.
 *
 * Approach:
 * 1. Store all edges.
 * 2. Sort edges by increasing weight.
 * 3. Use DSU to check whether adding an edge creates a cycle.
 * 4. If the two vertices belong to different components:
 *      - Add the edge to the MST.
 *      - Union the two components.
 * 5. Stop after selecting V - 1 edges.
 *
 * Time Complexity: O(E log E)
 * Space Complexity: O(V + E)
 */

import java.util.*;
public class Kruskal {
    // Edge representation
    static class Edge {
        int u;
        int v;
        int weight;

        Edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }

    // DSU
    static class DSU {
        int[] parent;
        int[] size;

        DSU(int n) {
            parent = new int[n];
            size = new int[n];

            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        // Find with path compression
        int find(int node) {
            if (parent[node] == node) {
                return node;
            }

            return parent[node] = find(parent[node]);
        }

        // Union by size
        boolean union(int u, int v) {
            int parentU = find(u);
            int parentV = find(v);

            // Cycle detected
            if (parentU == parentV) {
                return false;
            }

            if (size[parentU] < size[parentV]) {
                parent[parentU] = parentV;
                size[parentV] += size[parentU];

            } else {
                parent[parentV] = parentU;
                size[parentU] += size[parentV];
            }
            return true;
        }
    }

    static int kruskal(int V, ArrayList<Edge> edges) {
        // Sort edges by weight
        edges.sort((a, b) -> a.weight - b.weight);

        DSU dsu = new DSU(V);
        int mstWeight = 0;
        int edgesUsed = 0;

        System.out.println("Edges in MST:");

        for (Edge edge : edges) {
            // Add edge only if it does not create a cycle
            if (dsu.union(edge.u, edge.v)) {

                mstWeight += edge.weight;
                edgesUsed++;

                System.out.println(
                    edge.u + " - " +
                    edge.v + " : " +
                    edge.weight
                );

                // MST contains exactly V - 1 edges
                if (edgesUsed == V - 1) {
                    break;
                }
            }
        }
        return mstWeight;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();

        // {u, v, weight}
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 6));
        edges.add(new Edge(0, 3, 5));
        edges.add(new Edge(1, 3, 15));
        edges.add(new Edge(2, 3, 4));

        int mstWeight = kruskal(V, edges);

        System.out.println("\nMinimum MST Weight: " + mstWeight);
    }
}