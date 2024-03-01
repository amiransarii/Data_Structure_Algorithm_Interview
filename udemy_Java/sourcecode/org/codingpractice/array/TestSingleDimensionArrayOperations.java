package org.codingpractice.array;

import org.codingpractice.methods.SingleDimensionArrayOperation;

public class TestSingleDimensionArrayOperations {
public static void main(String[] args) {
		
		
		System.out.println("Creating a blank array of size 10...");
		SingleDimensionArrayOperation sda = new SingleDimensionArrayOperation(10);
		
        
        System.out.println("Printing the Array...");
		sda.traverseArray();
		System.out.println();System.out.println();
        
		
		System.out.println("Inserting few values in the array...");
		sda.insertValue(0,0);
		sda.insertValue(1,10);
		sda.insertValue(2,20);
		sda.insertValue(3,30);
		sda.insertValue(4,40);
		sda.insertValue(5,50);
		sda.insertValue(6,60);
		sda.insertValue(7,70);
		sda.insertValue(8,80);
		sda.insertValue(1,100);
		sda.insertValue(12,120);
		System.out.println();System.out.println();
		
		
		System.out.println("Printing the Array...");
		sda.traverseArray();
		System.out.println();System.out.println();
		
		
		
		System.out.println("Accessing cell number#1...");
		sda.accessingCellValue(1);
		System.out.println();System.out.println();
		
		
		System.out.println("Accessing cell number#5...");
		sda.accessingCellValue(5);
		System.out.println();System.out.println();
		
		
		System.out.println("Accessing cell number#15...");
		sda.accessingCellValue(15);
		System.out.println();System.out.println();
		
		
		System.out.println("Searching 30 in the array...");
		sda.searchInArray(30);
		System.out.println();System.out.println();
		
		
		System.out.println("Searching 400 in the array...");
		sda.searchInArray(400);
		System.out.println();System.out.println();
		
		
		
		System.out.println("Deleting value from Cell#3 of array...");
		System.out.println("Before Deleting: ");
		sda.traverseArray();
		sda.deleteValueFromArray(3);
		System.out.println();
		System.out.println("After Deleting: ");
		sda.traverseArray();
		System.out.println();System.out.println();System.out.println();
		
		
		System.out.println("Deleting value from Cell#15 of array...");
		System.out.println("Before Deleting: ");
		sda.traverseArray();
		sda.deleteValueFromArray(15);
		System.out.println("After Deleting: ");
		sda.traverseArray();
		System.out.println();System.out.println();System.out.println();
		
		
		
		sda.deleteEntireArray();
		System.out.println("After Deleting: ");
		sda.traverseArray();
		
				
	}//end of Main method

}
