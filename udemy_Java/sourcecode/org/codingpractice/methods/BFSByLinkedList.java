package org.codingpractice.methods;

import java.util.ArrayList;
import java.util.LinkedList;

import org.codingpractice.entity.GraphNode;

public class BFSByLinkedList {
	
	private ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	
	//constructor
	public BFSByLinkedList(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}
	
	//bfs algo
	public void bfs() {
		
		//if a node is unvisited then run bfs on it
		for(GraphNode node : nodeList) {			
			if(!node.isVisited())
				bfsVisit(node);			
		}
	}
	
	     //BFS internal method
	     void bfsVisit(GraphNode node) {
		    LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
		    queue.add(node);//add source node to queue
		    
		    while(!queue.isEmpty()) {
		    	
		    	GraphNode presentNode = queue.remove();
		    	presentNode.setVisited(true);
		    	System.out.print(presentNode.getName()+" ");
		    	
		    	for(GraphNode  neighbor : presentNode.getNeighbors()) {
		    		if(!neighbor.isVisited()) {
		    			queue.add(neighbor);
		    			neighbor.setVisited(true);
		    		}
		    	}	    	
		    	
		    }
		   
	     }
	     
	     //add an undirected edge between two nodes
	     public void  addUndirectedEdge(int i, int j) {
	    	 GraphNode first = nodeList.get(i -1);
	    	 GraphNode second = nodeList.get(j -1);
	    	 first.getNeighbors().add(second);//Neighbour of first is second. Store it.
	 		second.getNeighbors().add(first);//Neighbour of second is first. Store it.
	    	 
	     }

}
