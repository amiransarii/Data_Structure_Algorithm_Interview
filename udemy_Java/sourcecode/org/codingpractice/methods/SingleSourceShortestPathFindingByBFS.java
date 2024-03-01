package org.codingpractice.methods;

import java.util.ArrayList;
import java.util.LinkedList;

import org.codingpractice.entity.GraphNode;

public class SingleSourceShortestPathFindingByBFS {
	
	private ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	
	
	//constructor
	public SingleSourceShortestPathFindingByBFS(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}
	
	
	//Print path of each of the vertex from source
		public static void pathPrint(GraphNode node) {
			if(node.getParent()!=null)
				pathPrint(node.getParent());  //recursive call to parent
			System.out.print(node+" ");
		}//end of method
		
		
		
		//BFS Traversal by a source node
		public void BFSForSSSP(GraphNode node) {
			LinkedList<GraphNode>queue = new LinkedList<>();
			queue.add(node);  //add source node to queue
			while(!queue.isEmpty()) {
				GraphNode presentNode = queue.remove(0);
				presentNode.setVisited(true);
				System.out.print("Printing path for node "+presentNode.getName()+": ");
				pathPrint(presentNode);
				System.out.println();
				for(GraphNode neighbor: presentNode.getNeighbors()) {  //for each neighbor of present node
					if(!neighbor.isVisited()) {
						queue.add(neighbor);
						neighbor.setVisited(true);
						neighbor.setParent(presentNode);
					}//end of if
				}//end of for loop
			}//end of while loop
		}//end of method
		
		
		
		// add an undirected edge between two nodes
		public void addUndirectedEdge(int i, int j) {
			GraphNode first = nodeList.get(i);
			GraphNode second = nodeList.get(j);
			first.getNeighbors().add(second);
			second.getNeighbors().add(first);
		}//end of method
		
}
