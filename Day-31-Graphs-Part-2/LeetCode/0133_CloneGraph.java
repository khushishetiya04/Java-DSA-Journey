/*
 * Practice: 133 - Clone Graph
 *
 * Pattern:
 * DFS + HashMap
 *
 * Description:
 * Create a deep copy of an undirected connected graph.
 * Each node in the cloned graph must be a new node with the
 * same value and cloned neighbors as the original graph.
 *
 * Approach:
 * - Use a HashMap to store the mapping between original nodes
 *   and their cloned nodes.
 * - If a node has already been cloned, return the existing clone.
 * - Create a new node for the current node.
 * - Store the original-to-clone mapping.
 * - Recursively clone all neighbors.
 * - Add each cloned neighbor to the cloned node.
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
    private Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        if (map.containsKey(node)) {
            return map.get(node);
        }

        Node clone = new Node(node.val);
        map.put(node, clone);

        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }
        return clone;
    }
}