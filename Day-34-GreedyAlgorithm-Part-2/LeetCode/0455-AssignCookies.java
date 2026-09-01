/*
 * LeetCode: 455. Assign Cookies
 *
 * Pattern: Greedy Algorithm + Sorting + Two Pointers
 *
 * Description:
 * Given an array of children's greed factors and an array of cookie
 * sizes, assign cookies to maximize the number of content children.
 *
 * A child is content if the size of the assigned cookie is greater
 * than or equal to the child's greed factor.
 *
 * Greedy Idea:
 * Always try to satisfy the least greedy child with the smallest
 * cookie that can satisfy them.
 *
 * Approach:
 * 1. Sort the greed factors.
 * 2. Sort the cookie sizes.
 * 3. Use two pointers:
 *      - One for children.
 *      - One for cookies.
 * 4. If the current cookie can satisfy the current child:
 *      - Assign the cookie.
 *      - Move to the next child.
 * 5. Otherwise, use a larger cookie.
 * 6. Return the number of satisfied children.
 *
 * Time Complexity: O(n log n + m log m)
 * Space Complexity: O(1) apart from sorting.
 */

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int child = 0;
        int cookie = 0;

        while (child < g.length && cookie < s.length) {
            if (s[cookie] >= g[child]) {
                child++;
            }
            cookie++;
        }
        return child;
    }
}