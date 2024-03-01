package org.codingpractice.methods;

import java.util.ArrayList;
import java.util.LinkedList;

import org.codingpractice.entity.GraphNode;

public class BFSByAdjacencyMatrix {
	
	private ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	int[][] adjacenyMatrix;
	
	//Constructor
	public BFSByAdjacencyMatrix(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
		adjacenyMatrix = new int[nodeList.size()][nodeList.size()];
	}
	
	//Bfs algorithim
	public void bfs() {//if a node is unvisited then run bfs on it
		for(GraphNode node : nodeList) {		
			if(!node.isVisited())
				bfsVisit(node);			
		}		
	}
	
	//BFS internal method
	 public void bfsVisit(GraphNode node) {
		 
		 LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
		 queue.add(node);
		 
		 while(!queue.isEmpty()) {
			 GraphNode presentNode = queue.remove();
			 presentNode.setVisited(true);
			 System.out.print(presentNode.getName()+" ");
			 
			 ArrayList<GraphNode> neighbours = getNeighbors(presentNode);		 
			 for(GraphNode neighbor : neighbours) {			  
				 if(!neighbor.isVisited()) {
					 queue.add(neighbor);
					 neighbor.setVisited(true);
				 }
			 }
		 }
	 }
	 
	 
	// get all neighbors of a particular node by checking adjacency matrix and add it to neighbours arraylist
	 
	 public ArrayList<GraphNode> getNeighbors(GraphNode node) {
		 
		 ArrayList<GraphNode> neighbors = new ArrayList<GraphNode>();
		 
		//gets row# to search in node index
		 int nodeIndex = node.getIndex();
		 
		 for(int i = 0 ;  i < adjacenyMatrix.length; i++) {

			//if a column has 1 in that row then there is a neighbor and add it to list
			 if(adjacenyMatrix[nodeIndex][i] == 1) {
				 neighbors.add(nodeList.get(i));
			 }
			 
			 
		 }
		 return neighbors;
	 }
	 
	 
	// add an undirected edge between two nodes
	 public void addUndirectedEdge(int i, int j) {
		//decrement i, j for array indexes
			i--;
			j--;
			adjacenyMatrix[i][j] = 1;
			adjacenyMatrix[j][i] = 1;
		 
	 }

}
