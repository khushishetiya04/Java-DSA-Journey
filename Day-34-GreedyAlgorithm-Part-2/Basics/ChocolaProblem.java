/*
 * Practice: Chocola Problem
 *
 * Pattern: Greedy Algorithm + Sorting
 *
 * Description:
 * Given a chocolate of size n x m and the costs of making horizontal
 * and vertical cuts, find the minimum total cost required to divide
 * the chocolate into 1 x 1 pieces.
 *
 * Greedy Idea:
 * Always make the most expensive cut first.
 * A cut in one direction affects the number of pieces in the
 * other direction, so making the higher-cost cut first minimizes
 * the total cost.
 *
 * Approach:
 * 1. Sort horizontal and vertical cut costs in decreasing order.
 * 2. Maintain the number of horizontal and vertical pieces.
 * 3. Compare the next horizontal and vertical cut costs.
 * 4. Choose the larger cost first.
 * 5. Multiply the chosen cut cost by the number of pieces in the
 *    opposite direction.
 * 6. Increase the number of pieces in the direction of the cut.
 * 7. Add all remaining cuts after one list is exhausted.
 *
 * Time Complexity: O(n log n + m log m)
 * Space Complexity: O(1) apart from sorting.
 */

import java.util.*;
public class Chocola {
    public static int minCost(Integer[] costVer, Integer[] costHor) {
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int verticalPieces = 1;
        int horizontalPieces = 1;
        int i = 0;
        int j = 0;
        int totalCost = 0;

        while (i < costVer.length && j < costHor.length) {
            if (costVer[i] >= costHor[j]) {
                totalCost += costVer[i] * horizontalPieces;
                verticalPieces++;
                i++;

            } else {
                totalCost += costHor[j] * verticalPieces;
                horizontalPieces++;
                j++;
            }
        }

        while (i < costVer.length) {
            totalCost += costVer[i] * horizontalPieces;
            i++;
        }

        while (j < costHor.length) {
            totalCost += costHor[j] * verticalPieces;
            j++;
        }
        return totalCost;
    }

    public static void main(String[] args) {
        Integer[] costVer = {2, 1, 3, 1, 4};
        Integer[] costHor = {4, 1, 2};

        System.out.println("Minimum Cost: " + minCost(costVer, costHor));
    }
}