/*
 * LeetCode: 950
 * Problem: Reveal Cards In Increasing Order
 * Difficulty: Medium
 *
 * Description:
 * Given an integer array deck, return an ordering
 * of the deck so that when the cards are revealed
 * using the given process, they appear in
 * increasing order.
 *
 * Reveal Process:
 * - Reveal the top card.
 * - Move the next top card to the bottom.
 * - Repeat until all cards are revealed.
 *
 * Approach:
 * - Sort the deck.
 * - Store all indices in a queue.
 * - Place the smallest card at the front index.
 * - Move the next index to the back.
 * - Repeat for all cards.
 *
 * Pattern:
 * Queue + Sorting
 *
 * Time Complexity : O(n log n)
 * Space Complexity: O(n)
 */

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        int n = deck.length;
        int[] ans = new int[n];
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(i);
        }
        for (int card : deck) {
            ans[queue.poll()] = card;

            if (!queue.isEmpty()) {
                queue.offer(queue.poll());
            }
        }
        return ans;
    }
}