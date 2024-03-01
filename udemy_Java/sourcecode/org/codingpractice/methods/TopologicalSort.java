package org.codingpractice.methods;

import java.util.ArrayList;
import java.util.Stack;

import org.codingpractice.entity.GraphNode;

public class TopologicalSort {
	private ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
	
	
	//constructor
	public TopologicalSort(ArrayList<GraphNode> nodeList) {
		this.nodeList = nodeList;
	}

	public void topologicalSort() {
		
		Stack<GraphNode> stack = new Stack<GraphNode>();
		
		for(GraphNode node : nodeList) {// if a node is unvisited then run topologicalSort on it
			
			if(!node.isVisited())
				topologicalVisit(node,stack);
			
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop().getName()+" ");
		}	
	}
	
	
	// Topological visit by a source node
	public void topologicalVisit(GraphNode node, Stack<GraphNode> stack) {
		
		for(GraphNode neighbor : node.getNeighbors()) {
			if(!neighbor.isVisited()){
				topologicalVisit(neighbor,stack);
			}
			
		}
		node.setVisited(true);
		stack.push(node);
		
		
	}
	
	
	// add a directed edge between two nodes
		public void addDirectedEdge(int i, int j) {
			GraphNode first = nodeList.get(i - 1);
			GraphNode second = nodeList.get(j - 1);
			first.getNeighbors().add(second);
		} // end of method
}
