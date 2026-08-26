/*
 * Practice: Job Sequencing with Deadlines
 *
 * Pattern: Greedy Algorithm
 *
 * Description:
 * Given jobs with deadlines and profits, schedule jobs to maximize
 * total profit. Each job takes exactly one unit of time and must be
 * completed on or before its deadline.
 *
 * Greedy Idea:
 * Choose jobs with higher profit first and place each job in the
 * latest available slot before its deadline.
 *
 * Approach:
 * 1. Sort all jobs by profit in descending order.
 * 2. Find the maximum deadline.
 * 3. Create time slots.
 * 4. For each job, check from its deadline backwards.
 * 5. Place the job in the latest available slot.
 * 6. Calculate total profit.
 *
 * Time Complexity: O(n log n + n * d)
 * Space Complexity: O(d)
 */

import java.util.*;
public class JobSequencing {
    static class Job {
        String id;
        int deadline;
        int profit;

        Job(String id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void jobSequencing(Job[] jobs) {
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
        int maxDeadline = 0;

        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        String[] slots = new String[maxDeadline + 1];
        int totalProfit = 0;
        int count = 0;

        for (Job job : jobs) {
            for (int slot = job.deadline; slot >= 1; slot--) {

                if (slots[slot] == null) {
                    slots[slot] = job.id;
                    totalProfit += job.profit;
                    count++;
                    break;
                }
            }
        }
        System.out.println("Selected Jobs:");

        for (int i = 1; i <= maxDeadline; i++) {
            if (slots[i] != null) {
                System.out.print(slots[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Number of Jobs: " + count);
        System.out.println("Maximum Profit: " + totalProfit);
    }

    public static void main(String[] args) {
        Job[] jobs = {
            new Job("J1", 2, 100),
            new Job("J2", 1, 19),
            new Job("J3", 2, 27),
            new Job("J4", 1, 25),
            new Job("J5", 3, 15)
        };

        jobSequencing(jobs);
    }
}