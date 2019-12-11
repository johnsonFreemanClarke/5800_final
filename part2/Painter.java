package com.finalExam.part2;

public class Painter extends Employee {

	public Painter() {
		authorityLevel = PAINTER;
	}
	// Painter's messages correspond to the last chain of responsibility 
	@Override
	protected void write(String message) {
		System.out.println(message + " car complete");
	}

}
