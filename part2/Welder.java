package com.finalExam.part2;

public class Welder extends Employee {

	public Welder() {
		authorityLevel = WELDER;
	}
	
	// Welder's messages are of the 2nd to last Chain of Responsibility
	@Override
	protected void write(String message) {
		System.out.println(message + " all parts have been welded together");
	}

}
