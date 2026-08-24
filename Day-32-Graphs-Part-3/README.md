# 📅 Day 32 - Advanced Graphs

## 📌 Topics Covered

- Topological Sort
- Kahn's Algorithm
- DFS Topological Sort
- Dijkstra's Algorithm
- Minimum Cost Path in Grid
- Bellman-Ford Algorithm
- Floyd-Warshall Algorithm
- Minimum Spanning Tree
- Prim's Algorithm
- Kruskal's Algorithm
- Disjoint Set Union (DSU)
- Kosaraju's Algorithm
- Tarjan's Algorithm
- Strongly Connected Components
- Bridges in Undirected Graph
- Articulation Points

---

# 📖 Concepts Covered

- Understanding Directed Acyclic Graphs (DAG).
- Topological ordering of a directed graph.
- Topological Sort using Kahn's BFS approach.
- Topological Sort using DFS.
- Detecting cycles using Topological Sort.
- Finding shortest paths using Dijkstra.
- Finding minimum-cost paths in weighted grids.
- Finding shortest paths with negative edge weights using Bellman-Ford.
- Detecting negative weight cycles.
- Finding all-pairs shortest paths using Floyd-Warshall.
- Understanding Minimum Spanning Trees.
- Implementing Prim's Algorithm.
- Implementing Kruskal's Algorithm.
- Understanding Disjoint Set Union.
- Union and Find operations.
- Path compression.
- Union by rank / size.
- Finding Strongly Connected Components.
- Kosaraju's Algorithm.
- Tarjan's Algorithm.
- Finding bridges in an undirected graph.
- Finding articulation points.

---

# 💻 Basics

- Topological Sort
- Kahn's Algorithm
- DFS Topological Sort
- Dijkstra's Algorithm
- Minimum Cost Path
- Prim's Algorithm
- Kruskal's Algorithm
- DSU
- Bellman-Ford Algorithm
- Floyd-Warshall Algorithm
- Kosaraju's Algorithm
- Tarjan's Algorithm
- Bridge Algorithm
- Articulation Point Algorithm

---

# 🧩 LeetCode / Interview Problems

| Problem No. | Problem Name | Pattern | Difficulty |
| ----------- | ---------------------------------------------|----------------------------------|---------- 
| 0207        | Course Schedule                              | Topological Sort / Kahn's        | Medium 
| 0210        | Course Schedule II                           | Topological Sort                 | Medium 
| 0802        | Find Eventual Safe States                    | DFS / Topological Sort           | Medium 
| 0310        | Minimum Height Trees                         | Topological Sort / Leaf Trimming | Medium 
| 1203        | Sort Items by Groups Respecting Dependencies | Topological Sort                 | Hard 
| 0269        | Alien Dictionary                             | Topological Sort                 | Hard 
| 0743        | Network Delay Time                           | Dijkstra                         | Medium 
| 0787        | Cheapest Flights Within K Stops              | Shortest Path                    | Medium 
| 0778        | Swim in Rising Water                         | Dijkstra / BFS                   | Hard 
| 1631        | Path With Minimum Effort                     | Dijkstra / Binary Search         | Medium 
| 1584        | Min Cost to Connect All Points               | MST / Prim / Kruskal             | Medium 
| 1135        | Connecting Cities With Minimum Cost          | MST / Kruskal                    | Medium 
| 0684        | Redundant Connection                         | DSU                              | Medium  
| 0547        | Number of Provinces                          | DSU                              | Medium  
| 0721        | Accounts Merge                               | DSU                              | Medium  
| 1334        | Find the City With the Smallest Number of Neighbors at a Threshold Distance     | Floyd-Warshall | Medium 
| 1192        | Critical Connections in a Network            | Tarjan / Bridges                 | Hard 

---

# 🔹 Topological Sort

| Algorithm | Time Complexity | Space Complexity |
| --------- | --------------- | ---------------- |
| Kahn's Algorithm | O(V + E) | O(V) |
| DFS Topological Sort | O(V + E) | O(V) |

### Important Concepts

- DAG
- Indegree
- Queue
- DFS
- Cycle Detection
- Dependency Ordering

---

# 🔹 Shortest Path Algorithms

| Algorithm | Use Case | Time Complexity |
| --------- | -------- | --------------- |
| Dijkstra | Non-negative weighted edges | O((V + E) log V) |
| Bellman-Ford | Negative edges | O(V × E) |
| Floyd-Warshall | All-pairs shortest path | O(V³) |

### Important Concepts

- Relaxation
- Distance Array
- Priority Queue
- Negative Edge
- Negative Cycle
- All-Pairs Shortest Path

---

# 🔹 Minimum Spanning Tree

