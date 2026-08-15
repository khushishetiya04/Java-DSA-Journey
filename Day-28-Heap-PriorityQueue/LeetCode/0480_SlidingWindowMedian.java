/*
 * LeetCode: 480
 * Problem: Sliding Window Median
 * Difficulty: Hard
 *
 * Approach:
 * - Use two heaps:
 *
 *   maxHeap -> smaller half
 *   minHeap -> larger half
 *
 * - When the window moves, an element leaves the window.
 * - We cannot efficiently remove an arbitrary element from
 *   Java PriorityQueue.
 * - Therefore, use a HashMap for lazy deletion.
 *
 * Pattern:
 * Sliding Window + Two Heaps + Lazy Deletion
 *
 * Time Complexity : O(n log k)
 * Space Complexity: O(k)
 */

class Solution {
    PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>(Collections.reverseOrder());

    PriorityQueue<Integer> minHeap =
            new PriorityQueue<>();

    HashMap<Integer, Integer> delayed = new HashMap<>();

    int maxSize = 0;
    int minSize = 0;

    public double[] medianSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        double[] ans = new double[n - k + 1];

        for (int i = 0; i < k; i++) {
            add(nums[i]);
        }

        ans[0] = getMedian();

        for (int i = k; i < n; i++) {
            add(nums[i]);
            remove(nums[i - k]);
            ans[i - k + 1] = getMedian();
        }
        return ans;
    }

    private void add(int num) {
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.offer(num);
            maxSize++;
        } else {
            minHeap.offer(num);
            minSize++;
        }
        balance();
    }

    private void remove(int num) {
        delayed.put(num, delayed.getOrDefault(num, 0) + 1);

        if (!maxHeap.isEmpty() && num <= maxHeap.peek()) {
            maxSize--;
        } else {
            minSize--;
        }

        prune(maxHeap);
        prune(minHeap);

        balance();
    }

    private void balance() {
        if (maxSize > minSize + 1) {
            minHeap.offer(maxHeap.poll());
            maxSize--;
            minSize++;
            prune(maxHeap);

        } else if (maxSize < minSize) {
            maxHeap.offer(minHeap.poll());
            minSize--;
            maxSize++;
            prune(minHeap);
        }
    }

    private void prune(PriorityQueue<Integer> heap) {
        while (!heap.isEmpty()) {
            int num = heap.peek();

            if (!delayed.containsKey(num)) {
                break;
            }

            int count = delayed.get(num);

            if (count == 1) {
                delayed.remove(num);
            } else {
                delayed.put(num, count - 1);
            }

            heap.poll();
        }
    }

    private double getMedian() {

        if (maxSize > minSize) {
            return maxHeap.peek();
        }

        return ((double) maxHeap.peek()
                + (double) minHeap.peek()) / 2.0;
    }
}