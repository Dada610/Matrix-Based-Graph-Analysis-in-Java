# Matrix-Based-Graph-Analysis-in-Java


This project is a Java application that analyzes a graph represented by an adjacency matrix. The program checks various properties of the graph, such as reflexivity, symmetry, transitivity, acyclic nature, connectivity, and the presence of an Eulerian path.

## Prerequisites

- Java Development Kit (JDK) 8 or higher

## Setup Instructions

1. **Clone the Repository:**

   ```sh
   git clone https://github.com/your-username/graph-properties-analyzer.git
   cd graph-properties-analyzer
Compile the Java Code:

sh
Copy code
javac Main.java
Run the Program:

sh
Copy code
java Main
Usage
The program will prompt you to enter the number of vertices in the graph.
You will then enter the adjacency matrix of the graph, element by element.
The program will analyze the matrix and display the results for the following properties:
Reflexivity
Symmetry
Transitivity
Acyclic nature
Connectivity
Eulerian path presence
Code Overview
Main Class:

The entry point of the program. It handles user input and calls methods to check various properties of the graph.

reflex Method:

Checks if the matrix is reflexive. A matrix is reflexive if all diagonal elements are 1.

symmetric Method:

Checks if the matrix is symmetric. A matrix is symmetric if a[i][j] == a[j][i] for all i and j.

transitive Method:

Checks if the matrix is transitive. A matrix is transitive if for all i, j, k, a[i][j] == 1 and a[j][k] == 1 implies a[i][k] == 1.

acyclic Method:

Checks if the matrix represents an acyclic graph. A graph is acyclic if it has no cycles.

connect Method:

Checks if the matrix represents a connected graph. A graph is connected if there is a path between any two vertices.

eulerian Method:

Checks if the matrix represents a graph with an Eulerian path. An Eulerian path exists in a graph if it has exactly zero or two vertices with an odd degree.

Example
perl
Copy code
Enter no. of vertex
4
enter index no. 1 1
0
enter index no. 1 2
1
enter index no. 1 3
0
enter index no. 1 4
1
enter index no. 2 1
1
enter index no. 2 2
0
enter index no. 2 3
1
enter index no. 2 4
0
enter index no. 3 1
0
enter index no. 3 2
1
enter index no. 3 3
0
enter index no. 3 4
1
enter index no. 4 1
1
enter index no. 4 2
0
enter index no. 4 3
1
enter index no. 4 4
0
matrix is not reflexive
matrix is not symmetric
matrix is transitive
matrix is not acyclic
matrix is not connected
matrix does not have eulerian path
