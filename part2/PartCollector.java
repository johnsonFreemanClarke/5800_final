package com.finalExam.part2;

public class PartCollector extends Employee {
	
	public PartCollector() {
		authorityLevel = PART_COLLECTOR;
	}
	
	// This message corresponds to the highest chain of responsibility 
	@Override
	protected void write(String message) {
		System.out.println(message + " all parts have been gathered");
	}

}