| Algorithm | Time Complexity | Main Technique |
| --------- | --------------- | -------------- |
| Prim's | O(E log V) | Min Heap |
| Kruskal's | O(E log E) | Sorting + DSU |

### Important Concepts

- Minimum Spanning Tree
- Minimum Edge Selection
- Cycle Prevention
- Priority Queue
- Sorting
- DSU

---

# 🔹 Disjoint Set Union

| Operation | Complexity |
| --------- | ---------- |
| Find | O(α(V)) amortized |
| Union | O(α(V)) amortized |

### Optimizations

- Path Compression
- Union by Rank
- Union by Size

---

# 🔹 Strongly Connected Components

### Kosaraju's Algorithm

1. Perform DFS and store nodes according to finishing time.
2. Reverse all graph edges.
3. Process vertices in reverse finishing order.
4. Each DFS gives one Strongly Connected Component.

**Time Complexity:** O(V + E)

### Tarjan's Algorithm

- Uses DFS.
- Maintains discovery time.
- Maintains low-link value.
- Uses a stack to identify SCCs.

**Time Complexity:** O(V + E)

---

# 🔹 Bridges & Articulation Points

### Bridge

An edge whose removal increases the number of connected components.

### Articulation Point

A vertex whose removal increases the number of connected components.

### Core Concepts

- Discovery Time
- Low Value
- DFS Tree
- Back Edge
- Tarjan's Algorithm

**Time Complexity:** O(V + E)

---

# 🎯 Key Learnings

- Mastered Topological Sort using BFS and DFS.
- Learned Kahn's Algorithm.
- Learned dependency-based graph problems.
- Mastered Dijkstra's shortest path algorithm.
- Learned shortest paths with negative edges using Bellman-Ford.
- Learned all-pairs shortest paths using Floyd-Warshall.
- Learned Minimum Spanning Trees.
- Implemented Prim's and Kruskal's algorithms.
- Mastered DSU with path compression and union optimization.
- Learned Strongly Connected Components.
- Learned Kosaraju's and Tarjan's algorithms.
- Learned how to find bridges and articulation points.
- Practiced advanced graph problems across Medium and Hard difficulty.

---

# 🔥 Important Patterns

- **Topological Sort** → Used for dependency ordering in DAGs.
- **Kahn's Algorithm** → BFS + indegree for topological ordering.
- **DFS Topological Sort** → DFS + postorder stack.
- **Dijkstra** → Shortest path with non-negative edge weights.
- **Bellman-Ford** → Shortest path with negative edges.
- **Floyd-Warshall** → All-pairs shortest path.
- **Prim's** → MST using a Min Heap.
- **Kruskal's** → MST using sorting + DSU.
- **DSU** → Dynamic connectivity and cycle detection.
- **Kosaraju** → SCC using two DFS passes.
- **Tarjan** → SCC / bridges / articulation points using discovery and low values.
- **Bridge Detection** → Find critical edges in an undirected graph.
- **Articulation Point** → Find critical vertices in an undirected graph.

---

# 📈 Progress

## Algorithms Covered (14)

- Topological Sort
- Kahn's Algorithm
- DFS Topological Sort
- Dijkstra
- Minimum Cost Path
- Prim's Algorithm
- Kruskal's Algorithm
- DSU
- Bellman-Ford
- Floyd-Warshall
- Kosaraju's Algorithm
- Tarjan's Algorithm
- Bridges
- Articulation Points

## LeetCode / Interview Problems (17)

- 207. Course Schedule
- 210. Course Schedule II
- 802. Find Eventual Safe States
- 310. Minimum Height Trees
- 1203. Sort Items by Groups Respecting Dependencies
- 269. Alien Dictionary
- 743. Network Delay Time
- 787. Cheapest Flights Within K Stops
- 778. Swim in Rising Water
- 1631. Path With Minimum Effort
- 1584. Min Cost to Connect All Points
- 1135. Connecting Cities With Minimum Cost
- 684. Redundant Connection
- 547. Number of Provinces
- 721. Accounts Merge
- 1334. Find the City With the Smallest Number of Neighbors at a Threshold Distance
- 1192. Critical Connections in a Network

### ✅ Total Algorithms & Problems Covered: **31**

---

# 🎉 Day 32 Summary

- Learned advanced graph algorithms and their real interview patterns.
- Mastered Topological Sort and dependency graphs.
- Mastered shortest path algorithms.
- Learned the differences between Dijkstra, Bellman-Ford, and Floyd-Warshall.
- Mastered Minimum Spanning Tree using Prim's and Kruskal's.
- Learned DSU and its optimizations.
- Learned SCC using Kosaraju and Tarjan.
- Learned Bridges and Articulation Points.
- Solved advanced Medium and Hard graph problems.
- Completed the core Advanced Graph Algorithms section.