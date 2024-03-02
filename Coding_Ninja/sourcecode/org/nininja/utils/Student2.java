package org.nininja.utils;

public class Student2 {
	private String name;
	private int rollNumber;
	
	public Student2() {
		
	}
	
	public void setRollnumber(int rn) {
		if (rn <= 0) {
			return;
		}
		rollNumber = rn;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
}
