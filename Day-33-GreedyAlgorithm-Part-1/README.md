# 📅 Day 33 - Greedy Algorithms Part 1

## 📌 Topics Covered

- Greedy Algorithm Basics
- Greedy Choice
- Activity Selection
- Fractional Knapsack
- Job Sequencing with Deadlines
- Minimum Number of Platforms
- Interval Scheduling
- Interval Overlap
- Interval Merging
- Sorting + Greedy
- Sorting + Two Pointers

---

# 📖 Concepts Covered

- Greedy Choice Principle
- Local Optimal Choice
- Global Optimal Solution
- Sorting for Greedy Problems
- Earliest Finish Time
- Value / Weight Ratio
- Maximum Profit + Deadline
- Arrival and Departure Scheduling
- Interval Overlap
- Interval Merging
- Interval Insertion
- Greedy + Sorting Pattern

---

# 💻 Basics

## 1. Activity Selection

### Problem
Given multiple activities with start and finish times, select the maximum number of non-overlapping activities.

### Approach
- Sort activities by finish time.
- Select the activity that finishes earliest.
- Select the next activity whose start time is greater than or equal to the finish time of the previously selected activity.

### Pattern
**Greedy + Earliest Finish Time**

### Time Complexity
`O(n log n)`

### Space Complexity
`O(n)`

---

## 2. Fractional Knapsack

### Problem
Given items with values and weights and a knapsack with limited capacity, maximize the total value. Fractions of items are allowed.

### Approach
- Calculate `value / weight` for every item.
- Sort items by decreasing ratio.
- Take the complete item if it fits.
- Otherwise, take the required fraction of the item.

### Pattern
**Greedy + Value / Weight Ratio**

### Time Complexity
`O(n log n)`

### Space Complexity
`O(n)`

---

## 3. Job Sequencing with Deadlines

### Problem
Given jobs with deadlines and profits, schedule jobs to maximize total profit. Each job takes one unit of time.

### Approach
- Sort jobs by decreasing profit.
- For each job, find the latest available slot before its deadline.
- Schedule the job if a slot is available.
- Add its profit to the total.

### Pattern
**Greedy + Maximum Profit + Deadline**

### Time Complexity
`O(n log n + n × d)`

### Space Complexity
`O(d)`

---

## 4. Minimum Number of Platforms

### Problem
Given arrival and departure times of trains, find the minimum number of platforms required so that no train waits.

### Approach
- Sort arrival times.
- Sort departure times.
- Use two pointers.
- If the next train arrives before the next departure, increase the platform count.
- Otherwise, decrease the platform count.
- Track the maximum platforms required.

### Pattern
**Greedy + Sorting + Two Pointers**

### Time Complexity
`O(n log n)`

### Space Complexity
`O(1)` apart from sorting.

---

# 🧩 LeetCode Problems

| Problem No. | Problem Name                               | Pattern            | Difficulty 
|-------------|--------------------------------------------|--------------------|-----------
| 0435        | Non-overlapping Intervals                  | Greedy + Intervals | Medium
| 0452        | Minimum Number of Arrows to Burst Balloons | Greedy + Intervals | Medium
| 0056        | Merge Intervals                            | Sorting + Intervals| Medium
| 0057        | Insert Interval                            | Intervals + Greedy | Medium

---

# 🔹 Time Complexity

| Algorithm / Problem         | Time Complexity 
|-----------------------------|-----------------
| Activity Selection          | O(n log n) 
| Fractional Knapsack         | O(n log n) 
| Job Sequencing              | O(n log n + n × d) 
| Minimum Number of Platforms | O(n log n) 
| Non-overlapping Intervals   | O(n log n) 
| Minimum Number of Arrows    | O(n log n) 
| Merge Intervals             | O(n log n) 
| Insert Interval             | O(n) 

---

# 🎯 Key Learnings

- Learned the Greedy Algorithm technique.
- Understood the Greedy Choice Principle.
- Learned how local optimal choices can lead to a global optimal solution.
- Learned Activity Selection using earliest finish time.
- Learned Fractional Knapsack using value-to-weight ratio.
- Learned Job Sequencing using maximum profit and deadlines.
- Learned Minimum Number of Platforms using arrival and departure times.
- Learned interval scheduling patterns.
- Learned interval overlap detection.
- Learned how to minimize overlapping intervals.
- Learned how to merge overlapping intervals.
- Learned how to insert and merge intervals.
- Learned sorting + greedy patterns.
- Learned sorting + two-pointer scheduling patterns.

---

# 📈 Progress

## Basics (4)

- Activity Selection
- Fractional Knapsack
- Job Sequencing
- Minimum Number of Platforms

## LeetCode Problems (4)

- 435. Non-overlapping Intervals
- 452. Minimum Number of Arrows to Burst Balloons
- 56. Merge Intervals
- 57. Insert Interval

### ✅ Total Concepts & Problems Covered: **8**

---

# 🎉 Day 33 Summary

- Built a strong foundation in Greedy Algorithms.
- Learned how to identify greedy-choice patterns.
- Mastered Activity Selection.
- Learned Fractional Knapsack using value-to-weight ratio.
- Learned Job Sequencing with Deadlines.
- Learned Minimum Number of Platforms.
- Practiced interval scheduling and overlap problems.
- Learned interval merging and insertion.
- Practiced sorting + greedy techniques.
- Practiced sorting + two-pointer techniques.
- Solved important greedy and interval-based interview problems.