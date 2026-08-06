/*
 * LeetCode: 1700
 * Problem: Number of Students Unable to Eat Lunch
 * Difficulty: Easy
 *
 * Description:
 * Students stand in a queue and sandwiches
 * are placed in a stack.
 *
 * If the student at the front prefers the
 * sandwich on top, they take it and leave.
 * Otherwise, they move to the end of the queue.
 *
 * Return the number of students unable
 * to eat.
 *
 * Approach:
 * - Store all students in a queue.
 * - Compare the front student with the
 *   current sandwich.
 * - If they match, remove the student
 *   and move to the next sandwich.
 * - Otherwise, rotate the student to
 *   the back of the queue.
 * - If an entire rotation happens without
 *   serving anyone, stop.
 *
 * Pattern:
 * Queue Simulation
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(n)
 */

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();

        for (int student : students) {
            queue.offer(student);
        }
        int sandwichIndex = 0;
        int rotation = 0;

        while (!queue.isEmpty()) {
            if (queue.peek() == sandwiches[sandwichIndex]) {
                queue.poll();
                sandwichIndex++;
                rotation = 0;

            } else {
                queue.offer(queue.poll());
                rotation++;
            }

            if (rotation == queue.size()) {
                break;
            }
        }
        return queue.size();
    }
}