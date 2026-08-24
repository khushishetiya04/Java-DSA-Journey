/*
 * Practice: Floyd-Warshall Algorithm
 *
 * Pattern: Graph + Dynamic Programming + All-Pairs Shortest Path
 *
 * Description:
 * Floyd-Warshall finds the shortest distance between EVERY pair of vertices
 * in a weighted graph.
 *
 * It can handle:
 * - Directed graphs
 * - Negative edge weights
 *
 * It does NOT work correctly when there is a negative weight cycle.
 *
 * Approach:
 * 1. Create a distance matrix.
 * 2. Initialize dist[i][j] with the direct edge weight.
 * 3. Set dist[i][i] = 0.
 * 4. Try every vertex k as an intermediate vertex.
 * 5. Update:
 *
 *      dist[i][j] = min(dist[i][j],
 *                       dist[i][k] + dist[k][j])
 *
 * Time Complexity: O(V^3)
 *
 * Space Complexity: O(V^2)
 */

import java.util.*;
public class FloydWarshall {
    static final int INF = 1_000_000_000;

    static void floydWarshall(int[][] dist) {
        int V = dist.length;

        // k = intermediate vertex
        for (int k = 0; k < V; k++) {
            // i = source vertex
            for (int i = 0; i < V; i++) {
                // j = destination vertex
                for (int j = 0; j < V; j++) {

                    // Avoid overflow / invalid paths
                    if (dist[i][k] == INF || dist[k][j] == INF) {
                        continue;
                    }

                    dist[i][j] = Math.min(
                            dist[i][j],
                            dist[i][k] + dist[k][j]
                    );
                }
            }
        }

        // Check for negative weight cycle
        for (int i = 0; i < V; i++) {
            if (dist[i][i] < 0) {
                System.out.println("Negative weight cycle exists.");
                return;
            }
        }
    }

    static void printMatrix(int[][] dist) {
        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist.length; j++) {

                if (dist[i][j] == INF) {
                    System.out.print("INF ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        /*
         * Graph:
         *
         * 0 -> 1 = 5
         * 0 -> 3 = 10
         * 1 -> 2 = 3
         * 2 -> 3 = 1
         * 3 -> 0 = 2
         */

        int[][] dist = {
                {0,   5,   INF, 10},
                {INF, 0,   3,   INF},
                {INF, INF, 0,   1},
                {2,   INF, INF, 0}
        };

        floydWarshall(dist);
        System.out.println("All-Pairs Shortest Distance Matrix:");
        printMatrix(dist);
    }
}