# 📅 Day 07 - Binary Search

## 📌 Topics Covered

- Binary Search
- Binary Search on Descending Array
- Count Comparisons
- Find Floor
- Find Ceil
- Lower Bound
- Upper Bound
- First Occurrence
- Last Occurrence
- Count Occurrences

---

# 📖 What is Binary Search?

**Binary Search** is an efficient searching algorithm used on **sorted arrays**.

Instead of checking every element one by one, Binary Search repeatedly divides the search space into two halves.

- If the middle element equals the target → return its index.
- If the middle element is greater than the target → search the left half.
- If the middle element is smaller than the target → search the right half.

---

# 🔹 Descending Binary Search

Binary Search can also be applied to arrays sorted in **descending order**.

The comparison conditions are reversed compared to an ascending array.

---

# 🔹 Lower Bound

The **Lower Bound** is the first index where:

```
arr[index] >= target
```

---

# 🔹 Upper Bound

The **Upper Bound** is the first index where:

```
arr[index] > target
```

---

# 🔹 Floor

The **Floor** of a target is the **greatest element less than or equal to the target**.

---

# 🔹 Ceil

The **Ceil** of a target is the **smallest element greater than or equal to the target**.

---

# 🔹 First Occurrence

Find the first occurrence of a target element in a sorted array containing duplicates.

---

# 🔹 Last Occurrence

Find the last occurrence of a target element in a sorted array containing duplicates.

---

# 🔹 Count Occurrences

The number of occurrences of an element can be calculated as:

```
Count = Last Occurrence - First Occurrence + 1
```

---

# 💡 When to Use Binary Search?

Use Binary Search when:

- The array is sorted.
- The search space can be divided into two halves.
- Searching for an element efficiently.
- Finding First or Last Occurrence.
- Finding Lower Bound or Upper Bound.
- Finding Floor or Ceil.
- Solving Binary Search on Answer problems.

---

# ⚙️ Complexity

| Operation               | Time         | Space    |
|-------------------------|--------------|----------|
| Binary Search           | **O(log n)** | **O(1)** |
| Lower / Upper Bound     | **O(log n)** | **O(1)** |
| Floor / Ceil            | **O(log n)** | **O(1)** |
| First / Last Occurrence | **O(log n)** | **O(1)** |
| Count Occurrences       | **O(log n)** | **O(1)** |

---

# 💻 Practice Problems

- Binary Search
- Descending Binary Search
- Count Comparisons
- Find Floor
- Find Ceil
- Lower Bound
- Upper Bound
- First Occurrence
- Last Occurrence
- Count Occurrences

---

# 🧩 LeetCode Problems

| Problem No. | Problem Name | Pattern | Difficulty |
|-------------|--------------|----------|------------|
| 0035        | Search Insert Position | Binary Search | Easy |
| 0069        | Sqrt(x) | Binary Search on Answer | Easy |
| 0374        | Guess Number Higher or Lower             | Binary Search | Easy |
| 0704        | Binary Search                            | Binary Search | Easy |
| 0744        | Find Smallest Letter Greater Than Target | Upper Bound | Easy |

---

# 🎯 Key Learnings

- Understood the Binary Search algorithm.
- Learned Binary Search on ascending and descending arrays.
- Implemented Floor and Ceil.
- Learned Lower Bound and Upper Bound.
- Solved First and Last Occurrence problems.
- Calculated Count Occurrences using Binary Search.
- Applied Binary Search to different interview problems.

---

# 📈 Progress

## Practice Problems (10)

- Binary Search
- Descending Binary Search
- Count Comparisons
- Floor
- Ceil
- Lower Bound
- Upper Bound
- First Occurrence
- Last Occurrence
- Count Occurrences

## LeetCode Problems (5)

- 35. Search Insert Position
- 69. Sqrt(x)
- 374. Guess Number Higher or Lower
- 704. Binary Search
- 744. Find Smallest Letter Greater Than Target

### ✅ Total Concepts & Problems Covered: **15**

---

# 🎉 Day 07 Summary

- Learned the Binary Search algorithm and its common variations.
- Practiced searching in both ascending and descending arrays.
- Implemented Lower Bound, Upper Bound, Floor, and Ceil.
- Solved occurrence-based Binary Search problems.
- Built a strong foundation for advanced Binary Search techniques used in coding interviews.