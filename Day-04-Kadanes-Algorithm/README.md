# 📅 Day 04 - Kadane's Algorithm

## 📌 Topic Covered

- Introduction to Kadane's Algorithm
- Maximum Subarray Sum
- Brute Force vs Kadane's Algorithm
- Kadane's Algorithm Template
- Applications of Kadane's Algorithm

---

# 📖 What is Kadane's Algorithm?

**Kadane's Algorithm** is an efficient algorithm used to find the **maximum sum of a contiguous subarray** within a one-dimensional array.

Instead of checking all possible subarrays (which takes **O(n²)** time), Kadane's Algorithm solves the problem in **O(n)** by maintaining the maximum sum ending at the current index.

---

# 💡 Intuition

At every element, we have two choices:

1. Start a new subarray from the current element.
2. Extend the previous subarray by including the current element.

We always choose the option that gives the larger sum.

---

# 📝 Kadane's Algorithm Template

```java
int currentSum = nums[0];
int maxSum = nums[0];

for (int i = 1; i < nums.length; i++) {

    currentSum = Math.max(nums[i], currentSum + nums[i]);
    maxSum = Math.max(maxSum, currentSum);
}

return maxSum;
```

---

# ⚙️ Algorithm

1. Initialize:
   - `currentSum` = first element
   - `maxSum` = first element

2. Traverse the array.

3. For every element:
   - Either start a new subarray.
   - Or extend the previous one.

4. Update the maximum sum.

5. Return `maxSum`.

---

# 📊 Complexity Analysis

| Operation        | Complexity 
|------------------|------------
| Time Complexity  | O(n) 
| Space Complexity | O(1) 

---

# 💻 Practice Problems

| Problem              | Status 
|----------------------|--------
| Maximum Subarray Sum | ✅ 

---

# 🧩 LeetCode Problems

| Problem No. | Problem Name                  | Difficulty | Status 
|-------------|-------------------------------|------------|--------
|  0053       | Maximum Subarray              | Easy       | ✅ 
|  0918       | Maximum Sum Circular Subarray | Medium     | ✅

---

# 🎯 Key Learnings

- Learned Kadane's Algorithm for finding the maximum subarray sum.
- Understood how to optimize the brute-force approach from **O(n²)** to **O(n)**.
- Learned how to decide between extending the current subarray or starting a new one.
- Practiced solving maximum subarray problems efficiently using dynamic decision-making.

---

# 📈 Progress

## Practice Problems (2)

- Kadane's Algorithm

## LeetCode Problems

- 53. Maximum Subarray
- 918. Maximum Sum Circular Subarray 

### ✅ Total Problems Solved: **3**

---

# 🎉 Day 04 Summary

- Learned **Kadane's Algorithm**.
- Solved the classic **Maximum Subarray** problem.
- Reduced the brute-force approach from **O(n²)** to **O(n)**.
- Built a strong foundation for dynamic programming and array optimization problems.