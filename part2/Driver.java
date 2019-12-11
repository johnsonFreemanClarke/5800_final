package com.finalExam.part2;
 /*******************************************************************************************
 * Johnson Wei																				*
 * CS 5800																					*
 * Part II of the final																		*
 * Description: Implement problem #4 (Chain of Responsibility) of previous midterm exam.	*
 * The Driver class is used to compile an output demonstrating the Chain of Responsibility.	*
 * The doWork(...) method will recursively print the respective messages to the console 	*
 * until the very last authorityLevel is reached.											*																
 *******************************************************************************************/
public class Driver {
	
	public static void main(String[] args) {
		// An employee of each type will be instantiated to demonstrate the Chain of 
		// Responsibility (CoR)
		Employee partCollector = new PartCollector();
		Employee assembler = new Assembler();		
		Employee welder = new Welder();		
		Employee painter = new Painter();
		
		// Each employee can address another employee with a lesser authorityLevel to properly
		// demonstrate CoR.
		partCollector.setNextEmployee(assembler);
		assembler.setNextEmployee(welder);
		welder.setNextEmployee(painter);
		
		// Start the chain of responsibility process at the top authority level.
		// The initial employee doing the work will trigger cascading calls for other
		// employees with lower authorityLevels to also doWork.
		partCollector.doWork(Employee.PART_COLLECTOR, "Initiated from PartCollector");
		
		// Intended for the Employee object to doWork and calls its next lower-authorityLevel
		// colleague to also do its work. A higher level authorityLevel employee will not
		// trigger its doWork method if a lower-authorityLevel employee initiated the doWork
		// method.
		assembler.doWork(Employee.PART_COLLECTOR, "Originally from Assembler");
	}
}
