/*
 * Practice: Fractional Knapsack
 *
 * Pattern: Greedy Algorithm
 *
 * Description:
 * Given items with weights and values and a knapsack capacity,
 * maximize the total value. We are allowed to take a fraction
 * of an item.
 *
 * Greedy Idea:
 * Always choose the item with the highest value-to-weight ratio.
 *
 * Approach:
 * 1. Calculate value / weight for every item.
 * 2. Sort items in descending order of value-to-weight ratio.
 * 3. Take the complete item if it fits.
 * 4. Otherwise, take the required fraction of the item.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

import java.util.*;
public class FractionalKnapsack {
    static class Item {
        int value;
        int weight;
        double ratio;

        Item(int value, int weight) {
            this.value = value;
            this.weight = weight;
            this.ratio = (double) value / weight;
        }
    }

    public static double fractionalKnapsack(Item[] items, int capacity) {
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
        double totalValue = 0;

        for (Item item : items) {
            if (capacity >= item.weight) {
                totalValue += item.value;
                capacity -= item.weight;
            } else {
                totalValue += item.ratio * capacity;
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        Item[] items = {
            new Item(60, 10),
            new Item(100, 20),
            new Item(120, 30)
        };

        int capacity = 50;
        double result = fractionalKnapsack(items, capacity);

        System.out.println("Maximum Value: " + result);
    }
}