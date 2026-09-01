/*
 * LeetCode: 253. Meeting Rooms II
 *
 * Pattern: Greedy Algorithm + Sorting + Min Heap
 *
 * Description:
 * Given the start and end times of meetings, find the minimum number
 * of conference rooms required so that no meeting overlaps.
 *
 * Greedy Idea:
 * Always reuse the room whose meeting finishes earliest.
 * If the earliest ending meeting is still running, a new room is needed.
 *
 * Approach:
 * 1. Sort all meetings by their start time.
 * 2. Store meeting end times in a Min Heap.
 * 3. For every meeting:
 *      - If the earliest ending meeting ends before or when the
 *        current meeting starts, reuse that room.
 *      - Otherwise, allocate a new room.
 * 4. The size of the Min Heap gives the number of rooms currently in use.
 * 5. Track the maximum heap size.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

class Solution {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int maxRooms = 0;

        for (int[] interval : intervals) {
            if (!pq.isEmpty() && pq.peek() <= interval[0]) {
                pq.poll();
            }

            pq.add(interval[1]);
            maxRooms = Math.max(maxRooms, pq.size());
        }
        return maxRooms;
    }
}