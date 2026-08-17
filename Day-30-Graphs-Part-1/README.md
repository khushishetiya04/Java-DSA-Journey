# 📅 Day 30 - Graph Basics

## 📌 Topics Covered

- Graph
- Graph Terminology
- Vertices and Edges
- Directed Graph
- Undirected Graph
- Weighted Graph
- Unweighted Graph
- Adjacency List
- Adjacency Matrix
- Edge List
- Degree
- Indegree
- Outdegree
- Graph Representation
- Graph Construction
- Basic Graph Traversal Understanding

---

# 📖 Concepts Covered

- Understanding the basic structure of a graph.
- Understanding vertices and edges.
- Difference between directed and undirected graphs.
- Difference between weighted and unweighted graphs.
- Representing graphs using an Adjacency List.
- Representing graphs using an Adjacency Matrix.
- Representing graphs using an Edge List.
- Understanding degree of a vertex.
- Understanding indegree and outdegree.
- Creating graphs in Java.
- Storing and accessing graph connections efficiently.
- Understanding which graph representation to use for different problems.

---

# 💻 Basics

- Graph Implementation
- Adjacency List
- Adjacency Matrix
- Edge List

---

# 🧩 LeetCode / Interview Problems

| Problem No. | Problem Name                                           | Pattern                  | Difficulty 
| ----------- | -------------------------------------------------------| -------------------------| ---------- 
| 1791        | Find Center of Star Graph                              | Graph Degree             | Easy 
| 0997        | Find the Town Judge                                    | Indegree / Outdegree     | Easy 
| 1042        | Flower Planting With No Adjacent                       | Graph + Coloring         | Easy  
| 1436        | Destination City                                       | Directed Graph + HashSet | Easy 
| 1466        | Reorder Routes to Make All Paths Lead to the City Zero | Directed Graph + Edges   | Medium 
  
---

# 🔹 Graph Representation

| Representation   | Space    | Edge Lookup | Best Used For |
| -----------------|----------| ----------- | ------------- |
| Adjacency Matrix | O(V²)    | O(1)        | Dense Graphs |
| Adjacency List   | O(V + E) | O(degree)   | Sparse Graphs |
| Edge List        | O(E)     | O(E)        | Edge-based Algorithms |

> `V` = number of vertices and `E` = number of edges.

---

# 🔹 Graph Complexity

| Operation          | Adjacency List | Adjacency Matrix 
| -------------------|----------------|---------------- 
| Add Edge           | O(1)           | O(1) 
| Check Edge         | O(degree)      | O(1) 
| Find All Neighbors | O(degree)      | O(V) 
| Space              | O(V + E)       | O(V²) 

---

# 🎯 Key Learnings

- Learned the fundamentals of Graph data structures.
- Understood vertices and edges.
- Learned directed and undirected graphs.
- Learned weighted and unweighted graphs.
- Implemented graphs using different representations.
- Implemented Adjacency List.
- Implemented Adjacency Matrix.
- Implemented Edge List.
- Understood degree, indegree, and outdegree.
- Learned how graph representation affects time and space complexity.
- Solved basic graph relationship and degree problems.

---

# 🔥 Important Patterns

- **Graph Representation** → Store graph connections using Adjacency List, Matrix, or Edge List.
- **Degree Pattern** → Count the number of edges connected to each vertex.
- **Indegree / Outdegree** → Count incoming and outgoing edges in a directed graph.
- **HashSet Graph Pattern** → Store visited/remaining destinations or relationships efficiently.
- **Graph Coloring Pattern** → Assign colors while ensuring adjacent vertices follow the required constraints.
- **Directed Edge Reversal Pattern** → Track edge direction to determine which connections need to be reversed.

---

# 📈 Progress

## Basics (4)

- Graph
- Adjacency List
- Adjacency Matrix
- Edge List

## LeetCode / Interview Problems (5)

- 1791. Find Center of Star Graph
- 997. Find the Town Judge
- 1042. Flower Planting With No Adjacent
- 1436. Destination City
- 1466. Reorder Routes to Make All Paths Lead to the City Zero

### ✅ Total Concepts & Problems Covered: **9**

---

# 🎉 Day 30 Summary

- Learned Graph fundamentals and terminology.
- Learned different graph representations.
- Implemented Adjacency List, Adjacency Matrix, and Edge List.
- Understood directed and undirected graphs.
- Learned degree, indegree, and outdegree.
- Practiced graph coloring and directed-edge problems.
- Built a strong foundation for BFS and DFS.
- Ready to move to **Day 31 - BFS & DFS**.