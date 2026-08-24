/*
 * Practice: Bellman-Ford Algorithm
 *
 * Pattern:
 * Shortest Path + Edge Relaxation
 *
 * Description:
 * Bellman-Ford finds the shortest distance from a source
 * vertex to all other vertices in a weighted directed graph.
 *
 * Unlike Dijkstra's Algorithm, Bellman-Ford can handle
 * negative edge weights.
 *
 * It can also detect a negative weight cycle.
 *
 * Approach:
 * - Initialize distance of the source as 0.
 * - Initialize all other distances as infinity.
 * - Relax every edge V - 1 times.
 * - After V - 1 relaxations, check all edges one more time.
 * - If any distance can still be reduced, the graph contains
 *   a negative weight cycle.
 *
 * Relaxation:
 * If
 *
 * distance[u] + weight < distance[v]
 *
 * then update distance[v].
 *
 * Time Complexity : O(V × E)
 * Space Complexity: O(V)
 *
 * where:
 * V = number of vertices
 * E = number of edges
 */

import java.util.*;
public class BellmanFord {
    static class Edge {
        int source;
        int destination;
        int weight;

        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void bellmanFord(
            int vertices,
            List<Edge> edges,
            int source) {

        int[] distance = new int[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        // Relax all edges V - 1 times
        for (int i = 1; i <= vertices - 1; i++) {
            boolean updated = false;

            for (Edge edge : edges) {
                if (distance[edge.source] == Integer.MAX_VALUE) {
                    continue;
                }

                int newDistance =
                    distance[edge.source] + edge.weight;

                if (newDistance < distance[edge.destination]) {
                    distance[edge.destination] = newDistance;
                    updated = true;
                }
            }

            // No update means shortest distances are finalized
            if (!updated) {
                break;
            }
        }

        // Check for negative weight cycle
        for (Edge edge : edges) {
            if (distance[edge.source] == Integer.MAX_VALUE) {
                continue;
            }

            if (distance[edge.source] + edge.weight
                    < distance[edge.destination]) {

                System.out.println(
                    "Negative weight cycle detected."
                );
                return;
            }
        }

        // Print shortest distances
        System.out.println("Shortest distances:");

        for (int i = 0; i < vertices; i++) {
            if (distance[i] == Integer.MAX_VALUE) {

                System.out.println(
                    i + " -> INF"
                );

            } else {

                System.out.println(
                    i + " -> " + distance[i]
                );
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        List<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0, 1, 6));
        edges.add(new Edge(0, 2, 7));
        edges.add(new Edge(1, 2, 8));
        edges.add(new Edge(1, 3, 5));
        edges.add(new Edge(1, 4, -4));
        edges.add(new Edge(2, 3, -3));
        edges.add(new Edge(2, 4, 9));
        edges.add(new Edge(3, 1, -2));
        edges.add(new Edge(4, 0, 2));
        edges.add(new Edge(4, 3, 7));

        bellmanFord(
            vertices,
            edges,
            0
        );
    }
}