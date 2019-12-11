package com.finalExam.part2;

public class Assembler extends Employee {

	public Assembler() {
		authorityLevel = ASSEMBLER;
	}
	
	// Assembler's messages correspond to the 2nd highest Chain of Responsibility
	@Override
	protected void write(String message) {
		System.out.println(message + " all parts have been put together");
	}

}
