/*
 * LeetCode: 1042
 * Problem: Flower Planting With No Adjacent
 * Difficulty: Easy
 *
 * Pattern:
 * Graph + Greedy Coloring
 *
 * Description:
 * There are n gardens connected by paths.
 * Each garden must be planted with one of four flower types.
 *
 * No two connected gardens can have the same flower type.
 *
 * Return an array representing the flower type planted in
 * each garden.
 *
 * Approach:
 * - Build an adjacency list for the gardens.
 * - For every garden, check the flowers already used by
 *   its neighboring gardens.
 * - There are only 4 flower types.
 * - Choose any flower type that is not used by its neighbors.
 * - Since each garden has at most 3 paths, one of the 4
 *   flower types will always be available.
 *
 * Time Complexity : O(n + e)
 * Space Complexity: O(n + e)
 *
 * where:
 * n = number of gardens
 * e = number of paths
 */

class Solution {
    public int[] gardenNoAdj(int n, int[][] paths) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] path : paths) {
            int u = path[0] - 1;
            int v = path[1] - 1;

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int[] flowers = new int[n];

        for (int garden = 0; garden < n; garden++) {
            boolean[] used = new boolean[5];

            for (int neighbor : graph.get(garden)) {
                if (flowers[neighbor] != 0) {
                    used[flowers[neighbor]] = true;
                }
            }

            for (int flower = 1; flower <= 4; flower++) {
                if (!used[flower]) {
                    flowers[garden] = flower;
                    break;
                }
            }
        }
        return flowers;
    }
}