package org.codingpractice.graph;

import java.util.ArrayList;

import org.codingpractice.entity.WeightedNode;
import org.codingpractice.methods.DisjointSet;

public class TestDisjointSetMain {

	public static void main(String[] args) {
		
		// Constructor for ArrayList
		ArrayList<WeightedNode> nodeList = new ArrayList<>();

		// create 10 nodes: 1-10
		for (int i = 0; i < 10; i++) {
			nodeList.add(new WeightedNode("" + (char) (65 + i)));
		}

		// Calling DisjointSet
		DisjointSet.driver(nodeList);

	}// end of method
}