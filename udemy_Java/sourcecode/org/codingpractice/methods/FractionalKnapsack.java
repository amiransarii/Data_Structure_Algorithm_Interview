package org.codingpractice.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.codingpractice.entity.FractionalKnapsackItem;

public class FractionalKnapsack {
	
	static  int usedCapacity = 0;
	 static double totalValue = 0;
	
	 public static void knapSack(List<FractionalKnapsackItem> items, int capacity) {
	
		 //sort the items
		  items.sort((item1, item2) -> Double.compare(item2.getRatio(), item1.getRatio()));
		  
		  System.out.println();
		  System.out.println("Selected Items");
		  
		  
		  for(int i = 0 ; i < items.size() ; i++) {
			  FractionalKnapsackItem item = items.get(i);
			  if(usedCapacity + item.getWeight() < capacity) {
				  usedCapacity += item.getWeight();
				  System.out.println("Taken: "+item);
				  totalValue += item.getValue();
			  }
			  else {
				//else consume fractionally
				  int usedWeight = capacity - usedCapacity;
				  double value = item.getRatio() *usedWeight;
				  System.out.println("Taken: "+"item index = " + item.getIndex() + ",obtained value = " + value + ",used weight = " + usedWeight + ", ratio = " + item.getRatio()
					+ "]");
				  
				   usedCapacity += usedWeight;
				   totalValue +=  value;
			  }
			  
			  //if capacity is full then break
			    
				if(usedCapacity==capacity)
					break;  
		  }
		  
		  System.out.println("\nTotal value obtained: "+ totalValue);
		 
	 }

}
