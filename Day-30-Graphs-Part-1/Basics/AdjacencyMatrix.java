/*
 * Practice: Graph Representation using Adjacency Matrix
 *
 * Pattern:
 * Graph Representation
 *
 * Description:
 * Represent a graph using a 2D matrix.
 * If an edge exists between two vertices, the corresponding
 * matrix position is marked as 1.
 *
 * Approach:
 * - Create a V × V matrix.
 * - For an undirected graph, mark both:
 *      matrix[u][v] = 1
 *      matrix[v][u] = 1
 * - For a directed graph, mark only:
 *      matrix[u][v] = 1
 *
 * Time Complexity:
 * Add Edge    : O(1)
 * Check Edge  : O(1)
 *
 * Space Complexity: O(V²)
 *
 * where:
 * V = number of vertices
 */

public class AdjacencyMatrix {
    private int vertices;
    private int[][] matrix;

    // Create graph
    public AdjacencyMatrix(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    // Add edge for undirected graph
    public void addEdge(int u, int v) {
        matrix[u][v] = 1;
        matrix[v][u] = 1;
    }

    // Add edge for directed graph
    public void addDirectedEdge(int u, int v) {
        matrix[u][v] = 1;
    }

    // Check whether an edge exists
    public boolean hasEdge(int u, int v) {
        return matrix[u][v] == 1;
    }

    // Display matrix
    public void printMatrix() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyMatrix graph = new AdjacencyMatrix(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        graph.printMatrix();

        System.out.println(graph.hasEdge(0, 2)); // true
        System.out.println(graph.hasEdge(1, 4)); // false
    }
}