# 📅 Day 05 - Prefix Sum

## 📌 Topic Covered

- Introduction to Prefix Sum
- Building a Prefix Sum Array
- Range Sum Queries
- Running Prefix Sum
- Applications of Prefix Sum

---

# 📖 What is Prefix Sum?

**Prefix Sum** is a technique used to efficiently calculate the sum of elements within a range of an array.

Instead of calculating the sum for every query repeatedly, we preprocess the array to create a Prefix Sum Array.

Each element stores the sum of all previous elements including itself.

---

# 💡 Intuition

For an array:

```
nums = [2, 4, 6, 8, 10]
```

Prefix Sum Array:

```
prefix = [2, 6, 12, 20, 30]
```

Now,

```
Sum(1...3)

= prefix[3] - prefix[0]

= 20 - 2

= 18
```

Instead of traversing the array every time, we answer range sum queries in **O(1)**.

---

# 📝 Prefix Sum Template

```java
int[] prefix = new int[nums.length];

prefix[0] = nums[0];

for (int i = 1; i < nums.length; i++) {
    prefix[i] = prefix[i - 1] + nums[i];
}
```

---

# 📌 Range Sum Formula

For any range **left...right**:

```text
If left == 0

Sum = prefix[right]

Otherwise

Sum = prefix[right] - prefix[left - 1]
```

---

# ⚙️ Algorithm

1. Create a Prefix Sum array.
2. Store cumulative sums.
3. Use the Prefix Sum array to answer range queries efficiently.

---

# 📊 Complexity Analysis

| Operation           | Complexity 
|---------------------|-----------
| Building Prefix Sum | **O(n)** 
| Range Sum Query     | **O(1)** 
| Extra Space         | **O(n)** 

---

# 💻 Practice Problems

| Problem                   | Status 
|---------------------------|--------
| Prefix Sum Implementation | ✅ 

---

# 🧩 LeetCode Problems

| Problem No. | Problem Name                         | Difficulty | Status 
|-------------|--------------------------------------|------------|--------
| 0303        | Range Sum Query – Immutable          | Easy       | ✅ 
| 0724        | Find Pivot Index                     | Easy       | ✅ 
| 1480        | Running Sum of 1D Array              | Easy       | ✅
| 1732        | Find the Highest Altitude            | Easy       | ✅ 
| 2389        | Longest Subsequence With Limited Sum | Easy       | ✅ 

---

# 🔄 Revision

- Revised **LeetCode 1480 - Running Sum of 1D Array** as a basic Prefix Sum problem.

---

# 🎯 Key Learnings

- Learned how to build a Prefix Sum array.
- Understood how Prefix Sum optimizes range sum queries.
- Practiced Running Prefix Sum.
- Solved problems involving Prefix Sum and Binary Search.
- Improved understanding of cumulative sum techniques.

---

# 📈 Progress

## Practice Problems (1)

- Prefix Sum Implementation

## LeetCode Problems (5)

- 303. Range Sum Query – Immutable
- 724. Find Pivot Index
- 1480. Running Sum of 1D Array
- 1732. Find the Highest Altitude
- 2389. Longest Subsequence With Limited Sum

### ✅ Total Problems Solved: **6**

---

# 🎉 Day 05 Summary

- Learned the Prefix Sum technique.
- Built Prefix Sum arrays.
- Solved range sum problems efficiently.
- Applied Prefix Sum to array optimization problems.
- Explored Prefix Sum combined with Binary Search.