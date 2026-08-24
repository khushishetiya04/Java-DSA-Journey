/*
 * Practice: Dijkstra's Algorithm
 *
 * Pattern: Graph + Greedy + Priority Queue
 *
 * Description:
 * Finds the shortest distance from a source vertex to every other vertex
 * in a weighted graph with NON-NEGATIVE edge weights.
 *
 * Approach:
 * 1. Build an adjacency list.
 * 2. Use a Min PriorityQueue to always process the node with minimum distance.
 * 3. Relax all adjacent edges.
 * 4. If a shorter distance is found, update it and add it to the PriorityQueue.
 *
 * Time Complexity: O((V + E) log V)
 * Space Complexity: O(V + E)
 */

import java.util.*;
public class Dijkstra {
    // {neighbor, weight}
    static class Pair {
        int node;
        int weight;

        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }
    }

    // {distance, node}
    static class Node {
        int distance;
        int node;

        Node(int distance, int node) {
            this.distance = distance;
            this.node = node;
        }
    }

    static int[] dijkstra(
            int V,
            ArrayList<ArrayList<Pair>> graph,
            int source) {

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<Node> pq =
                new PriorityQueue<>((a, b) -> a.distance - b.distance);

        dist[source] = 0;
        pq.offer(new Node(0, source));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int currentDistance = current.distance;
            int currentNode = current.node;

            // Ignore outdated entry
            if (currentDistance > dist[currentNode]) {
                continue;
            }

            // Relax all adjacent edges
            for (Pair edge : graph.get(currentNode)) {
                int neighbor = edge.node;
                int weight = edge.weight;

                if (currentDistance + weight < dist[neighbor]) {
                    dist[neighbor] = currentDistance + weight;

                    pq.offer(
                        new Node(dist[neighbor], neighbor)
                    );
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Pair>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        // Undirected weighted graph
        graph.get(0).add(new Pair(1, 4));
        graph.get(0).add(new Pair(2, 1));

        graph.get(1).add(new Pair(0, 4));
        graph.get(1).add(new Pair(2, 2));
        graph.get(1).add(new Pair(3, 1));

        graph.get(2).add(new Pair(0, 1));
        graph.get(2).add(new Pair(1, 2));
        graph.get(2).add(new Pair(3, 5));

        graph.get(3).add(new Pair(1, 1));
        graph.get(3).add(new Pair(2, 5));
        graph.get(3).add(new Pair(4, 3));

        graph.get(4).add(new Pair(3, 3));

        int source = 0;
        int[] result = dijkstra(V, graph, source);
        System.out.println("Shortest distances from source " + source + ":");

        for (int i = 0; i < V; i++) {
            System.out.println(
                "0 -> " + i + " = " + result[i]
            );
        }
    }
}