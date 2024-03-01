package org.codingpractice.binarytree;

import org.codingpractice.methods.BinaryTreeByArray;

public class TestBinaryTreeByArrayMain {
	
	public static void main(String args[]) {
		
		//Create a blank array to store Binary Tree
		System.out.println("Creating a blank Array to store Binary Tree...");
		BinaryTreeByArray tree = new BinaryTreeByArray(10);
		
		//insert 10 values
		System.out.println("Inserting 10 values in Tree...");
		for(int i = 1; i <= 10; i++) {
			tree.insert(i*10);
		}
		
		//level order Traversal
		System.out.println("\nLevel-Order Traversal");
		tree.levelOrder();
		
		//preorder traversal
		System.out.println("\n\nPreOrder Traversal");
		tree.preOrder(1);
		
		//post order traversal
		System.out.println("\n\nPostOrder Traversal");
		tree.postOrder(1);
		
		 //in order traversal
		System.out.println("\n\nInOrder Traversal");
		tree.inOrder(1);
		
		//search for value in tree
		System.out.println("\n\nSearching value 500 in the tree...");
		tree.search(500);
		
		//Search for value in Tree
	    System.out.println("Searching value 40 in the tree...");
		tree.search(40);
		
		//Delete value from Tree
		 System.out.println("\nDeleting node 500 from the tree...");
		 tree.delete(500);
		 
		//Delete value from Tree
			System.out.println("Deleting node 40 from the tree...");
			tree.delete(40);
			
			
			//Level order Traverse
			System.out.println("\nLevel-order Traversal:");
			tree.levelOrder();
			
			
			//Delete the entire Tree
			System.out.println("\n\nDeleting the entire Tree...");
			tree.deleteTree();
				
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
