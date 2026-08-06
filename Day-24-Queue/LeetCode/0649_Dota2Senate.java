/*
 * LeetCode: 649
 * Problem: Dota2 Senate
 * Difficulty: Medium
 *
 * Description:
 * In the Dota2 Senate, senators belong to either
 * the Radiant ('R') or Dire ('D') party.
 *
 * Each senator can ban one senator from the
 * opposite party in rounds.
 *
 * Return the party that will finally win.
 *
 * Approach:
 * - Store the indices of Radiant and Dire senators
 *   in two queues.
 * - Compare the front indices.
 * - The senator with the smaller index acts first,
 *   bans the opponent, and is added back with
 *   index + n (next round).
 * - Continue until one queue becomes empty.
 *
 * Pattern:
 * Queue Simulation
 *
 * Time Complexity : O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiant = new LinkedList<>();
        Queue<Integer> dire = new LinkedList<>();
        int n = senate.length();

        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                radiant.offer(i);
            } else {
                dire.offer(i);
            }
        }

        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int r = radiant.poll();
            int d = dire.poll();

            if (r < d) {
                radiant.offer(r + n);
            } else {
                dire.offer(d + n);
            }
        }
        return radiant.isEmpty() ? "Dire" : "Radiant";
    }
}