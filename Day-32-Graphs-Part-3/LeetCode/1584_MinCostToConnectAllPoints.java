/*
 * Practice: LeetCode 1584 - Min Cost to Connect All Points
 *
 * Pattern: Graph + Minimum Spanning Tree + Prim's Algorithm
 *
 * Description:
 * Given points on a 2D plane, connect all points with minimum total cost.
 *
 * The cost of connecting two points is their Manhattan distance:
 *
 *      |x1 - x2| + |y1 - y2|
 *
 * Approach:
 * 1. Treat every point as a graph node.
 * 2. The edge weight between two points is their Manhattan distance.
 * 3. Use Prim's Algorithm to build the Minimum Spanning Tree.
 * 4. Start from point 0.
 * 5. Always select the unvisited point with the minimum connection cost.
 * 6. Update the minimum cost of all unvisited points.
 *
 * Time Complexity: O(n^2 log n)
 * Space Complexity: O(n)
 */

class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        boolean[] visited = new boolean[n];
        int[] minCost = new int[n];

        Arrays.fill(
            minCost,
            Integer.MAX_VALUE
        );

        // Start from point 0
        minCost[0] = 0;

        // {cost, point}
        PriorityQueue<int[]> pq =
                new PriorityQueue<>(
                    (a, b) -> a[0] - b[0]
                );

        pq.offer(new int[]{0, 0});

        int totalCost = 0;
        int pointsUsed = 0;

        while (!pq.isEmpty() &&
               pointsUsed < n) {

            int[] current = pq.poll();
            int cost = current[0];
            int point = current[1];

            // Skip already included points
            if (visited[point]) {
                continue;
            }

            visited[point] = true;
            pointsUsed++;
            totalCost += cost;

            // Update neighboring points
            for (int next = 0; next < n; next++) {
                if (visited[next]) {
                    continue;
                }

                int distance =
                        Math.abs(
                            points[point][0] -
                            points[next][0]
                        )
                        +
                        Math.abs(
                            points[point][1] -
                            points[next][1]
                        );

                if (distance < minCost[next]) {

                    minCost[next] = distance;

                    pq.offer(
                        new int[]{
                            distance,
                            next
                        }
                    );
                }
            }
        }
        return totalCost;
    }
}