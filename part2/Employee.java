package com.finalExam.part2;
/********************************************************************************************
 * Johnson Wei																				*
 * CS 5800																					*
 * Part II of the final: Implementing question #4 from the mid-term exam					*
 * Description: Employee class is provided for us from the exam.							*
 * Employee is the parent class of the other employees: 									*
 * 		PartCollector, Assembler, Welder, and Painter										*
 *******************************************************************************************/
public abstract class Employee {
	public static int PART_COLLECTOR = 4;
	public static int ASSEMBLER = 3;
	public static int WELDER = 2;
	public static int PAINTER = 1;
	
	protected int authorityLevel;
	protected Employee nextEmployee;
	
	public void setNextEmployee(Employee employee) {
		this.nextEmployee = employee;
	}
	
	// A recursive call that prints the calling object's write message and the following 
	// employees messages that follow from the nextEmployee reference.
	public void doWork(int authorityLevel, String message) {
		if(this.authorityLevel <= authorityLevel) {
			write(message);
		}
		if(nextEmployee != null) {
			nextEmployee.doWork(authorityLevel, message);
		}
	}
	
	// To be implemented by each subclass
	abstract protected void write(String message);
}
