/*
 * Practice: LeetCode 743 - Network Delay Time
 *
 * Pattern: Graph + Dijkstra's Algorithm + Priority Queue
 *
 * Description:
 * Given a directed weighted graph, find the time required for a signal
 * sent from node k to reach all nodes.
 *
 * Approach:
 * 1. Build a directed adjacency list.
 * 2. Use Dijkstra's Algorithm from source k.
 * 3. Store the shortest distance to every node.
 * 4. Find the maximum shortest distance.
 * 5. If any node is unreachable, return -1.
 *
 * Time Complexity: O((V + E) log V)
 * Space Complexity: O(V + E)
 */

class Solution {
    public int networkDelayTime(
            int[][] times,
            int n,
            int k) {

        // {neighbor, weight}
        ArrayList<ArrayList<int[]>> graph =
                new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Build directed graph
        for (int[] time : times) {
            int u = time[0];
            int v = time[1];
            int weight = time[2];

            graph.get(u).add(
                    new int[]{v, weight}
            );
        }

        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        // {distance, node}
        PriorityQueue<int[]> pq =
                new PriorityQueue<>(
                    (a, b) -> a[0] - b[0]
                );

        dist[k] = 0;
        pq.offer(new int[]{0, k});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentDistance = current[0];
            int node = current[1];

            // Ignore outdated entry
            if (currentDistance > dist[node]) {
                continue;
            }

            for (int[] edge : graph.get(node)) {
                int neighbor = edge[0];
                int weight = edge[1];

                int newDistance =
                        currentDistance + weight;

                // Relaxation
                if (newDistance < dist[neighbor]) {
                    dist[neighbor] = newDistance;

                    pq.offer(
                        new int[]{
                            newDistance,
                            neighbor
                        }
                    );
                }
            }
        }
        int maxTime = 0;

        // Check all nodes
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            }

            maxTime =
                    Math.max(maxTime, dist[i]);
        }
        return maxTime;
    }
}