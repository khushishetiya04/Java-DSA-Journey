/*
 * LeetCode: 118
 * Problem: Pascal's Triangle
 * Difficulty: Easy
 *
 * Description:
 * Given an integer numRows, return the first
 * numRows of Pascal's Triangle.
 *
 * Each number is the sum of the two numbers
 * directly above it.
 *
 * Approach:
 * - Every row starts with 1.
 * - Middle elements are obtained by adding
 *   the two elements from the previous row.
 * - Every row except the first ends with 1.
 *
 * Pattern:
 * ArrayList
 *
 * Time Complexity : O(n²)
 * Space Complexity: O(n²)
 */

import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            // First element
            row.add(1);

            // Middle elements
            for (int j = 1; j < i; j++) {
                row.add(triangle.get(i - 1).get(j - 1)
                        + triangle.get(i - 1).get(j));
            }

            // Last element
            if (i > 0) {
                row.add(1);
            }
            triangle.add(row);
        }
        return triangle;
    }
}