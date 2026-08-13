/*
 * LeetCode: 295
 * Problem: Find Median from Data Stream
 * Difficulty: Hard
 *
 * Approach:
 * - Use TWO heaps.
 *
 * maxHeap → stores the smaller half
 * minHeap → stores the larger half
 *
 * Rules:
 * 1. maxHeap can have at most one extra element.
 * 2. Every element in maxHeap <= every element in minHeap.
 * 3. Keep both heaps balanced.
 *
 * Pattern:
 * Two Heaps
 *
 * Time Complexity:
 * addNum()    -> O(log n)
 * findMedian() -> O(1)
 *
 * Space Complexity: O(n)
 */

class MedianFinder {
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;

    public MedianFinder() {
        maxHeap = new PriorityQueue<>((a, b) -> b - a);
        minHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.offer(num);
        } else {
            minHeap.offer(num);
        }

        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.offer(maxHeap.poll());
        }

        if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {
        if (maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }
        return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }
}