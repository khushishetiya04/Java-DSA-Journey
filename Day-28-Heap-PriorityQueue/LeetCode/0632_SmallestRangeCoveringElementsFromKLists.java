/*
 * LeetCode: 632
 * Problem: Smallest Range Covering Elements from K Lists
 * Difficulty: Hard
 *
 * Approach:
 * - Each list is sorted.
 * - Put the first element of every list into a Min Heap.
 * - The heap gives us the current minimum.
 * - Keep track of the current maximum.
 * - The current range is [minimum, maximum].
 * - To improve the range, remove the minimum element and
 *   add the next element from the same list.
 * - Stop when one list has no more elements.
 *
 * Pattern:
 * K Sorted Lists + Min Heap + Sliding Range
 *
 * Time Complexity : O(N log k)
 * Space Complexity: O(k)
 */

class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {

        PriorityQueue<Node> pq =
                new PriorityQueue<>(
                    (a, b) -> Integer.compare(a.value, b.value)
                );

        int currentMax = Integer.MIN_VALUE;

        for (int i = 0; i < nums.size(); i++) {
            int value = nums.get(i).get(0);
            pq.offer(new Node(value, i, 0));
            currentMax = Math.max(currentMax, value);
        }

        int bestStart = pq.peek().value;
        int bestEnd = currentMax;

        while (true) {
            Node current = pq.poll();
            int currentMin = current.value;

            if (currentMax - currentMin
                    < bestEnd - bestStart) {

                bestStart = currentMin;
                bestEnd = currentMax;

            } else if (currentMax - currentMin
                    == bestEnd - bestStart
                    && currentMin < bestStart) {

                bestStart = currentMin;
                bestEnd = currentMax;
            }

            int nextIndex = current.index + 1;

            if (nextIndex >= nums.get(current.list).size()) {
                break;
            }

            int nextValue =
                    nums.get(current.list).get(nextIndex);

            pq.offer(
                new Node(
                    nextValue,
                    current.list,
                    nextIndex
                )
            );

            currentMax = Math.max(currentMax, nextValue);
        }
        return new int[]{bestStart, bestEnd};
    }

    static class Node {
        int value;
        int list;
        int index;

        Node(int value, int list, int index) {
            this.value = value;
            this.list = list;
            this.index = index;
        }
    }
}