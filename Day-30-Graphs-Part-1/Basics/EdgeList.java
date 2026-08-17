/*
 * Practice: Graph Representation using Edge List
 *
 * Pattern:
 * Graph Representation
 *
 * Description:
 * Represent a graph as a list of edges.
 * Each edge stores the source vertex and destination vertex.
 *
 * Approach:
 * - Create an Edge class containing `source` and `destination`.
 * - Store every edge inside an ArrayList.
 * - For a weighted graph, also store the edge weight.
 * - For an undirected graph, store the connection as needed
 *   according to the problem.
 *
 * Time Complexity:
 * Add Edge      : O(1)
 * Search Edge   : O(E)
 *
 * Space Complexity: O(E)
 *
 * where:
 * E = number of edges
 */

import java.util.*;
public class EdgeList {
    static class Edge {
        int source;
        int destination;

        Edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }
    private List<Edge> edges;
    public EdgeList() {
        edges = new ArrayList<>();
    }

    // Add an edge
    public void addEdge(int source, int destination) {
        edges.add(new Edge(source, destination));
    }

    // Display all edges
    public void printEdges() {
        for (Edge edge : edges) {
            System.out.println(
                edge.source + " -> " + edge.destination
            );
        }
    }

    public static void main(String[] args) {
        EdgeList graph = new EdgeList();

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.printEdges();
    }
}