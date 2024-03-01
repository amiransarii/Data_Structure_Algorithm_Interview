package org.codingpractice.greedy;

import java.util.ArrayList;
import java.util.List;

import org.codingpractice.entity.GreedyActivity;
import org.codingpractice.methods.GreedyActivitySelection;

public class TestGreedyActivitySelectionMain {
	
	public static void main(String args[]) {
		List<GreedyActivity> activityList = new ArrayList<GreedyActivity>();
		
		//Insert activities in Arraylist
		activityList.add(new GreedyActivity("A1", 0, 6));
		activityList.add(new GreedyActivity("A2", 3, 4));
		activityList.add(new GreedyActivity("A3", 1, 2));
		activityList.add(new GreedyActivity("A4", 5, 8));
		activityList.add(new GreedyActivity("A5", 5, 7));
		activityList.add(new GreedyActivity("A6", 8, 9));
		
	   //pass the list to GreedyActivitySelection class and print
		GreedyActivitySelection greedy = new GreedyActivitySelection(activityList);
		
		
	
		
	}

}
