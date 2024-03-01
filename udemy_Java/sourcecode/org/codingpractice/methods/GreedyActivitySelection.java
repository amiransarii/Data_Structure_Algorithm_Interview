package org.codingpractice.methods;

import java.util.List;

import org.codingpractice.entity.GreedyActivity;

public class GreedyActivitySelection {
	
	
	public GreedyActivitySelection(List<GreedyActivity> activityList) {
		System.out.println("User provided Schedule:");
		
		activityList.forEach(activity ->{
			System.out.println(activity.getName() +"  " + activity.getStartTime() +" "+activity.getFinishTime());;
		});
		
	  
		//sort the list based on finish time
		 activityList.sort((o1, o2) -> Long.compare(o1.getFinishTime(), o2.getFinishTime()));
		
		 System.out.println();
		 System.out.println("After Sorting Based on Finish Time");
			activityList.forEach(activity ->{
				System.out.println(activity.getName() +"  " + activity.getStartTime() +" "+activity.getFinishTime());;
			});
		
			
			 System.out.println();
			 //now choose first activity which is already sorted
			GreedyActivity firstActivity = activityList.get(0);
			System.out.println("Activity Selected by User 1");
			System.out.println(firstActivity.getName() +" "+ firstActivity.getStartTime() +" "+firstActivity.getFinishTime());
			
			//now iterate all other activities
			
			for(int i = 1; i < activityList.size() ; i++) {
				
			 GreedyActivity activity = activityList.get(i);
				
			 if(activity.getStartTime() >=  firstActivity.getFinishTime()) {	 
				 System.out.println(activity.getName() +" "+ activity.getStartTime() +" "+activity.getFinishTime());
				 
				 //now replace first activity 
				 firstActivity = activity;
			 }
				
				
			}
			
			
			System.out.println();
			System.out.println("Activity Selected by User 2");
			
			
			GreedyActivity previousActivity = activityList.get(0);
			System.out.println(previousActivity.getName() +" "+ previousActivity.getStartTime() +" "+previousActivity.getFinishTime());
		
		
			
			//For each job
			for (int i = 1; i < activityList.size() ; i++) {
				GreedyActivity activity = activityList.get(i);
				//if job's start time is greater than equal previous job's finish time then print job
				if (activity.getStartTime() >= previousActivity.getFinishTime()) {
					 System.out.println(activity.getName() +" "+ activity.getStartTime() +" "+activity.getFinishTime());

					//System.out.println(activity);
					previousActivity = activity;
				}
			}//end of loop
			

	}
	
	
	
	 

}
