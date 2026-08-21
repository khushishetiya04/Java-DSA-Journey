/*
 * Practice: 785 - Is Graph Bipartite?
 *
 * Pattern:
 * BFS + Graph Coloring
 *
 * Description:
 * Determine whether an undirected graph is bipartite.
 * A graph is bipartite if its vertices can be divided into two
 * groups such that no two adjacent vertices belong to the same group.
 *
 * Approach:
 * - Create a color array initialized with -1 for all vertices.
 * - Use BFS to traverse the graph.
 * - Assign the starting vertex color 0.
 * - Assign the opposite color to every uncolored neighbor.
 * - If a neighbor already has the same color as the current vertex,
 *   the graph is not bipartite.
 * - Start BFS from every uncolored vertex to handle disconnected graphs.
 *
 * Time Complexity:
 * O(V + E)
 *
 * Space Complexity:
 * O(V)
 *
 * where:
 * V = number of vertices
 * E = number of edges
 */

class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);

        for (int i = 0; i < n; i++) {
            if (color[i] != -1) {
                continue;
            }

            Queue<Integer> queue = new LinkedList<>();
            queue.offer(i);
            color[i] = 0;

            while (!queue.isEmpty()) {
                int current = queue.poll();

                for (int neighbor : graph[current]) {
                    if (color[neighbor] == -1) {
                        color[neighbor] = 1 - color[current];
                        queue.offer(neighbor);
                    } else if (color[neighbor] == color[current]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}