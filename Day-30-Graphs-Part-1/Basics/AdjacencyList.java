/*
 * Practice: Graph Representation using Adjacency List
 *
 * Pattern:
 * Graph Representation
 *
 * Description:
 * Represent a graph using an Adjacency List.
 * Each vertex stores a list of all vertices connected to it.
 *
 * Approach:
 * - Create an ArrayList for every vertex.
 * - For an undirected graph, add both connections:
 *      u -> v
 *      v -> u
 * - For a directed graph, add only:
 *      u -> v
 *
 * Time Complexity:
 * Add Edge       : O(1)
 * Find Neighbors : O(V + E)
 *
 * Space Complexity: O(V + E)
 *
 * where:
 * V = number of vertices
 * E = number of edges
 */

import java.util.*;
public class AdjacencyList {
    private int vertices;
    private List<List<Integer>> graph;

    // Create graph
    public AdjacencyList(int vertices) {
        this.vertices = vertices;
        graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
    }
    // Add edge for undirected graph
    public void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    // Add edge for directed graph
    public void addDirectedEdge(int u, int v) {
        graph.get(u).add(v);
    }

    // Display graph
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");

            for (int neighbor : graph.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.printGraph();
    }
}