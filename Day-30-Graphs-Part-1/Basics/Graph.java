/*
 * Practice: Basic Graph Implementation
 *
 * Pattern:
 * Graph Representation
 *
 * Description:
 * Create a basic graph using vertices and edges.
 * This class demonstrates how vertices are connected
 * in an undirected graph.
 *
 * Approach:
 * - Store the number of vertices.
 * - Use an Adjacency List to store connections.
 * - Add an edge by connecting both vertices.
 * - Display all vertices and their connected neighbors.
 *
 * Time Complexity:
 * Add Edge       : O(1)
 * Display Graph  : O(V + E)
 *
 * Space Complexity: O(V + E)
 *
 * where:
 * V = number of vertices
 * E = number of edges
 */

import java.util.*;
public class Graph {
    private int vertices;
    private List<List<Integer>> graph;

    // Create a graph with given number of vertices
    public Graph(int vertices) {
        this.vertices = vertices;
        graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
    }

    // Add an undirected edge
    public void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    // Display graph
    public void display() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");

            for (int neighbor : graph.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.display();
    }
}