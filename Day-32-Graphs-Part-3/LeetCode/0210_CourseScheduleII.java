/*
 * Practice: LeetCode 210 - Course Schedule II
 *
 * Pattern: Graph + Topological Sort + Kahn's Algorithm
 *
 * Description:
 * Given numCourses courses and prerequisite pairs, return an ordering
 * of courses that allows you to finish all courses.
 *
 * Each prerequisite [a, b] means:
 *      b -> a
 *
 * If the graph contains a cycle, return an empty array.
 *
 * Approach:
 * 1. Build an adjacency list.
 * 2. Calculate indegree of every course.
 * 3. Add all courses with indegree 0 to a queue.
 * 4. Process courses using Kahn's Algorithm.
 * 5. Add every processed course to the result.
 * 6. If all courses are processed, return the result.
 * 7. Otherwise, a cycle exists, so return an empty array.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V + E)
 */

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> graph =
                new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        int[] indegree = new int[numCourses];

        // Build graph
        for (int[] prerequisite : prerequisites) {
            int course = prerequisite[0];
            int prerequisiteCourse = prerequisite[1];

            graph.get(prerequisiteCourse).add(course);
            indegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        // Add courses with indegree 0
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        int[] result = new int[numCourses];
        int index = 0;

        // Kahn's Algorithm
        while (!queue.isEmpty()) {
            int course = queue.poll();
            result[index++] = course;

            for (int nextCourse : graph.get(course)) {
                indegree[nextCourse]--;

                if (indegree[nextCourse] == 0) {
                    queue.offer(nextCourse);
                }
            }
        }

        // Cycle detected
        if (index != numCourses) {
            return new int[0];
        }
        return result;
    }
}