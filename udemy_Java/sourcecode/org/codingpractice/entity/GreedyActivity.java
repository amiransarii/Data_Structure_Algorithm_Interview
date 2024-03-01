package org.codingpractice.entity;

public class GreedyActivity {
	
	private String name; // name of the activity
	
	private long startTime ;// start time of the activity
	private long finishTime; //finish time of the activity
	
	
	//default constuctor
	public GreedyActivity() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getFinishTime() {
		return finishTime;
	}

	public void setFinishTime(long finishTime) {
		this.finishTime = finishTime;
	}

	
	
	public GreedyActivity(String name, long startTime, long finishTime) {
		super();
		this.name = name;
		this.startTime = startTime;
		this.finishTime = finishTime;
	}
	
	@Override
	public String toString() {
		return "GreedyActivity [name=" + name + ", startTime=" + startTime + ", finishTime=" + finishTime + "]";
	}


	

}
