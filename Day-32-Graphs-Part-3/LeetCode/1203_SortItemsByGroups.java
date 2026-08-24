/*
 * Practice: LeetCode 1203 - Sort Items by Groups Respecting Dependencies
 *
 * Pattern: Graph + Topological Sort + Kahn's Algorithm
 *
 * Description:
 * Sort items while respecting:
 * 1. Item-to-item dependencies.
 * 2. Group ordering constraints.
 *
 * Items with group[i] = -1 are assigned a unique new group.
 *
 * Approach:
 * 1. Assign a unique group to every ungrouped item.
 * 2. Build:
 *      - Item graph: dependency between individual items.
 *      - Group graph: dependency between groups.
 * 3. Topologically sort the groups.
 * 4. Topologically sort the items.
 * 5. Put items into their groups according to the group topological order.
 * 6. If either graph contains a cycle, return an empty array.
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(n + m)
 *
 * n = number of items
 * m = total number of dependencies
 */

class Solution {
    public int[] sortItems(
            int n,
            int m,
            int[] group,
            List<List<Integer>> beforeItems) {

        /*
         * Step 1:
         * Assign a unique group to every ungrouped item.
         */
        for (int i = 0; i < n; i++) {
            if (group[i] == -1) {
                group[i] = m++;
            }
        }

        /*
         * Item graph and group graph.
         */
        List<List<Integer>> itemGraph =
                new ArrayList<>();

        List<List<Integer>> groupGraph =
                new ArrayList<>();

        for (int i = 0; i < n; i++) {
            itemGraph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            groupGraph.add(new ArrayList<>());
        }

        int[] itemIndegree = new int[n];
        int[] groupIndegree = new int[m];

        /*
         * Step 2:
         * Build both graphs.
         */
        for (int item = 0; item < n; item++) {
            for (int before : beforeItems.get(item)) {

                // Item dependency
                itemGraph
                        .get(before)
                        .add(item);

                itemIndegree[item]++;

                /*
                 * If items belong to different groups,
                 * create a group dependency.
                 */
                if (group[before] != group[item]) {
                    groupGraph
                            .get(group[before])
                            .add(group[item]);

                    groupIndegree[group[item]]++;
                }
            }
        }

        /*
         * Step 3:
         * Topological sort groups.
         */
        List<Integer> groupOrder =
                topologicalSort(
                    groupGraph,
                    groupIndegree
                );

        if (groupOrder.size() != m) {
            return new int[0];
        }

        /*
         * Step 4:
         * Topological sort items.
         */
        List<Integer> itemOrder =
                topologicalSort(
                    itemGraph,
                    itemIndegree
                );

        if (itemOrder.size() != n) {
            return new int[0];
        }

        /*
         * Step 5:
         * Group items according to their group.
         */
        List<List<Integer>> groupedItems =
                new ArrayList<>();

        for (int i = 0; i < m; i++) {
            groupedItems.add(new ArrayList<>());
        }

        for (int item : itemOrder) {
            groupedItems
                    .get(group[item])
                    .add(item);
        }

        /*
         * Step 6:
         * Construct final answer using group order.
         */
        int[] result = new int[n];
        int index = 0;

        for (int currentGroup : groupOrder) {
            for (int item :
                    groupedItems.get(currentGroup)) {

                result[index++] = item;
            }
        }
        return result;
    }

    /*
     * Kahn's Algorithm
     */
    private List<Integer> topologicalSort(
            List<List<Integer>> graph,
            int[] indegree) {

        Queue<Integer> queue =
                new LinkedList<>();

        for (int i = 0; i < graph.size(); i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        List<Integer> order =
                new ArrayList<>();

        while (!queue.isEmpty()) {
            int node = queue.poll();
            order.add(node);

            for (int neighbor : graph.get(node)) {
                indegree[neighbor]--;

                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }
        return order;
    }
}