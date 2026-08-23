# 📅 Day 32 - Advanced Graph Algorithms

## 📌 Topics Covered

- Cycle Detection in Undirected Graph
- Cycle Detection using BFS
- Cycle Detection using DFS
- Cycle Detection in Directed Graph
- Topological Sort
- Topological Sort using DFS
- Kahn's Algorithm
- Shortest Path Algorithms
- Dijkstra's Algorithm
- Bellman-Ford Algorithm
- Floyd-Warshall Algorithm
- Minimum Spanning Tree
- Prim's Algorithm
- Kruskal's Algorithm
- Disjoint Set Union (DSU)
- Union-Find
- Path Compression
- Union by Rank
- Union by Size
- Strongly Connected Components
- Kosaraju's Algorithm
- Tarjan's Algorithm
- Bridges in Graph
- Articulation Points

---

# 📖 Concepts Covered

- Detecting cycles in undirected graphs using BFS and DFS.
- Detecting cycles in directed graphs using DFS and recursion stack.
- Understanding DAG (Directed Acyclic Graph).
- Performing Topological Sort using DFS.
- Performing Topological Sort using Kahn's Algorithm.
- Detecting cycles using Topological Sort.
- Finding shortest paths in unweighted graphs using BFS.
- Finding shortest paths with non-negative weights using Dijkstra.
- Finding shortest paths when negative edge weights exist using Bellman-Ford.
- Finding shortest paths between every pair of vertices using Floyd-Warshall.
- Understanding Minimum Spanning Trees.
- Building MST using Prim's Algorithm.
- Building MST using Kruskal's Algorithm.
- Understanding Disjoint Set Union.
- Implementing Find and Union operations.
- Using Path Compression.
- Using Union by Rank and Union by Size.
- Finding Strongly Connected Components.
- Finding SCCs using Kosaraju's Algorithm.
- Finding SCCs using Tarjan's Algorithm.
- Finding Bridges using Tarjan's low-link concept.
- Finding Articulation Points using DFS and low-link values.

---

# 💻 Basics

- Cycle Detection using BFS
- Cycle Detection using DFS
- Directed Cycle Detection
- Topological Sort using DFS
- Kahn's Algorithm
- Dijkstra's Algorithm
- Bellman-Ford Algorithm
- Floyd-Warshall Algorithm
- Prim's Algorithm
- Kruskal's Algorithm
- DSU / Union-Find
- Kosaraju's Algorithm
- Tarjan's Algorithm
- Bridges
- Articulation Points

---

# 🧩 LeetCode / Interview Problems

| Problem No. | Problem Name | Pattern | Difficulty |
| ----------- | ---------------------------------------------- | ------------------------------ | ---------- |
| 207 | Course Schedule | Topological Sort / Cycle Detection | Medium |
| 210 | Course Schedule II | Topological Sort | Medium |
| 802 | Find Eventual Safe States | DFS / Topological Sort | Medium |
| 310 | Minimum Height Trees | Topological Sort / BFS | Medium |
| 743 | Network Delay Time | Dijkstra | Medium |
| 787 | Cheapest Flights Within K Stops | Bellman-Ford / BFS | Medium |
| 1631 | Path With Minimum Effort | Dijkstra / Binary Search | Medium |
| 1584 | Min Cost to Connect All Points | MST / Prim / Kruskal | Medium |
| 684 | Redundant Connection | DSU | Medium |
| 1319 | Number of Operations to Make Network Connected | DSU / Components | Medium |
| 721 | Accounts Merge | DSU | Medium |
| 1192 | Critical Connections in a Network | Bridges / Tarjan | Hard |
| 1489 | Find Critical and Pseudo-Critical Edges in MST | MST / DSU | Hard |
| 399 | Evaluate Division | Graph / DFS | Medium |

---

# 🔹 Algorithm Complexity

