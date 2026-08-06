/*
 * LeetCode: 933
 * Problem: Number of Recent Calls
 * Difficulty: Easy
 *
 * Description:
 * Implement a RecentCounter class that counts
 * the number of recent requests in the last
 * 3000 milliseconds.
 *
 * Return the number of requests in the range
 * [t - 3000, t].
 *
 * Approach:
 * - Store request times in a queue.
 * - Add each new request.
 * - Remove requests older than (t - 3000).
 * - Queue size represents the answer.
 *
 * Pattern:
 * Queue
 *
 * Time Complexity : O(1) Amortized
 * Space Complexity: O(n)
 */

class RecentCounter {
    private Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.offer(t);

        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}

/*
 * Your RecentCounter object will be instantiated and called as such:
 *
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */