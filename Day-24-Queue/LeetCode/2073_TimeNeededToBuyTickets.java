/*
 * LeetCode: 2073
 * Problem: Time Needed to Buy Tickets
 * Difficulty: Easy
 *
 * Description:
 * There are n people in a queue where the ith
 * person wants to buy tickets[i] tickets.
 *
 * Each second:
 * - The front person buys one ticket.
 * - If they still need more tickets, they
 *   move to the end of the queue.
 * - Otherwise, they leave the queue.
 *
 * Return the time required for the person
 * at index k to finish buying tickets.
 *
 * Approach:
 * - Simulate the queue.
 * - Store each person's index.
 * - Each turn, decrement one ticket.
 * - If a person still needs tickets,
 *   move them to the back.
 * - Stop when person k finishes.
 *
 * Pattern:
 * Queue Simulation
 *
 * Time Complexity : O(totalTickets)
 * Space Complexity: O(n)
 */

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < tickets.length; i++) {
            queue.offer(i);
        }
        int time = 0;

        while (!queue.isEmpty()) {
            int person = queue.poll();
            tickets[person]--;
            time++;

            if (tickets[person] > 0) {
                queue.offer(person);
            } else if (person == k) {
                return time;
            }
        }
        return time;
    }
}