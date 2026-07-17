# 📅 Day 08 - 2D Arrays

## 📌 Topics Covered

- Introduction to 2D Arrays
- Traversing a 2D Array
- Reverse Matrix
- Primary Diagonal
- Secondary Diagonal
- Matrix Transpose
- Matrix Rotation
- Spiral Traversal
- Searching in a 2D Matrix

---

# 📖 What is a 2D Array?

A **2D Array** (Matrix) is a collection of elements arranged in **rows and columns**.

Example:

```
1  2  3
4  5  6
7  8  9
```

It can be visualized as a table where each element is accessed using:

```
matrix[row][column]
```

---

# 🔹 Traversing a 2D Array

A matrix is usually traversed using **nested loops**.

- Outer loop → Rows
- Inner loop → Columns

---

# 🔹 Primary Diagonal

The **Primary Diagonal** consists of elements where:

```
row == column
```

Example:

```
1  2  3
4  5  6
7  8  9
```

Primary Diagonal:

```
1 5 9
```

Condition:

```
i == j
```

---

# 🔹 Secondary Diagonal

The **Secondary Diagonal** consists of elements where:

```
row + column == n - 1
```

Example:

```
1  2  3
4  5  6
7  8  9
```

Secondary Diagonal:

```
3 5 7
```

Condition:

```
i + j == n - 1
```

---

# 🔹 Matrix Transpose

Transpose converts:

```
Rows → Columns
Columns → Rows
```

Example:

Original Matrix

```
1 2 3
4 5 6
```

Transpose

```
1 4
2 5
3 6
```

---


# 💡 When to Use 2D Arrays?

Use 2D Arrays when dealing with:

- Matrices
- Grids
- Board games
- Images
- Dynamic Programming tables
- Graph representations
- Matrix transformations

---

# ⚙️ Complexity

| Operation          | Time              | Space 
|--------------------|-------------------|-----------
| Matrix Traversal   | **O(m × n)**      | **O(1)** 
| Diagonal Traversal | **O(n)**          | **O(1)** 
| Matrix Transpose   | **O(m × n)**      | **O(1)** *(Square Matrix)* 
| Rotate Matrix      | **O(n²)**         | **O(1)** 
| Spiral Traversal   | **O(m × n)**      | **O(1)** 
| Search 2D Matrix   | **O(log(m × n))** | **O(1)** 

---

# 💻 Practice Problems

- 2D Array Traversal
- Reverse Matrix
- Primary Diagonal
- Secondary Diagonal

---

# 🧩 LeetCode Problems

| Problem No. | Problem Name        | Pattern             | Difficulty 
|-------------|---------------------|---------------------|------------
| 0048        | Rotate Image        | Matrix Manipulation | Medium 
| 0054        | Spiral Matrix       | Boundary Traversal  | Medium 
| 0074        | Search a 2D Matrix  | Binary Search       | Medium
| 0867        | Transpose Matrix    | Matrix              | Easy 
| 1572        | Matrix Diagonal Sum | Matrix Traversal    | Easy 

---

# 🎯 Key Learnings

- Learned how 2D arrays are stored and traversed.
- Practiced row-wise and column-wise traversal.
- Understood Primary and Secondary Diagonal conditions.
- Learned Matrix Transpose.
- Solved Matrix Rotation using Transpose + Reverse.
- Implemented Spiral Matrix traversal.
- Applied Binary Search on a sorted matrix.

---

# 📈 Progress

## Basics (4)

- 2D Array Traversal
- Reverse Matrix
- Primary Diagonal
- Secondary Diagonal

## LeetCode Problems (5)

- 48. Rotate Image
- 54. Spiral Matrix
- 74. Search a 2D Matrix
- 867. Transpose Matrix
- 1572. Matrix Diagonal Sum

### ✅ Total Concepts & Problems Covered: **9**

---

# 🎉 Day 08 Summary

- Built a strong foundation in 2D Arrays.
- Learned matrix traversal techniques.
- Understood diagonal conditions.
- Practiced transpose and rotation of matrices.
- Solved spiral traversal and matrix search problems.
- Strengthened problem-solving skills for matrix-based interview questions.