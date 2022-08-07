// Adjascency List representation in Java

import java.util.*;

class Graph {

  // Add edge
  static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
    am.get(s).add(d);
  }



  public static void main(String[] args) {
    int[][] M = { { 0, 15, 14, 13 },
    { 12, 11, 10, 9 },
    { 8, 7, 6, 5 },
    { 4, 3, 2, 1 } };

    // Create the graph
    int N = M.length;
    int V = N * N;
    ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);

    for (int i = 0; i < V; i++){
      am.add(new ArrayList<Integer>());
    }
    // Add edges
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < 3; j++) 
            if (M[i][j] > 0){
    //addEdge(am, M[i][j], M[i-1][j]);
    addEdge(am, M[i][j], M[i][j+1]);

            }
            
        
    }
    printGraph(am);
  }

  // Print the graph
  static void printGraph(ArrayList<ArrayList<Integer>> am) {
    for (int i = 0; i < am.size(); i++) {
      System.out.println("\nVertex " + i + ":");
      for (int j = 0; j < am.get(i).size(); j++) {
        System.out.print(" -> " + am.get(i).get(j));
      }
      System.out.println();
    }
  }
}