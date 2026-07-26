/*
 * Topic: Tiling Problem
 *
 * Description:
 * Given a floor of size 2 × n and tiles of size 2 × 1,
 * find the number of ways to tile the floor.
 *
 * A tile can be placed:
 * 1. Vertically
 * 2. Horizontally
 *
 * Recurrence Relation:
 * f(n) = f(n - 1) + f(n - 2)
 *
 * Explanation:
 * 1. Place one tile vertically:
 *      Remaining floor = 2 × (n - 1)
 *
 * 2. Place two tiles horizontally:
 *      Remaining floor = 2 × (n - 2)
 *
 * Base Cases:
 * f(0) = 1
 * f(1) = 1
 *
 * Time Complexity : O(2^n)
 * Space Complexity: O(n)
 */

public class TilingProblem {
    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        // Place tile vertically
        int vertical = tilingProblem(n - 1);

        // Place tiles horizontally
        int horizontal = tilingProblem(n - 2);

        return vertical + horizontal;
    }

    public static void main(String[] args) {
        int n = 4;

        System.out.println("Number of Ways: " + tilingProblem(n));
    }
}