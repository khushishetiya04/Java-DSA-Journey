/*
 * Practice: Prim's Algorithm
 *
 * Pattern: Graph + Greedy + Minimum Spanning Tree + Priority Queue
 *
 * Description:
 * Prim's Algorithm finds the Minimum Spanning Tree (MST) of a
 * connected, weighted, undirected graph.
 *
 * Approach:
 * 1. Start from any vertex.
 * 2. Add all its edges to a Min PriorityQueue.
 * 3. Pick the minimum-weight edge that connects to an unvisited vertex.
 * 4. Add that vertex to the MST.
 * 5. Repeat until all vertices are included.
 *
 * Time Complexity: O(E log V)
 * Space Complexity: O(V + E)
 */

import java.util.*;
public class Prim {
    // {neighbor, weight}
    static class Pair {
        int node;
        int weight;

        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    // {weight, node}
    static class Node {
        int weight;
        int node;

        Node(int weight, int node) {
            this.weight = weight;
            this.node = node;
        }
    }

    static int prim(
            int V,
            ArrayList<ArrayList<Pair>> graph) {

        boolean[] visited = new boolean[V];

        PriorityQueue<Node> pq =
                new PriorityQueue<>(
                    (a, b) -> a.weight - b.weight
                );

        // Start from vertex 0
        pq.offer(new Node(0, 0));
        int mstWeight = 0;
        int edgesUsed = 0;

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int weight = current.weight;
            int node = current.node;

            // Skip already visited vertices
            if (visited[node]) {
                continue;
            }

            // Add node to MST
            visited[node] = true;
            mstWeight += weight;
            edgesUsed++;

            // Add all unvisited neighbors
            for (Pair edge : graph.get(node)) {
                if (!visited[edge.node]) {

                    pq.offer(
                        new Node(
                            edge.weight,
                            edge.node
                        )
                    );
                }
            }
        }

        // If graph is disconnected, MST is not possible
        if (edgesUsed != V) {
            return -1;
        }
        return mstWeight;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Pair>> graph =
                new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Undirected weighted graph

        graph.get(0).add(new Pair(1, 2));
        graph.get(1).add(new Pair(0, 2));

        graph.get(0).add(new Pair(3, 6));
        graph.get(3).add(new Pair(0, 6));

        graph.get(1).add(new Pair(2, 3));
        graph.get(2).add(new Pair(1, 3));

        graph.get(1).add(new Pair(3, 8));
        graph.get(3).add(new Pair(1, 8));

        graph.get(1).add(new Pair(4, 5));
        graph.get(4).add(new Pair(1, 5));

        graph.get(2).add(new Pair(4, 7));
        graph.get(4).add(new Pair(2, 7));

        graph.get(3).add(new Pair(4, 9));
        graph.get(4).add(new Pair(3, 9));

        int result = prim(V, graph);

        System.out.println(
            "Minimum Spanning Tree Weight: " + result
        );
    }
}