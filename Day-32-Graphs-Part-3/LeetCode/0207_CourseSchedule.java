/*
 * Practice: LeetCode 207 - Course Schedule
 *
 * Pattern: Graph + Topological Sort + Kahn's Algorithm
 *
 * Description:
 * Given numCourses courses and prerequisite pairs, determine whether
 * it is possible to finish all courses.
 *
 * Each prerequisite [a, b] means:
 *      b -> a
 *
 * If the directed graph contains a cycle, all courses cannot be completed.
 *
 * Approach:
 * 1. Build an adjacency list.
 * 2. Calculate indegree of every course.
 * 3. Add all courses with indegree 0 to the queue.
 * 4. Process courses using Kahn's Algorithm.
 * 5. If all courses are processed, return true.
 * 6. Otherwise, a cycle exists, so return false.
 *
 * Time Complexity: O(V + E)
 * Space Complexity: O(V + E)
 */

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
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

        // Courses with no prerequisites
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }
        int completed = 0;

        // Kahn's Algorithm
        while (!queue.isEmpty()) {
            int course = queue.poll();
            completed++;

            for (int nextCourse : graph.get(course)) {
                indegree[nextCourse]--;

                if (indegree[nextCourse] == 0) {
                    queue.offer(nextCourse);
                }
            }
        }

        // All courses must be processed
        return completed == numCourses;
    }
}