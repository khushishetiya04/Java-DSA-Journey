/*
 * Practice: Activity Selection
 *
 * Pattern: Greedy Algorithm
 *
 * Description:
 * Given start and finish times of activities, select the maximum
 * number of non-overlapping activities that can be performed.
 *
 * Greedy Idea:
 * Always select the activity that finishes earliest.
 * This leaves maximum time for the remaining activities.
 *
 * Approach:
 * 1. Store start and finish time together.
 * 2. Sort activities by finish time.
 * 3. Select the first activity.
 * 4. For every next activity:
 *      - If its start time >= last selected finish time,
 *        select it.
 * 5. Return the selected activities.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(n)
 */

import java.util.*;
public class ActivitySelection {
    static class Activity {
        int start;
        int finish;

        Activity(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }
    }

    public static List<Activity> activitySelection(Activity[] activities) {
        Arrays.sort(activities, Comparator.comparingInt(a -> a.finish));
        List<Activity> selected = new ArrayList<>();

        if (activities.length == 0) {
            return selected;
        }

        selected.add(activities[0]);
        int lastFinish = activities[0].finish;

        for (int i = 1; i < activities.length; i++) {
            if (activities[i].start >= lastFinish) {
                selected.add(activities[i]);
                lastFinish = activities[i].finish;
            }
        }
        return selected;
    }

    public static void main(String[] args) {
        Activity[] activities = {
            new Activity(1, 2),
            new Activity(3, 4),
            new Activity(0, 6),
            new Activity(5, 7),
            new Activity(8, 9),
            new Activity(5, 9)
        };

        List<Activity> result = activitySelection(activities);

        System.out.println("Selected Activities:");

        for (Activity activity : result) {
            System.out.println(
                "(" + activity.start + ", " + activity.finish + ")"
            );
        }

        System.out.println("Maximum Activities: " + result.size());
    }
}