/*
 * LeetCode: 621
 * Problem: Task Scheduler
 * Difficulty: Medium
 *
 * Approach:
 * - Count the frequency of every task.
 * - The task with the highest frequency determines the
 *   basic structure of the schedule.
 * - Place the most frequent task first.
 * - Fill the gaps with other tasks.
 *
 * Formula:
 *
 * (maxFreq - 1) * (n + 1) + numberOfTasksWithMaxFreq
 *
 * Answer:
 * max(totalTasks, calculatedSlots)
 *
 * Pattern:
 * Greedy + Frequency Counting
 *
 * Time Complexity : O(tasks.length)
 * Space Complexity: O(1)
 */

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for (char task : tasks) {
            freq[task - 'A']++;
        }
        int maxFreq = 0;

        for (int count : freq) {
            maxFreq = Math.max(maxFreq, count);
        }
        int maxCount = 0;

        for (int count : freq) {
            if (count == maxFreq) {
                maxCount++;
            }
        }
        
        int intervals =
                (maxFreq - 1) * (n + 1) + maxCount;

        return Math.max(tasks.length, intervals);
    }
}