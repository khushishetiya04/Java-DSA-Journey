# 📅 Day 31 - Graphs Part 2

## 📌 Topics Covered

- DFS Traversal
- BFS Traversal
- Graph Traversal
- Visited Array
- Recursive DFS
- Iterative BFS
- Path Finding
- Cycle Detection in Directed Graph
- Cycle Detection in Undirected Graph using BFS
- Connected Components
- Grid Traversal
- Multi-Source BFS
- Shortest Path using BFS
- Bipartite Graph
- Graph Cloning
- DFS / BFS on Matrix

---

# 📖 Concepts Covered

- Understanding how to traverse all vertices of a graph.
- Implementing Depth First Search (DFS).
- Implementing Breadth First Search (BFS).
- Understanding the role of the visited array.
- Finding whether a path exists between two vertices.
- Detecting cycles in directed graphs using DFS.
- Detecting cycles in undirected graphs using BFS.
- Counting connected components in an undirected graph.
- Applying DFS and BFS to grid-based problems.
- Understanding multi-source BFS.
- Finding shortest paths in an unweighted graph.
- Checking whether a graph is bipartite.
- Cloning a graph using DFS/BFS.
- Finding all possible paths using DFS and backtracking.

---

# 💻 Basics

- DFS Traversal
- BFS Traversal
- Has Path
- Cycle Detection in Directed Graph
- Cycle Detection in Undirected Graph using BFS
- Count Connected Components

---

# 🧩 LeetCode / Interview Problems

| Problem No. | Problem Name                    | Pattern              | Difficulty 
| ----------- | --------------------------------| ---------------------|-----------
| 0733        | Flood Fill                      | DFS / BFS            | Easy 
| 0200        | Number of Islands               | Grid DFS / BFS       | Medium 
| 0994        | Rotting Oranges                 | Multi-Source BFS     | Medium 
| 0542        | 01 Matrix                       | Multi-Source BFS     | Medium 
| 1091        | Shortest Path in Binary Matrix  | BFS / Shortest Path  | Medium 
| 0127        | Word Ladder                     | BFS / Shortest Path  | Hard 
| 0130        | Surrounded Regions              | DFS / BFS            | Medium 
| 0785        | Is Graph Bipartite?             | BFS / DFS + Coloring | Medium 
| 0133        | Clone Graph                     | DFS / BFS + HashMap  | Medium 
| 0797        | All Paths From Source to Target | DFS + Backtracking   | Medium 
| 0547        | Number of Provinces             | DFS / BFS            | Medium 
       
---

# 🔹 DFS vs BFS

| Feature        | DFS                                  | BFS 
|----------------| ------------------------------------ | ----------------------
| Data Structure | Stack / Recursion                    | Queue 
| Traversal      | Depth First                          | Level by Level 
| Shortest Path  | Not Guaranteed                       | In Unweighted Graph 
| Common Use     | Cycle Detection, Paths, Backtracking | Shortest Path, Levels 
| Space          | O(V)                                 | O(V) 

> `V` = number of vertices and `E` = number of edges.

---

# 🔹 Graph Traversal Complexity

| Operation | Time | Space |
| --------- | ---- | ----- |
| DFS | O(V + E) | O(V) |
| BFS | O(V + E) | O(V) |
| Connected Components | O(V + E) | O(V) |
| Cycle Detection | O(V + E) | O(V) |

---

# 🔹 Grid Traversal Complexity

For an `m × n` grid:

| Operation        | Time     | Space 
|------------------|----------|----------
| DFS              | O(m × n) | O(m × n) 
| BFS              | O(m × n) | O(m × n) 
| Multi-Source BFS | O(m × n) | O(m × n) 

---

# 🎯 Key Learnings

- Learned how to traverse graphs using DFS.
- Learned how to traverse graphs using BFS.
- Understood the importance of the visited array.
- Learned recursive DFS and queue-based BFS.
- Learned how to determine whether a path exists.
- Learned cycle detection in directed graphs.
- Learned cycle detection in undirected graphs using BFS.
- Learned how to count connected components.
- Applied DFS/BFS to matrix and grid problems.
- Learned multi-source BFS.
- Learned shortest path using BFS in unweighted graphs.
- Learned graph coloring for bipartite graphs.
- Learned graph cloning using DFS/BFS.
- Learned DFS with backtracking for finding all paths.

---

# 🔥 Important Patterns

- **DFS Traversal Pattern** → Recursively explore neighbors while maintaining a visited array.
- **BFS Traversal Pattern** → Use a queue to process vertices level by level.
- **Visited Array Pattern** → Prevent revisiting vertices and infinite traversal.
- **Cycle Detection Pattern** → Track visited/state information to identify cycles.
- **Connected Components Pattern** → Start DFS/BFS from every unvisited vertex.
- **Grid DFS/BFS Pattern** → Treat valid neighboring cells as graph edges.
- **Multi-Source BFS Pattern** → Add all initial sources to the queue before starting BFS.
- **Shortest Path BFS Pattern** → BFS guarantees the shortest distance in an unweighted graph.
- **Bipartite Coloring Pattern** → Assign alternating colors to adjacent vertices.
- **DFS + Backtracking Pattern** → Explore every possible path and backtrack after processing.

---

# 📈 Progress

## Basics (6)

- DFS Traversal
- BFS Traversal
- Has Path
- Cycle Detection in Directed Graph
- Cycle Detection in Undirected Graph using BFS
- Count Connected Components

## LeetCode / Interview Problems (11)

- 733. Flood Fill
- 200. Number of Islands
- 994. Rotting Oranges
- 542. 01 Matrix
- 1091. Shortest Path in Binary Matrix
- 127. Word Ladder
- 130. Surrounded Regions
- 785. Is Graph Bipartite?
- 133. Clone Graph
- 797. All Paths From Source to Target
- 547. Number of Provinces

### ✅ Total Concepts & Problems Covered: **17**

---

# 🎉 Day 31 Summary

- Learned **DFS and BFS graph traversal**.
- Understood visited arrays and traversal patterns.
- Implemented path finding and cycle detection.
- Learned how to count connected components.
- Applied BFS/DFS to grid problems.
- Learned multi-source BFS and shortest path BFS.
- Practiced bipartite graph detection and graph cloning.
- Learned DFS backtracking for finding all paths.
- Solved **11 graph traversal LeetCode problems**.
- Built a strong foundation for advanced graph algorithms.

---
