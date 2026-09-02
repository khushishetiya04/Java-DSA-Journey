/*
 * Practice: Indian Coins
 *
 * Pattern: Greedy Algorithm
 *
 * Description:
 * Given an amount, find the minimum number of Indian coins/notes
 * required to make that amount.
 *
 * Greedy Idea:
 * Always choose the largest denomination that is less than or equal
 * to the remaining amount.
 *
 * Approach:
 * 1. Store Indian denominations in increasing order.
 * 2. Traverse them from largest to smallest using a for loop.
 * 3. While the current coin can be used, subtract it from the amount
 *    and increase the coin count.
 * 4. Continue until the amount becomes 0.
 *
 * Time Complexity: O(n + number of coins used)
 * Space Complexity: O(1)
 */

public class IndianCoins {
    public static int minCoins(int amount) {
        Integer[] coins = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int count = 0;

        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int amount = 590;
        System.out.println("Minimum Coins: " + minCoins(amount));
    }
}