| Algorithm | Time Complexity | Space Complexity |
| --------- | --------------- | ---------------- |
| Cycle Detection BFS | O(V + E) | O(V) |
| Cycle Detection DFS | O(V + E) | O(V) |
| Topological Sort DFS | O(V + E) | O(V) |
| Kahn's Algorithm | O(V + E) | O(V) |
| Dijkstra | O((V + E) log V) | O(V + E) |
| Bellman-Ford | O(V × E) | O(V) |
| Floyd-Warshall | O(V³) | O(V²) |
| Prim's Algorithm | O((V + E) log V) | O(V + E) |
| Kruskal's Algorithm | O(E log E) | O(V + E) |
| DSU | O(α(V)) per operation | O(V) |
| Kosaraju | O(V + E) | O(V + E) |
| Tarjan SCC | O(V + E) | O(V) |
| Bridges | O(V + E) | O(V) |
| Articulation Points | O(V + E) | O(V) |

> `V` = number of vertices, `E` = number of edges.

---

# 🔥 Important Patterns

- **Cycle Detection — Undirected BFS** → Store `(node, parent)` while traversing.
- **Cycle Detection — Undirected DFS** → Track the parent node during recursion.
- **Cycle Detection — Directed DFS** → Use `visited[]` and `pathVisited[]`.
- **Topological Sort — DFS** → Add nodes after processing all dependencies.
- **Kahn's Algorithm** → Use indegree + queue.
- **Dijkstra** → Min PriorityQueue + relaxation; works with non-negative weights.
- **Bellman-Ford** → Relax every edge `V - 1` times; handles negative weights.
- **Floyd-Warshall** → Dynamic programming over intermediate vertices.
- **Prim's Algorithm** → Expand MST using the minimum-cost edge.
- **Kruskal's Algorithm** → Sort edges and use DSU to avoid cycles.
- **DSU** → Efficiently maintain connected components.
- **Kosaraju** → DFS ordering + transpose graph + DFS.
- **Tarjan SCC** → DFS + discovery time + low-link value.
- **Bridges** → Edge is a bridge when `low[v] > tin[u]`.
- **Articulation Point** → Vertex whose removal increases the number of components.

---

# 🎯 Key Learnings

- Learned multiple methods for cycle detection.
- Mastered Topological Sort using DFS and Kahn's Algorithm.
- Learned shortest-path algorithms and when to use each one.
- Understood the limitations of Dijkstra with negative weights.
- Learned Bellman-Ford for negative edge weights.
- Learned Floyd-Warshall for all-pairs shortest paths.
- Mastered Minimum Spanning Tree concepts.
- Implemented Prim's and Kruskal's algorithms.
- Learned DSU with path compression and union optimization.
- Learned Strongly Connected Components.
- Implemented Kosaraju and Tarjan approaches.
- Learned how discovery time and low-link values work.
- Solved graph problems involving MST, SCC, bridges, and articulation points.

---

# 📈 Progress

## Algorithms

- Cycle Detection — Undirected BFS
- Cycle Detection — Undirected DFS
- Cycle Detection — Directed DFS
- Topological Sort — DFS
- Kahn's Algorithm
- Dijkstra
- Bellman-Ford
- Floyd-Warshall
- Prim
- Kruskal
- DSU
- Kosaraju
- Tarjan
- Bridges
- Articulation Points

## LeetCode / Interview Problems

- 207. Course Schedule
- 210. Course Schedule II
- 802. Find Eventual Safe States
- 310. Minimum Height Trees
- 743. Network Delay Time
- 787. Cheapest Flights Within K Stops
- 1631. Path With Minimum Effort
- 1584. Min Cost to Connect All Points
- 684. Redundant Connection
- 1319. Number of Operations to Make Network Connected
- 721. Accounts Merge
- 1192. Critical Connections in a Network
- 1489. Find Critical and Pseudo-Critical Edges in MST
- 399. Evaluate Division

### ✅ Total Algorithms Covered: **15**

### ✅ Total LeetCode / Interview Problems: **14**

---

# 🎉 Day 32 Summary

- Mastered advanced Graph algorithms.
- Learned cycle detection in directed and undirected graphs.
- Mastered Topological Sort and Kahn's Algorithm.
- Learned Dijkstra, Bellman-Ford, and Floyd-Warshall.
- Mastered Prim's and Kruskal's MST algorithms.
- Learned DSU / Union-Find with optimizations.
- Learned Kosaraju and Tarjan for SCC.
- Learned Bridges and Articulation Points.
- Built the foundation required for advanced graph interview problems.