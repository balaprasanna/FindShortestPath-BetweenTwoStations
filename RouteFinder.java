/*
HOW TO RUN THIS PROGRAM ..
   
   To Compile:
   javac RouteFinder.java

   To Run:
   cat stations-info.txt | java RouteFinder A E
   
   Sample Output :
   A -> B(3) -> C(10) -> E(13)

NOTE : 
   provide an input file named , "stations-info.txt" 
   file name doesnt matters
   Internal DataStructure Used is a Graph ,
   and to find shortest path , i have used dijkstra algorithm to find the shortest path
*/

import java.io.*;
import java.util.*;
 
public class RouteFinder {
 
   public static void main(String[] args) {
    
    String source = "A"; String destination = "E";
    if(args.length > 1) {
      source = args[0];  destination = args[1];
    }
	 
    Scanner sc = new Scanner(System.in);
    int stations = sc.nextInt();
    int noOfRoutes = sc.nextInt();

    Graph.Edge[] routes = new Graph.Edge[noOfRoutes];
    for(int i=0; i<noOfRoutes; i++){
    	routes[i] = new Graph.Edge(sc.next(), sc.next(), sc.nextInt());
    }
 
    Graph g = new Graph(routes);
    g.findBestRoute(source,destination);

   }
}
