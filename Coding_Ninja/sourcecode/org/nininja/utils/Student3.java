package org.nininja.utils;

public class Student3 {
	public String name;
	private int rollNumber;
	
	public Student3() {
		rollNumber = 100;
	}
	
	public Student3(String n) {
		name  = n;
		rollNumber = 100;
	}
	
	public Student3(String n, int rn) {
		name = n;
		rollNumber = rn;
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
	
	public void print() {
		System.out.println(name + " : " + rollNumber);
	}
	
}
