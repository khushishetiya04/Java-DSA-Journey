/*
 * Topic: Backtracking Template
 *
 * Description:
 * Backtracking is a recursive technique used to
 * explore all possible solutions.
 *
 * Pattern:
 * 1. Choose
 * 2. Explore (Recursive Call)
 * 3. Backtrack (Undo the Choice)
 *
 * Time Complexity : Depends on the problem
 * Space Complexity: O(recursion depth)
 */

import java.util.*;
public class BacktrackingTemplate {
    public static void backtrack(List<Integer> current, int start, int n) {

        // Process the current solution
        System.out.println(current);

        // Try all possible choices
        for (int i = start; i <= n; i++) {

            // Choose
            current.add(i);

            // Explore
            backtrack(current, i + 1, n);

            // Backtrack (Undo the choice)
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        backtrack(new ArrayList<>(), 1, n);
    }
}