/*
 * LeetCode: 135. Candy
 *
 * Pattern: Greedy Algorithm + Two Pass
 *
 * Description:
 * There are n children standing in a line.
 * Each child has a rating.
 * Give candies to the children such that:
 * 1. Every child gets at least one candy.
 * 2. A child with a higher rating than an adjacent child
 *    gets more candies.
 *
 * Greedy Idea:
 * Handle the two constraints separately.
 * First make sure every child satisfies the left neighbor condition.
 * Then traverse from right to left to satisfy the right neighbor
 * condition.
 *
 * Approach:
 * 1. Give every child 1 candy.
 * 2. Traverse from left to right:
 *      - If ratings[i] > ratings[i - 1],
 *        give one more candy than the previous child.
 * 3. Traverse from right to left:
 *      - If ratings[i] > ratings[i + 1],
 *        give the maximum of the current candy count and
 *        one more than the right child's candies.
 * 4. Add all candy counts.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */

class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];

        for (int i = 0; i < n; i++) {
            candies[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        int total = 0;

        for (int candy : candies) {
            total += candy;
        }
        return total;
    }
}