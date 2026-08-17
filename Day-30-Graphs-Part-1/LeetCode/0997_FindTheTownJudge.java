/*
 * LeetCode: 997
 * Problem: Find the Town Judge
 * Difficulty: Easy
 *
 * Pattern:
 * Graph Degree / Indegree and Outdegree
 *
 * Description:
 * In a town of n people, one person may be the town judge.
 *
 * The judge:
 * - Trusts nobody.
 * - Is trusted by everyone else.
 *
 * Given trust[i] = [a, b], person a trusts person b.
 * Return the label of the town judge, or -1 if no judge exists.
 *
 * Approach:
 * - Maintain a degree array.
 * - When a trusts b:
 *      degree[a]-- because a trusts someone.
 *      degree[b]++ because b is trusted by someone.
 * - The judge must have a final degree of n - 1.
 *
 * Time Complexity : O(T)
 * Space Complexity: O(n)
 *
 * where:
 * T = number of trust relationships
 */

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] degree = new int[n + 1];

        for (int[] relation : trust) {
            int person = relation[0];
            int trustedPerson = relation[1];

            degree[person]--;
            degree[trustedPerson]++;
        }

        for (int person = 1; person <= n; person++) {
            if (degree[person] == n - 1) {
                return person;
            }
        }
        return -1;
    }
}